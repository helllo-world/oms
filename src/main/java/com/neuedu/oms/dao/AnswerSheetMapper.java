package com.neuedu.oms.dao;

import com.neuedu.oms.entity.AnswerSheet;
import com.neuedu.oms.entity.AnswerSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerSheetMapper {
    int countByExample(AnswerSheetExample example);

    int deleteByExample(AnswerSheetExample example);

    int deleteByPrimaryKey(Integer answerSheetId);

    int insert(AnswerSheet record);

    int insertSelective(AnswerSheet record);

    List<AnswerSheet> selectByExample(AnswerSheetExample example);

    AnswerSheet selectByPrimaryKey(Integer answerSheetId);

    int updateByExampleSelective(@Param("record") AnswerSheet record, @Param("example") AnswerSheetExample example);

    int updateByExample(@Param("record") AnswerSheet record, @Param("example") AnswerSheetExample example);

    int updateByPrimaryKeySelective(AnswerSheet record);

    int updateByPrimaryKey(AnswerSheet record);
}