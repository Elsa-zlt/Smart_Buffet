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
@TableName("comsumer")
public class Comsumer implements Serializable {

    @TableId
    @JsonProperty(value = "id")
    private Integer cId;

    @JsonProperty(value = "name")
    private String cName;

    @JsonProperty(value = "sex")
    private String cSex;

    @JsonProperty(value = "phone")
    private Integer cPhone;

    @JsonProperty(value = "password")
    private String cPassword;

    @JsonProperty(value = "time")
    private Integer cTime;

}