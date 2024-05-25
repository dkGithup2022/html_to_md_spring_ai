package com.dk0124.html_to_md_converter.http;

import org.springframework.stereotype.Component;

@Component
public interface HttpClient {

    public ScrappingContent call(String url);


}
