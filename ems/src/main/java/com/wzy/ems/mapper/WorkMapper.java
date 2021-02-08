package com.wzy.ems.mapper;

import com.wzy.ems.pojo.Work;
import com.wzy.ems.pojo.WorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    long countByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int deleteByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int deleteByPrimaryKey(Integer workid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int insert(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int insertSelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    List<Work> selectByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    Work selectByPrimaryKey(Integer workid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByExampleSelective(@Param("record") Work record, @Param("example") WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByExample(@Param("record") Work record, @Param("example") WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByPrimaryKeySelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByPrimaryKey(Work record);
}