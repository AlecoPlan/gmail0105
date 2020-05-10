package com.wzy.shop.service;

import com.wzy.shop.bean.PmsBaseAttrInfo;
import com.wzy.shop.bean.PmsBaseAttrValue;
import com.wzy.shop.bean.PmsBaseSaleAttr;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-07-22:02
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
    

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
