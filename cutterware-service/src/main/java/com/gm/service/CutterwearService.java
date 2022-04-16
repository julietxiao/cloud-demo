package com.gm.service;

import com.gm.pojo.Cutterwear;

import java.util.List;

public interface CutterwearService {
    int deleteByPrimaryKey(Long id);

    int insert(Cutterwear record);

    int insertSelective(Cutterwear record);

    Cutterwear selectByPrimaryKey(Long id);

    List<Cutterwear> query(Cutterwear cutterwearQueryVO);

    int updateByPrimaryKeySelective(Cutterwear record);

    int updateByPrimaryKey(Cutterwear record);

}
