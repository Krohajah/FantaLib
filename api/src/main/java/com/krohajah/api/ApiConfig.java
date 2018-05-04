package com.krohajah.api;

import lombok.Getter;

/**
 * Конфигурация API.
 *
 * @author Maxim Berezin
 */
public class ApiConfig {
    /**
     * API URL
     */
    @Getter
    private final String url;


    public ApiConfig(String url) {
        this.url = url;
    }
}
