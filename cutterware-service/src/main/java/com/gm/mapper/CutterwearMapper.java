package com.gm.mapper;

import com.gm.pojo.Cutterwear;
import com.gm.pojo.CutterwearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CutterwearMapper {
    long countByExample(CutterwearExample example);

    int deleteByExample(CutterwearExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cutterwear record);

    int insertSelective(Cutterwear record);

    List<Cutterwear> selectByExample(CutterwearExample example);

    Cutterwear selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cutterwear record, @Param("example") CutterwearExample example);

    int updateByExample(@Param("record") Cutterwear record, @Param("example") CutterwearExample example);

    int updateByPrimaryKeySelective(Cutterwear record);

    int updateByPrimaryKey(Cutterwear record);
}