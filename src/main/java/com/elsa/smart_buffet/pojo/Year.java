package com.elsa.smart_buffet.pojo;

import java.io.Serializable;

public class Year implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year.Y_id
     *
     * @mbg.generated
     */
    private Integer yId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year.Y_income
     *
     * @mbg.generated
     */
    private Double yIncome;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year.Y_expend
     *
     * @mbg.generated
     */
    private Double yExpend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year.Y_profit
     *
     * @mbg.generated
     */
    private Double yProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table year
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year.Y_id
     *
     * @return the value of year.Y_id
     *
     * @mbg.generated
     */
    public Integer getyId() {
        return yId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year.Y_id
     *
     * @param yId the value for year.Y_id
     *
     * @mbg.generated
     */
    public void setyId(Integer yId) {
        this.yId = yId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year.Y_income
     *
     * @return the value of year.Y_income
     *
     * @mbg.generated
     */
    public Double getyIncome() {
        return yIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year.Y_income
     *
     * @param yIncome the value for year.Y_income
     *
     * @mbg.generated
     */
    public void setyIncome(Double yIncome) {
        this.yIncome = yIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year.Y_expend
     *
     * @return the value of year.Y_expend
     *
     * @mbg.generated
     */
    public Double getyExpend() {
        return yExpend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year.Y_expend
     *
     * @param yExpend the value for year.Y_expend
     *
     * @mbg.generated
     */
    public void setyExpend(Double yExpend) {
        this.yExpend = yExpend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year.Y_profit
     *
     * @return the value of year.Y_profit
     *
     * @mbg.generated
     */
    public Double getyProfit() {
        return yProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year.Y_profit
     *
     * @param yProfit the value for year.Y_profit
     *
     * @mbg.generated
     */
    public void setyProfit(Double yProfit) {
        this.yProfit = yProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table year
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yId=").append(yId);
        sb.append(", yIncome=").append(yIncome);
        sb.append(", yExpend=").append(yExpend);
        sb.append(", yProfit=").append(yProfit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}