package com.neuedu.oms.dao;

import com.neuedu.oms.entity.ObjMark;
import com.neuedu.oms.entity.ObjMarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjMarkMapper {
    int countByExample(ObjMarkExample example);

    int deleteByExample(ObjMarkExample example);

    int deleteByPrimaryKey(Integer objMarkId);

    int insert(ObjMark record);

    int insertSelective(ObjMark record);

    List<ObjMark> selectByExample(ObjMarkExample example);

    ObjMark selectByPrimaryKey(Integer objMarkId);

    int updateByExampleSelective(@Param("record") ObjMark record, @Param("example") ObjMarkExample example);

    int updateByExample(@Param("record") ObjMark record, @Param("example") ObjMarkExample example);

    int updateByPrimaryKeySelective(ObjMark record);

    int updateByPrimaryKey(ObjMark record);
}