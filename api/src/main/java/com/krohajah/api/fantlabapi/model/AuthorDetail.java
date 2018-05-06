package com.krohajah.api.fantlabapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Автор.
 *
 * @author Maxim Berezin
 */
@Data
public class AuthorDetail {
    /**
     * id автора
     */
    @SerializedName("id")
    @Expose
    private Long id;
    /**
     * имя на русском языке
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * имя на языке оригинала
     */
    @SerializedName("name_orig")
    @Expose
    private String nameOrig;
}
