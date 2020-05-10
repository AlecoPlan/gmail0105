package com.wzy.shop.service;

import com.wzy.shop.bean.PmsBaseCatalog1;
import com.wzy.shop.bean.PmsBaseCatalog2;
import com.wzy.shop.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-07-19:23
 */
public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
