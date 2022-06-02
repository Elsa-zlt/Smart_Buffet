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
@TableName("day_mp")
public class DayMp implements Serializable {

    @JsonProperty(value = "dpId")
    private Integer dpId;

    @JsonProperty(value = "mid")
    private Integer mId;

    @JsonProperty(value = "mName")
    private String mName;

    @JsonProperty(value = "cid")
    private Integer cId;

    @JsonProperty(value = "num")
    private Integer dmpNum;

    @JsonProperty(value = "calorie")
    private Double dmpCalorie;

}