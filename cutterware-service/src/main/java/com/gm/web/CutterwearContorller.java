package com.gm.web;

import com.gm.config.ResultVO;
import com.gm.pojo.Cutterwear;
import com.gm.service.CutterwearService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "模板接口")
@RestController
@RequestMapping("template")
public class CutterwearContorller {

    @Autowired
    private CutterwearService cutterwearService;


    @ApiOperation(value = "查询",notes = "根据id查询模板信息")
    @PostMapping("queryCutterwearById")
    public ResultVO queryTemplateById(@ApiParam(value = "cutterwear id", required = true, example = "1")@RequestParam("cutterwearId") Long id){
        try {
            Cutterwear cutterwear = this.cutterwearService.selectByPrimaryKey(id);
            return ResultVO.getSuccess(cutterwear);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("");
        }
    }




}
