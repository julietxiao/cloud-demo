package com.gm.mapper;

import com.gm.pojo.Cutterwear;

import java.util.List;

public interface CutterwearMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cutterwear record);

    int insertSelective(Cutterwear record);

    Cutterwear selectByPrimaryKey(Long id);

    List<Cutterwear> selectByDate(Long date);

    int updateByPrimaryKeySelective(Cutterwear record);

    int updateByPrimaryKey(Cutterwear record);
}