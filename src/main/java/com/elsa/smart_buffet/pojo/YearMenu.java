package com.elsa.smart_buffet.pojo;

import java.io.Serializable;

public class YearMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year_menu.Y_id
     *
     * @mbg.generated
     */
    private Integer yId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year_menu.M_id
     *
     * @mbg.generated
     */
    private Integer mId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year_menu.M_name
     *
     * @mbg.generated
     */
    private String mName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year_menu.YM_num
     *
     * @mbg.generated
     */
    private Integer ymNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year_menu.YM_income
     *
     * @mbg.generated
     */
    private Double ymIncome;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year_menu.YM_expand
     *
     * @mbg.generated
     */
    private Double ymExpand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column year_menu.YM_profit
     *
     * @mbg.generated
     */
    private Double ymProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table year_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year_menu.Y_id
     *
     * @return the value of year_menu.Y_id
     *
     * @mbg.generated
     */
    public Integer getyId() {
        return yId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year_menu.Y_id
     *
     * @param yId the value for year_menu.Y_id
     *
     * @mbg.generated
     */
    public void setyId(Integer yId) {
        this.yId = yId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year_menu.M_id
     *
     * @return the value of year_menu.M_id
     *
     * @mbg.generated
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year_menu.M_id
     *
     * @param mId the value for year_menu.M_id
     *
     * @mbg.generated
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year_menu.M_name
     *
     * @return the value of year_menu.M_name
     *
     * @mbg.generated
     */
    public String getmName() {
        return mName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year_menu.M_name
     *
     * @param mName the value for year_menu.M_name
     *
     * @mbg.generated
     */
    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year_menu.YM_num
     *
     * @return the value of year_menu.YM_num
     *
     * @mbg.generated
     */
    public Integer getYmNum() {
        return ymNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year_menu.YM_num
     *
     * @param ymNum the value for year_menu.YM_num
     *
     * @mbg.generated
     */
    public void setYmNum(Integer ymNum) {
        this.ymNum = ymNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year_menu.YM_income
     *
     * @return the value of year_menu.YM_income
     *
     * @mbg.generated
     */
    public Double getYmIncome() {
        return ymIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year_menu.YM_income
     *
     * @param ymIncome the value for year_menu.YM_income
     *
     * @mbg.generated
     */
    public void setYmIncome(Double ymIncome) {
        this.ymIncome = ymIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year_menu.YM_expand
     *
     * @return the value of year_menu.YM_expand
     *
     * @mbg.generated
     */
    public Double getYmExpand() {
        return ymExpand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year_menu.YM_expand
     *
     * @param ymExpand the value for year_menu.YM_expand
     *
     * @mbg.generated
     */
    public void setYmExpand(Double ymExpand) {
        this.ymExpand = ymExpand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column year_menu.YM_profit
     *
     * @return the value of year_menu.YM_profit
     *
     * @mbg.generated
     */
    public Double getYmProfit() {
        return ymProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column year_menu.YM_profit
     *
     * @param ymProfit the value for year_menu.YM_profit
     *
     * @mbg.generated
     */
    public void setYmProfit(Double ymProfit) {
        this.ymProfit = ymProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table year_menu
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
        sb.append(", mId=").append(mId);
        sb.append(", mName=").append(mName);
        sb.append(", ymNum=").append(ymNum);
        sb.append(", ymIncome=").append(ymIncome);
        sb.append(", ymExpand=").append(ymExpand);
        sb.append(", ymProfit=").append(ymProfit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}