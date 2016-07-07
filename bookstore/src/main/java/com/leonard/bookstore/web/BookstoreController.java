package com.leonard.bookstore.web;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by Leonard on 2016/7/7.
 */
@RestController
public class BookstoreController {

    @RequestMapping(value = "/recommended")
    public List<String> readingList(){
        List<String> bookList = Lists.newArrayList();
        bookList.add("Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)");
        return bookList;
    }
}
