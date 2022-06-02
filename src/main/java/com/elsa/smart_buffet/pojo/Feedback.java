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
@TableName("feedback")
public class Feedback implements Serializable {

    @JsonProperty(value="consumerId")
    private Integer cId;

    @JsonProperty(value = "feedbackTime")
    private Date fTime;

    @JsonProperty(value = "feedbackStatus")
    private Integer fStatus;

    @JsonProperty(value = "feedbackTime")
    private Date fmTime;

    @JsonProperty(value = "feedbackComplaint")
    private String fComplaint;

    @JsonProperty(value = "returnOpinion")
    private String fmOpinion;

}