package com.service.plants;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Item is invalid")
public class ItemIsInvalidException extends Exception {
    public ItemIsInvalidException(String message) {
        super(message);
    }
}

