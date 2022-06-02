package com.elsa.smart_buffet.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("evaluate")
public class Evaluate implements Serializable {

    @JsonProperty(value = "consumerId")
    private Integer cId;

    @JsonProperty(value = "orderId")
    private String oId;

    @JsonProperty(value = "menuId")
    private Integer mId;

    @JsonProperty(value = "time")
    private Date eTime;

    @JsonProperty(value = "score")
    private Integer eScore;

    @JsonProperty(value = "opinion")
    private String eOpinion;

}