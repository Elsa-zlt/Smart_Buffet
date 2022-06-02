package com.elsa.smart_buffet.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("menu_order")
public class MenuOrder implements Serializable {

    @JsonProperty(value = "oId")
    private String oId;

    @JsonProperty(value = "mId")
    private Integer mId;

    @JsonProperty(value = "mName")
    private String mName;

    @JsonProperty(value = "moNum")
    private Integer moNum;

    @JsonProperty(value = "moPrice")
    private Double moPrice;

}