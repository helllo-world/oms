package com.neuedu.oms.dao;

import com.neuedu.oms.entity.SubjMark;
import com.neuedu.oms.entity.SubjMarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjMarkMapper {
    int countByExample(SubjMarkExample example);

    int deleteByExample(SubjMarkExample example);

    int deleteByPrimaryKey(Integer subjMarkId);

    int insert(SubjMark record);

    int insertSelective(SubjMark record);

    List<SubjMark> selectByExample(SubjMarkExample example);

    SubjMark selectByPrimaryKey(Integer subjMarkId);

    int updateByExampleSelective(@Param("record") SubjMark record, @Param("example") SubjMarkExample example);

    int updateByExample(@Param("record") SubjMark record, @Param("example") SubjMarkExample example);

    int updateByPrimaryKeySelective(SubjMark record);

    int updateByPrimaryKey(SubjMark record);
}