package com.neuedu.oms.dao;

import com.neuedu.oms.entity.SubjAnswer;
import com.neuedu.oms.entity.SubjAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjAnswerMapper {
    int countByExample(SubjAnswerExample example);

    int deleteByExample(SubjAnswerExample example);

    int deleteByPrimaryKey(Integer subjAnswerId);

    int insert(SubjAnswer record);

    int insertSelective(SubjAnswer record);

    List<SubjAnswer> selectByExample(SubjAnswerExample example);

    SubjAnswer selectByPrimaryKey(Integer subjAnswerId);

    int updateByExampleSelective(@Param("record") SubjAnswer record, @Param("example") SubjAnswerExample example);

    int updateByExample(@Param("record") SubjAnswer record, @Param("example") SubjAnswerExample example);

    int updateByPrimaryKeySelective(SubjAnswer record);

    int updateByPrimaryKey(SubjAnswer record);
}