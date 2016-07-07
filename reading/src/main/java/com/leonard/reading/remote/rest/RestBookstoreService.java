package com.leonard.reading.remote.rest;

import com.google.common.collect.Lists;
import com.leonard.reading.remote.BookstoreService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by Leonard on 2016/7/7.
 */
@Service
public class RestBookstoreService implements BookstoreService {

    @Autowired(required = false)
    @LoadBalanced
    private RestTemplate loadBalanced;

    @Override
    @HystrixCommand(fallbackMethod = "reliable")
    public List<String> readingList() {
        URI uri = URI.create("http://bookstore-service/recommended");
        ParameterizedTypeReference<List<String>> reference = new ParameterizedTypeReference<List<String>>() {
        };
        ResponseEntity<List<String>> responseEntity = this.loadBalanced.exchange(uri, HttpMethod.GET, null, reference);
        return responseEntity.getBody();
    }

    public List<String> reliable() {
        List<String> bookList = Lists.newArrayList();
        bookList.add("Cloud Native Java (O'Reilly)");
        return bookList;
    }
}
