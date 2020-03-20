package com.neuedu.oms.dao;

import com.neuedu.oms.entity.TeacherClass;
import com.neuedu.oms.entity.TeacherClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherClassMapper {
    int countByExample(TeacherClassExample example);

    int deleteByExample(TeacherClassExample example);

    int deleteByPrimaryKey(Integer tcId);

    int insert(TeacherClass record);

    int insertSelective(TeacherClass record);

    List<TeacherClass> selectByExample(TeacherClassExample example);

    TeacherClass selectByPrimaryKey(Integer tcId);

    int updateByExampleSelective(@Param("record") TeacherClass record, @Param("example") TeacherClassExample example);

    int updateByExample(@Param("record") TeacherClass record, @Param("example") TeacherClassExample example);

    int updateByPrimaryKeySelective(TeacherClass record);

    int updateByPrimaryKey(TeacherClass record);
}