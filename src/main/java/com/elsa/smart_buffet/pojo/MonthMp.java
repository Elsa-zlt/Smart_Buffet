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
@TableName("month_mp")
public class MonthMp implements Serializable {

    @JsonProperty(value = "mpId")
    private Integer mpId;

    @JsonProperty(value = "mId")
    private Integer mId;

    @JsonProperty(value = "mName")
    private String mName;

    @JsonProperty(value = "cId")
    private Integer cId;

    @JsonProperty(value = "mmpNum")
    private Integer mmpNum;

    @JsonProperty(value = "mmpCalorie")
    private Double mmpCalorie;

}