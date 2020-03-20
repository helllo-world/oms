package com.neuedu.oms.dao;

import com.neuedu.oms.entity.PaperScan;
import com.neuedu.oms.entity.PaperScanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperScanMapper {
    int countByExample(PaperScanExample example);

    int deleteByExample(PaperScanExample example);

    int deleteByPrimaryKey(Integer paperScanId);

    int insert(PaperScan record);

    int insertSelective(PaperScan record);

    List<PaperScan> selectByExample(PaperScanExample example);

    PaperScan selectByPrimaryKey(Integer paperScanId);

    int updateByExampleSelective(@Param("record") PaperScan record, @Param("example") PaperScanExample example);

    int updateByExample(@Param("record") PaperScan record, @Param("example") PaperScanExample example);

    int updateByPrimaryKeySelective(PaperScan record);

    int updateByPrimaryKey(PaperScan record);
}