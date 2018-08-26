package com.neuedu.service;

import com.neuedu.aspect.LogAspect;



public class ProductServiceProxy  extends ProductService{

    LogAspect logAspect=new LogAspect();

    @Override
    public void addProduct() {

       // logAspect.start();
      /*  try {
            super.addProduct();
        }catch (Exception e){
            logAspect.throwing();
        }
        logAspect.finish();*/

    }
}
