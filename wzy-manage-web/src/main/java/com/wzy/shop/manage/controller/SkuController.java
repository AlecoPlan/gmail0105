package com.wzy.shop.manage.controller;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.wzy.shop.bean.PmsSkuInfo;
import com.wzy.shop.service.SkuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author shkstart
 * @creats 2020-05-09-21:59
 */
@Controller
@CrossOrigin
public class SkuController {

    @Reference
    SkuService skuService;

    @RequestMapping("saveSkuInfo")
    @ResponseBody
    public String saveSkuInfo(@RequestBody PmsSkuInfo pmsSkuInfo){
        //将spuId封装给ProductId
        pmsSkuInfo.setProductId(pmsSkuInfo.getSpuId());

        //处理默认图片
//        String skuDefaultImg = pmsSkuInfo.getSkuDefaultImg();
//        if(StringUtils.isBlank(skuDefaultImg)){
//            pmsSkuInfo.setSkuDefaultImg(pmsSkuInfo.getSkuImageList().get(0).getImgUrl());
//        }
        skuService.saveSkuInfo(pmsSkuInfo);

        return "success";
    }
}
