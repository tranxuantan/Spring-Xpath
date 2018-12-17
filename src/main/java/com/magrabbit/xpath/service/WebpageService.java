package com.magrabbit.xpath.service;

import com.magrabbit.xpath.model.Webpage;

import java.util.Date;
import java.util.Optional;

public interface WebpageService {

    Webpage create(Webpage entity);
    Optional<Webpage> findWebpageByUrlAndDateOrderByDateDescLimitOne(String url, Date date);
}
