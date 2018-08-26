package com.neuedu.service;

import com.neuedu.dao.ProductDao;
import com.neuedu.entity.Product;
import com.neuedu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class ProductService  implements IProductService {


    @Autowired
    private ProductDao productDao;
    @Override
    public  void   addProduct() throws  IOException{


            productDao.addProduct();

    }

    @Override
    public Product findProductById(int productid,String name) {
        System.out.println("=======正在执行查询操作===");
        if(productid==10){
            throw new RuntimeException("我自定义的异常");
        }
        return new Product();
    }


}
