package com.example.dgbackend.global.s3.dto;

import lombok.Getter;

@Getter
public class S3Result {

    private String imgUrl;

    public S3Result(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
