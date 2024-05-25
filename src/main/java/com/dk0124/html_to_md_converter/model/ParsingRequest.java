package com.dk0124.html_to_md_converter.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ParsingRequest  extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    private String user;

    private String inputTitle;

    @Enumerated(EnumType.STRING)
    @Setter
    private ParsingStatus parsingStatus;

    public static  ParsingRequest newOne(String inputTitle){
        return new ParsingRequest(null,null,inputTitle,ParsingStatus.WAIT);
    }
}
