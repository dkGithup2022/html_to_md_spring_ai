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
public class OpenClientRequestChunk {
    @Id
    @GeneratedValue
    private Long id;

    private Long requestId;

    //@Column(columnDefinition = "LONGTEXT")
    private String chunk;

    private int orderOfRequest;

    private long size;

    public static OpenClientRequestChunk newOne(Long requestId, String chunk, int order, long size) {
        return new OpenClientRequestChunk(null, requestId, chunk, order, size);
    }
}
