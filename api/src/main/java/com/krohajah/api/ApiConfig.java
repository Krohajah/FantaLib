package com.krohajah.api;

/**
 * Конфигурация API.
 *
 * @author Maxim Berezin
 */
public class ApiConfig {
    /**
     * API URL
     */
    private final String url;
    /**
     * Ключ API.
     * Значение для заголовка запроса "X-API-Key"
     */
    private final String apiKey;

    public ApiConfig(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
    }

    public String getUrl() {
        return url;
    }

    public String getApiKey() {
        return apiKey;
    }
}
