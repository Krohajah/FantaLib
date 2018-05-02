package com.krohajah.api.fantlabapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Автор.
 *
 * @author Maxim Berezin
 */
public class Author {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOrig() {
        return nameOrig;
    }

    public void setNameOrig(String nameOrig) {
        this.nameOrig = nameOrig;
    }
}
