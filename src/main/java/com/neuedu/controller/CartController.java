package com.neuedu.controller;

import com.neuedu.service.CartService;
import com.neuedu.service.IProductService;
import com.neuedu.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class CartController {

    public static   void main(String[] args) throws IOException{

         //从容器中获取cartservice
         //step1:加载容器
     /*    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
         //step2:从容器中获取bean
         Object object= applicationContext.getBean("cartService");
        System.out.println(object);
         if(object instanceof  CartService){
             CartService cartService=(CartService)object;
             System.out.println(cartService.getName());
             System.out.println(cartService.getCartInfo());
         }

     JDBC jdbc=(JDBC) applicationContext.getBean("jdbc");
        System.out.println(jdbc);*/

       /* AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();

        JDBC jdbc=(JDBC) applicationContext.getBean("jdbc");
        System.out.println(jdbc);*/



        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
      /*  ProductServiceProxy productServiceProxy=applicationContext.getBean(ProductServiceProxy.class);
        productServiceProxy.addProduct();*/



        IProductService productService=   applicationContext.getBean(IProductService.class);
        productService.addProduct();
        productService.findProductById(11,"p10");
        System.out.println("productService "+productService);




     /*  CartService cartService= applicationContext.getBean(CartService.class);
        cartService.getName();*/

    }




}
