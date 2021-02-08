package com.wzy.ems.mapper;

import com.wzy.ems.pojo.Commute;
import com.wzy.ems.pojo.CommuteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommuteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    long countByExample(CommuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int deleteByExample(CommuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int deleteByPrimaryKey(Integer commuteno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int insert(Commute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int insertSelective(Commute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    List<Commute> selectByExample(CommuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    Commute selectByPrimaryKey(Integer commuteno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByExampleSelective(@Param("record") Commute record, @Param("example") CommuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByExample(@Param("record") Commute record, @Param("example") CommuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByPrimaryKeySelective(Commute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commute
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByPrimaryKey(Commute record);
}