package com.service.plants;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Failed to connect to the database")

public class FailedToConnectToDatabaseException extends Exception {
    public FailedToConnectToDatabaseException(String message) {
        super(message);
    }
}
