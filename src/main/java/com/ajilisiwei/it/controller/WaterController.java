package com.ajilisiwei.it.controller;

import com.ajilisiwei.it.model.ResultModel;
import com.ajilisiwei.it.service.WaterService;
import com.ajilisiwei.it.service.impl.WaterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by WEI on 20/08/2017.
 */
@RestController
public class WaterController {

    @Autowired
    private WaterService waterService;

    @ResponseBody
    @RequestMapping(value = "/api/water",method = RequestMethod.GET)
    public ResultModel getWaterByCityId(@RequestParam int city_id,@RequestParam int year,@RequestParam int type){
        System.out.println("city_id:"+city_id);
        System.out.println("year:"+year);
        System.out.println("type:"+type);
        ResultModel resultModel=waterService.getWaterByCityId(city_id);
        return resultModel;
    }




}
