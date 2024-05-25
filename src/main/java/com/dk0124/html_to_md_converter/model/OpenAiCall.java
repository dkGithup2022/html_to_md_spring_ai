package com.dk0124.html_to_md_converter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OpenAiCall extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Long requestId;

    private boolean success;

    //@Column(columnDefinition = "LONGTEXT")
    private String errorMessage;

    //@Column(columnDefinition = "LONGTEXT")
    private String result;

    private Long tokens;

    private static OpenAiCall ofSuccess(Long reqId, String result, long tokens) {
        return new OpenAiCall(null, reqId, true, null, result, tokens);
    }

}
