package com.neuedu.oms.dao;

import com.neuedu.oms.entity.Point;
import com.neuedu.oms.entity.PointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointMapper {
    int countByExample(PointExample example);

    int deleteByExample(PointExample example);

    int deleteByPrimaryKey(Integer pointId);

    int insert(Point record);

    int insertSelective(Point record);

    List<Point> selectByExample(PointExample example);

    Point selectByPrimaryKey(Integer pointId);

    int updateByExampleSelective(@Param("record") Point record, @Param("example") PointExample example);

    int updateByExample(@Param("record") Point record, @Param("example") PointExample example);

    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);
}