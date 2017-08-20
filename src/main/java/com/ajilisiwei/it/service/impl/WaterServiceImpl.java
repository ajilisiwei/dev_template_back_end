package com.ajilisiwei.it.service.impl;

import com.ajilisiwei.it.dao.WaterDao;
import com.ajilisiwei.it.domain.Water;
import com.ajilisiwei.it.model.DataModel;
import com.ajilisiwei.it.model.ResultModel;
import com.ajilisiwei.it.pojo.WaterExtend;
import com.ajilisiwei.it.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by WEI on 20/08/2017.
 */
@Service("waterService")
public class WaterServiceImpl implements WaterService{
    @Autowired
    private WaterDao waterDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public ResultModel getWaterByCityId(Integer cityId) {
        String keyName="city_"+cityId;
        ValueOperations<String,ResultModel> operations=redisTemplate.opsForValue();
        boolean haskey=redisTemplate.hasKey(keyName);
        if (haskey){
            LOGGER.info("WaterServiceImpl.getWaterByCityId() : 从缓存中获取数据... ");
            return operations.get(keyName);
        }
        List<WaterExtend> result=waterDao.getWaterByCityId(cityId);
        ResultModel resultModel=DataConvertor(result);
        // 插入缓存
        operations.set(keyName, resultModel, 20, TimeUnit.SECONDS);
        LOGGER.info("WaterServiceImpl.getWaterByCityId() : 将城市的降雨量和蒸发量信息加入缓存...");
        return resultModel;
    }

    private ResultModel DataConvertor(List<WaterExtend> waterData){
        ArrayList<Float> rainfall=new ArrayList<Float>();
        ArrayList<Float> evarpotion=new ArrayList<Float>();
        ResultModel resultModel=new ResultModel();
        DataModel rainfalldataModel=new DataModel();
        DataModel evarpotiondataModel=new DataModel();
        if(waterData!= null && waterData.size()>=1){
            waterData.forEach((k)->{
                if(k.getType()==1){
                    rainfall.add(k.getCount());
                    rainfalldataModel.setCity_id(k.getCityId());
                    rainfalldataModel.setCity_name(k.getCityName());
                    rainfalldataModel.setType(k.getType());
                }else{
                    evarpotion.add(k.getCount());
                    evarpotiondataModel.setCity_id(k.getCityId());
                    evarpotiondataModel.setCity_name(k.getCityName());
                    evarpotiondataModel.setType(k.getType());
                }
            });
        }
        rainfalldataModel.setData(rainfall);
        evarpotiondataModel.setData(evarpotion);
        List<DataModel> list= Arrays.asList(rainfalldataModel,evarpotiondataModel);
        resultModel.setData(list);
        resultModel.setError_msg(null);
        resultModel.setStatus(0);
        System.out.println(resultModel.toString());
        return resultModel;
    }

}
