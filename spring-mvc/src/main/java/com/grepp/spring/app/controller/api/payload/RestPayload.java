package com.grepp.spring.app.controller.api.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public record RestPayload(
    Integer id,
    String email,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    OffsetDateTime lastAccess,
    Long lastAccessTimeStamp
) {

}
