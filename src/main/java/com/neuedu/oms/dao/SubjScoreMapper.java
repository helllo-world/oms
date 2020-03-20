package com.neuedu.oms.dao;

import com.neuedu.oms.entity.SubjScore;
import com.neuedu.oms.entity.SubjScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjScoreMapper {
    int countByExample(SubjScoreExample example);

    int deleteByExample(SubjScoreExample example);

    int deleteByPrimaryKey(Integer subjScoreId);

    int insert(SubjScore record);

    int insertSelective(SubjScore record);

    List<SubjScore> selectByExample(SubjScoreExample example);

    SubjScore selectByPrimaryKey(Integer subjScoreId);

    int updateByExampleSelective(@Param("record") SubjScore record, @Param("example") SubjScoreExample example);

    int updateByExample(@Param("record") SubjScore record, @Param("example") SubjScoreExample example);

    int updateByPrimaryKeySelective(SubjScore record);

    int updateByPrimaryKey(SubjScore record);
}