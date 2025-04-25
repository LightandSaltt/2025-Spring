package com.grepp.spring.app.controller.student.payload;

import com.grepp.spring.app.model.student.code.MBTI;

public record StudentRecommendRequest(
    String name,
    MBTI mbti,
    String major
) {

}
