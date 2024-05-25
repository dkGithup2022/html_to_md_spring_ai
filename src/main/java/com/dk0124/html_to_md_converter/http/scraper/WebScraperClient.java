package com.dk0124.html_to_md_converter.http.scraper;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "webScraper",  configuration = WebScraperClientConfig.class)
public interface WebScraperClient {

    @GetMapping
    String scrape(@Param("url") String url);
}