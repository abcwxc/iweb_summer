package com.iweb.test.controller;

import com.iweb.test.pojo.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang
 * @date 2023/6/11 15:27
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "hello springboot";
    }

    @RequestMapping("/get")
    public Category get(){
        return new Category(1,"aba");
    }

    @RequestMapping("/getCs")
    public List<Category> getCs(){
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1,"avc"));
        categories.add(new Category(2,"qwd"));
        categories.add(new Category(3,"poi"));
        return categories;
    }
}
