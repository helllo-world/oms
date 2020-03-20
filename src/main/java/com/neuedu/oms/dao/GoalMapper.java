package com.neuedu.oms.dao;

import com.neuedu.oms.entity.Goal;
import com.neuedu.oms.entity.GoalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoalMapper {
    int countByExample(GoalExample example);

    int deleteByExample(GoalExample example);

    int deleteByPrimaryKey(Integer goalId);

    int insert(Goal record);

    int insertSelective(Goal record);

    List<Goal> selectByExample(GoalExample example);

    Goal selectByPrimaryKey(Integer goalId);

    int updateByExampleSelective(@Param("record") Goal record, @Param("example") GoalExample example);

    int updateByExample(@Param("record") Goal record, @Param("example") GoalExample example);

    int updateByPrimaryKeySelective(Goal record);

    int updateByPrimaryKey(Goal record);
}