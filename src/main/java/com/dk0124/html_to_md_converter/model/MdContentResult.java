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
public class MdContentResult extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Long requestId;

    //@Column(columnDefinition = "LONGTEXT")
    private String mdContent;

    private MdContentResult newOne(Long reqId, String mdContent) {
        return new MdContentResult(null, reqId, mdContent);
    }
}
