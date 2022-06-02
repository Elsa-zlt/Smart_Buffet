package com.elsa.smart_buffet.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("menu")
public class Menu implements Serializable {

    @TableId
    @JsonProperty(value = "mId")
    private Integer mId;

    @JsonProperty(value = "mName")
    private String mName;

    @JsonProperty(value = "mOldPrice")
    private Double mOldPrice;

    @JsonProperty(value = "mPrice")
    private Double mPrice;

    @JsonProperty(value = "mCalorie")
    private Double mCalorie;

    @JsonProperty(value = "mCategory")
    private String mCategory;

    @JsonProperty(value = "mMaterial")
    private String mMaterial;

}