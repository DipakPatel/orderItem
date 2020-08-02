package com.orderitem.exceptions;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class ExceptionResponse {
    LocalDateTime localDateTime;
    String message;
    String description;
}
