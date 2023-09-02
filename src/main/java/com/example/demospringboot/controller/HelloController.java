package com.example.demospringboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller: dùng khi link trả ra giao diện
 * @Responsebody: trả ra chuỗi cho @controller
 * @RestController: dùng khi link trả ra chuỗi
 *      /hello, /hello/detail
 *Một hàm sẽ xử lý logic cho một đường dẫn
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        return "Hello spring boot";
    }

    @GetMapping("/detail")
    public String helloDetail(){
        return "Hello detail";
    }
}