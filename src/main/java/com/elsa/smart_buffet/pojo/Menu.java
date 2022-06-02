package com.elsa.smart_buffet.pojo;

import java.io.Serializable;

public class Menu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.M_id
     *
     * @mbg.generated
     */
    private Integer mId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.M_name
     *
     * @mbg.generated
     */
    private String mName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.M_oldprice
     *
     * @mbg.generated
     */
    private Double mOldprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.M_price
     *
     * @mbg.generated
     */
    private Double mPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.M_calorie
     *
     * @mbg.generated
     */
    private Double mCalorie;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.M_category
     *
     * @mbg.generated
     */
    private String mCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.M_material
     *
     * @mbg.generated
     */
    private String mMaterial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.M_id
     *
     * @return the value of menu.M_id
     *
     * @mbg.generated
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.M_id
     *
     * @param mId the value for menu.M_id
     *
     * @mbg.generated
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.M_name
     *
     * @return the value of menu.M_name
     *
     * @mbg.generated
     */
    public String getmName() {
        return mName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.M_name
     *
     * @param mName the value for menu.M_name
     *
     * @mbg.generated
     */
    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.M_oldprice
     *
     * @return the value of menu.M_oldprice
     *
     * @mbg.generated
     */
    public Double getmOldprice() {
        return mOldprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.M_oldprice
     *
     * @param mOldprice the value for menu.M_oldprice
     *
     * @mbg.generated
     */
    public void setmOldprice(Double mOldprice) {
        this.mOldprice = mOldprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.M_price
     *
     * @return the value of menu.M_price
     *
     * @mbg.generated
     */
    public Double getmPrice() {
        return mPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.M_price
     *
     * @param mPrice the value for menu.M_price
     *
     * @mbg.generated
     */
    public void setmPrice(Double mPrice) {
        this.mPrice = mPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.M_calorie
     *
     * @return the value of menu.M_calorie
     *
     * @mbg.generated
     */
    public Double getmCalorie() {
        return mCalorie;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.M_calorie
     *
     * @param mCalorie the value for menu.M_calorie
     *
     * @mbg.generated
     */
    public void setmCalorie(Double mCalorie) {
        this.mCalorie = mCalorie;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.M_category
     *
     * @return the value of menu.M_category
     *
     * @mbg.generated
     */
    public String getmCategory() {
        return mCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.M_category
     *
     * @param mCategory the value for menu.M_category
     *
     * @mbg.generated
     */
    public void setmCategory(String mCategory) {
        this.mCategory = mCategory == null ? null : mCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.M_material
     *
     * @return the value of menu.M_material
     *
     * @mbg.generated
     */
    public String getmMaterial() {
        return mMaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.M_material
     *
     * @param mMaterial the value for menu.M_material
     *
     * @mbg.generated
     */
    public void setmMaterial(String mMaterial) {
        this.mMaterial = mMaterial == null ? null : mMaterial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", mName=").append(mName);
        sb.append(", mOldprice=").append(mOldprice);
        sb.append(", mPrice=").append(mPrice);
        sb.append(", mCalorie=").append(mCalorie);
        sb.append(", mCategory=").append(mCategory);
        sb.append(", mMaterial=").append(mMaterial);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}