package com.elsa.smart_buffet.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class Evaluate implements Serializable {


    public Evaluate(Integer cId, String oId, Integer mId, Date eTime, Integer eScore, String eOpinion) {
        this.cId = cId;
        this.oId = oId;
        this.mId = mId;
        this.eTime = eTime;
        this.eScore = eScore;
        this.eOpinion = eOpinion;
    }

    public Evaluate() {
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluate.C_id
     *
     * @mbg.generated
     */
    @JsonProperty(value = "cumstomerId")
    private Integer cId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluate.O_id
     *
     * @mbg.generated
     */
    @JsonProperty(value = "orderId")
    private String oId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluate.M_id
     *
     * @mbg.generated
     */
    @JsonProperty(value = "menuId")
    private Integer mId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluate.E_time
     *
     * @mbg.generated
     */
    @JsonProperty(value = "time")
    private Date eTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluate.E_score
     *
     * @mbg.generated
     */
    @JsonProperty(value = "score")
    private Integer eScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluate.E_opinion
     *
     * @mbg.generated
     */
    @JsonProperty(value = "opinion")
    private String eOpinion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table evaluate
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluate.C_id
     *
     * @return the value of evaluate.C_id
     *
     * @mbg.generated
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluate.C_id
     *
     * @param cId the value for evaluate.C_id
     *
     * @mbg.generated
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluate.O_id
     *
     * @return the value of evaluate.O_id
     *
     * @mbg.generated
     */
    public String getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluate.O_id
     *
     * @param oId the value for evaluate.O_id
     *
     * @mbg.generated
     */
    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluate.M_id
     *
     * @return the value of evaluate.M_id
     *
     * @mbg.generated
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluate.M_id
     *
     * @param mId the value for evaluate.M_id
     *
     * @mbg.generated
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluate.E_time
     *
     * @return the value of evaluate.E_time
     *
     * @mbg.generated
     */
    public Date geteTime() {
        return eTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluate.E_time
     *
     * @param eTime the value for evaluate.E_time
     *
     * @mbg.generated
     */
    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluate.E_score
     *
     * @return the value of evaluate.E_score
     *
     * @mbg.generated
     */
    public Integer geteScore() {
        return eScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluate.E_score
     *
     * @param eScore the value for evaluate.E_score
     *
     * @mbg.generated
     */
    public void seteScore(Integer eScore) {
        this.eScore = eScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluate.E_opinion
     *
     * @return the value of evaluate.E_opinion
     *
     * @mbg.generated
     */
    public String geteOpinion() {
        return eOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluate.E_opinion
     *
     * @param eOpinion the value for evaluate.E_opinion
     *
     * @mbg.generated
     */
    public void seteOpinion(String eOpinion) {
        this.eOpinion = eOpinion == null ? null : eOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", oId=").append(oId);
        sb.append(", mId=").append(mId);
        sb.append(", eTime=").append(eTime);
        sb.append(", eScore=").append(eScore);
        sb.append(", eOpinion=").append(eOpinion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}