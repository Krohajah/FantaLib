package com.krohajah.api.fantlabapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

/**
 * @author Maxim Berezin
 */
@Data
public class Authors {
    /**
     * Список авторов.
     */
    @SerializedName("list")
    @Expose
    List<AuthorDetail> authors;
}
