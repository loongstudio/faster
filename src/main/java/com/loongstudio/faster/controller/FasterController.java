package com.loongstudio.faster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FasterController
 *
 * @author KunLong-Luo
 * @version 1.0.0
 * @since 2023/8/13 7:19
 */
@RestController
public class FasterController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
