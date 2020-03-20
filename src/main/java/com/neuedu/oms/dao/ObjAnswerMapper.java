package com.neuedu.oms.dao;

import com.neuedu.oms.entity.ObjAnswer;
import com.neuedu.oms.entity.ObjAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjAnswerMapper {
    int countByExample(ObjAnswerExample example);

    int deleteByExample(ObjAnswerExample example);

    int deleteByPrimaryKey(Integer objAnswerId);

    int insert(ObjAnswer record);

    int insertSelective(ObjAnswer record);

    List<ObjAnswer> selectByExample(ObjAnswerExample example);

    ObjAnswer selectByPrimaryKey(Integer objAnswerId);

    int updateByExampleSelective(@Param("record") ObjAnswer record, @Param("example") ObjAnswerExample example);

    int updateByExample(@Param("record") ObjAnswer record, @Param("example") ObjAnswerExample example);

    int updateByPrimaryKeySelective(ObjAnswer record);

    int updateByPrimaryKey(ObjAnswer record);
}