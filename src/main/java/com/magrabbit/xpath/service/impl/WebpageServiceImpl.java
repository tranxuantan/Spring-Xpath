package com.magrabbit.xpath.service.impl;

import com.magrabbit.xpath.model.Webpage;
import com.magrabbit.xpath.repository.WebpageRepository;
import com.magrabbit.xpath.service.WebpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class WebpageServiceImpl implements WebpageService {

    @Autowired
    private WebpageRepository webpageRepository;

    @Override
    public Webpage create(Webpage entity) {
        if (entity.getId() != 0) return null;
        return webpageRepository.save(entity);
    }

    @Override
    public Optional<Webpage> findWebpageByUrlAndDateOrderByDateDescLimitOne(String url, Date date) {
        return webpageRepository.findTopByUrlAndDateBeforeOrderByDateDesc(url, date);
    }
}
