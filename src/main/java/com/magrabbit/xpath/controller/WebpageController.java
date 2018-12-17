package com.magrabbit.xpath.controller;

import com.magrabbit.xpath.model.Webpage;
import com.magrabbit.xpath.service.WebpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/webpage")
public class WebpageController {

    @Autowired
    private WebpageService webpageService;

    @GetMapping
    public boolean getAttachment(){
        webpageService.findWebpageByUrlAndDateOrderByDateDescLimitOne("abc", new Date());
        return true;
    }
}
