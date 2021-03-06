package com.wzy.ems.mapper;

import com.wzy.ems.pojo.Forum;
import com.wzy.ems.pojo.ForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    long countByExample(ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int deleteByExample(ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int deleteByPrimaryKey(Integer forumid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int insert(Forum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int insertSelective(Forum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    List<Forum> selectByExample(ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    Forum selectByPrimaryKey(Integer forumid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByPrimaryKeySelective(Forum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum
     *
     * @mbg.generated Mon Feb 08 11:23:38 CST 2021
     */
    int updateByPrimaryKey(Forum record);
}