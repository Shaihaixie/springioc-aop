package com.neuedu.dao.impl;

import com.neuedu.dao.ProductDao;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl  implements ProductDao{
    @Override
    public void addProduct() {
        System.out.println("====正在执行添加商品的方法====");
    }
}
