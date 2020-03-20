package com.neuedu.oms.dao;

import com.neuedu.oms.entity.MarkArrange;
import com.neuedu.oms.entity.MarkArrangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkArrangeMapper {
    int countByExample(MarkArrangeExample example);

    int deleteByExample(MarkArrangeExample example);

    int deleteByPrimaryKey(Integer markArrangeId);

    int insert(MarkArrange record);

    int insertSelective(MarkArrange record);

    List<MarkArrange> selectByExample(MarkArrangeExample example);

    MarkArrange selectByPrimaryKey(Integer markArrangeId);

    int updateByExampleSelective(@Param("record") MarkArrange record, @Param("example") MarkArrangeExample example);

    int updateByExample(@Param("record") MarkArrange record, @Param("example") MarkArrangeExample example);

    int updateByPrimaryKeySelective(MarkArrange record);

    int updateByPrimaryKey(MarkArrange record);
}