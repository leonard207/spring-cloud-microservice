package com.leonard.reading.web;

import com.leonard.reading.remote.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by Leonard on 2016/7/7.
 */
@RestController
public class ReadingController {

    @Autowired
    private BookstoreService bookstoreService;

    @RequestMapping("/to-read")
    public List<String> toRead() {
        return bookstoreService.readingList();
    }

}
