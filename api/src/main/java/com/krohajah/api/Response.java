package com.krohajah.api;

/**
 * Ответ из АПИ.
 *
 * @author Maxim Berezin
 */
public class Response<T> {
    private final T data;
    private final int code;

    Response(T data, int code) {
        this.data = data;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    /**
     * Returns true if the code is in [200..300), which means the request was successfully received,
     * understood, and accepted {@link okhttp3.Response#isSuccessful()}
     */
    public boolean isSuccessful() {
        return code >= 200 && code < 300;
    }
}
