package com.magrabbit.xpath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.magrabbit.xpath.model.Webpage;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

public interface WebpageRepository extends JpaRepository<Webpage, Long> {

    Optional<Webpage> findTopByUrlAndDateBeforeOrderByDateDesc(String url, Date date);
}
