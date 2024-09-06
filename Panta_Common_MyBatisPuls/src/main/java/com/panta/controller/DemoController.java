package com.panta.controller;

import com.panta.mapper.PantaLinkMapper;
import com.panta.model.PantaLink;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class DemoController {

    @Resource
    private PantaLinkMapper pantLinkMapper;


    @PostMapping("/saveData")
    public String saveData(@RequestParam(value = "name") String name){
        System.out.println(name);
        pantLinkMapper.insert(new PantaLink());
        return "okk";
    }

}
