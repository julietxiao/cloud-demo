package com.gm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gm.mapper.CutterwearMapper;
import com.gm.pojo.Cutterwear;
import com.gm.pojo.CutterwearExample;
import com.gm.pojo.CutterwearExample.Criteria;
import com.gm.service.CutterwearService;

@Service
public class CutterwearServiceImpl implements CutterwearService {
    @Resource
    private CutterwearMapper cutterwearMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return cutterwearMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cutterwear record) {
        return cutterwearMapper.insert(record);
    }

    @Override
    public int insertSelective(Cutterwear record) {
        return cutterwearMapper.insertSelective(record);
    }

    @Override
    public Cutterwear selectByPrimaryKey(Long id) {
        return cutterwearMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Cutterwear> query(Cutterwear cutterwearQueryVO) {
        if (Objects.isNull(cutterwearQueryVO)) {
            return new ArrayList<>();
        }
        CutterwearExample example = convertCutterwear2Example(cutterwearQueryVO);
        return cutterwearMapper.selectByExample(example);
    }

    private CutterwearExample convertCutterwear2Example(Cutterwear cutterwear) {
        CutterwearExample example = new CutterwearExample();
        Criteria criteria = example.createCriteria();
        if (Objects.nonNull(cutterwear.getId())) {
            criteria.andIdEqualTo(cutterwear.getId());
        }
        if (Objects.nonNull(cutterwear.getDate())) {
            criteria.andDateEqualTo(cutterwear.getDate());
        }
        if (StringUtils.isNotBlank(cutterwear.getType())) {
            criteria.andTypeEqualTo(cutterwear.getType());
        }
        if (Objects.nonNull(cutterwear.getPosition())) {
            criteria.andPositionEqualTo(cutterwear.getPosition());
        }
        if (StringUtils.isNotBlank(cutterwear.getManufacturer())) {
            criteria.andManufacturerLike("%" + cutterwear.getManufacturer() + "%");
        }
        if (StringUtils.isNotBlank(cutterwear.getImageName())) {
            criteria.andImageNameEqualTo(cutterwear.getImageName());
        }
        if (Objects.nonNull(cutterwear.getWear())) {
            criteria.andWearEqualTo(cutterwear.getWear());
        }
        if (Objects.nonNull(cutterwear.getWearType())) {
            criteria.andWearTypeEqualTo(cutterwear.getWearType());
        }
        return example;
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
