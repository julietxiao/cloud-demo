package com.gm.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gm.config.ResultVO;
import com.gm.pojo.Cutterwear;
import com.gm.service.CutterwearService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "cutterwear接口")
@RestController
@RequestMapping("cutterwear")
public class CutterwearContorller {

    @Autowired
    private CutterwearService cutterwearService;


    @ApiOperation(value = "查询", notes = "根据id查询模板信息")
    @PostMapping("queryCutterwearById")
    public ResultVO<?> queryTemplateById(
        @ApiParam(value = "id", required = true, example = "1") @RequestParam("id") Long id) {
        try {
            Cutterwear cutterwear = this.cutterwearService.selectByPrimaryKey(id);
            return ResultVO.getSuccess(cutterwear);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("");
        }
    }

    @PostMapping("/query")
    public ResultVO<?> query(Cutterwear cutterwear) {
        List<Cutterwear> cutterwearList = cutterwearService.query(cutterwear);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("wearList", cutterwearList);
        dataMap.put("count", cutterwearList.size());
        return ResultVO.getSuccess(dataMap);
    }


}
