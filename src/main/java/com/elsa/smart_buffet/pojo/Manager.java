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
@TableName("manager")
public class Manager implements Serializable {

    @JsonProperty(value = "id")
    @TableId
    private Integer maId;

    @JsonProperty(value = "password")
    private String maPassword;

    @JsonProperty(value = "name")
    private String maName;

    @JsonProperty(value = "telephone")
    private Integer maPhone;

}