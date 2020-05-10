package com.wzy.shop.service;

import com.wzy.shop.bean.PmsProductImage;
import com.wzy.shop.bean.PmsProductInfo;
import com.wzy.shop.bean.PmsProductSaleAttr;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-08-19:16
 */
public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductImage> spuImageList(String spuId);
}
