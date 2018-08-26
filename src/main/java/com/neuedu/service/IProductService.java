package com.neuedu.service;


import com.neuedu.entity.Product;

import java.io.IOException;

public interface IProductService {
      void   addProduct() throws IOException;

      Product findProductById(int productid,String name);
}
