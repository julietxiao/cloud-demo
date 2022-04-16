package com.gm.service.impl;

import com.gm.mapper.CutterwearMapper;
import com.gm.pojo.Cutterwear;
import com.gm.service.CutterwearService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CutterwearServiceImpl implements CutterwearService {
    @Resource
    private CutterwearMapper cutterwearMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Cutterwear record) {
        return 0;
    }

    @Override
    public int insertSelective(Cutterwear record) {
        return 0;
    }

    @Override
    public Cutterwear selectByPrimaryKey(Long id) {
        return cutterwearMapper.selectByPrimaryKey(id);
    }

    public List<Cutterwear> selectByDate(Long id) {
        return cutterwearMapper.selectByDate(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Cutterwear record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Cutterwear record) {
        return 0;
    }
}
