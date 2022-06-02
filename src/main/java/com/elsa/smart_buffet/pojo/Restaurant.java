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
@TableName("restaurant")
public class Restaurant implements Serializable {

    @TableId
    @JsonProperty(value ="resId")
    private Integer resId;

    @JsonProperty(value ="resName")
    private String resName;

    @JsonProperty(value ="resAddress")
    private String resAddress;

    @JsonProperty(value ="resOpenTime")
    private String resOpenTime;

    @JsonProperty(value ="resNum")
    private Integer resNum;

}