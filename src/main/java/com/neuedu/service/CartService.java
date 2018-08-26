package com.neuedu.service;

import com.neuedu.dao.CartDao;
import com.neuedu.entity.CartInfo;
import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class CartService {


    private  String  name;
    //byType
 /*   @Autowired
    @Qualifier("cartInfo")*/
 //byName
   @Resource(name = "cartInfo")
    private CartInfo cartInfo;


 /*  @Autowired
   @Qualifier("cartDaoImpl")*/
 @Resource(name = "cartDaoImpl") //byName
   private CartDao cartDao;


    public CartService() {
        System.out.println("CartService ==");
    }

    public  CartService( CartInfo cartInfo){
        System.out.println("CartService ==CartInfo cartInfo");
        this.cartInfo=cartInfo;

    }
    public  CartService(String name, CartInfo cartInfo){
        System.out.println("CartService ==CartInfo cartInfo  name====");
        this.name=name;
        this.cartInfo=cartInfo;
    }


    @PostConstruct  // 等价于 xml init-method='init'
    public  void  init(){
        System.out.println("====cartservice  init====");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCartInfo(CartInfo cartInfo) {
        this.cartInfo = cartInfo;
    }

    public CartInfo getCartInfo() {
        return cartInfo;
    }


    @PreDestroy //等价于destroy-method="destroy"
    public  void  destroy(){
        System.out.println("==destroy===");
    }
}
