package com.wzy.ems.pojo;

public class Commute {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commute.commuteno
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    private Integer commuteno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commute.cname
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commute.clocal
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    private String clocal;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commute.commuteno
     *
     * @return the value of commute.commuteno
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    public Integer getCommuteno() {
        return commuteno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commute.commuteno
     *
     * @param commuteno the value for commute.commuteno
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    public void setCommuteno(Integer commuteno) {
        this.commuteno = commuteno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commute.cname
     *
     * @return the value of commute.cname
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commute.cname
     *
     * @param cname the value for commute.cname
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commute.clocal
     *
     * @return the value of commute.clocal
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    public String getClocal() {
        return clocal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commute.clocal
     *
     * @param clocal the value for commute.clocal
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    public void setClocal(String clocal) {
        this.clocal = clocal == null ? null : clocal.trim();
    }
}