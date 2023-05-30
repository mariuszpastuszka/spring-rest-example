package com.vavatech.springrestexample.car;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ErrorMessageDto(
        LocalDateTime timestamp,
        int status,
        String error,
        String message,
        String path
) {
}
