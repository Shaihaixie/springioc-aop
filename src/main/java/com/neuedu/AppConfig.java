package com.neuedu;

import com.neuedu.entity.JDBC;
import com.neuedu.service.CartService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration // <beans>
@ImportResource("classpath:spring-config.xml")
public class AppConfig {
    @Value("${jdbc.driver}")
   private  String  driver;
    @Value("${jdbc.url}")
   private  String url;
    @Value("${jdbc.username}")
   private  String username;
    @Value("${jdbc.password}")
   private  String  passwrod;




    @Bean(name = "cartService",initMethod = "init" ,destroyMethod = "destroy")
    @Scope("singleton")
    public CartService cartService(){

        return  new CartService();
    }

    @Bean
    public JDBC jdbc(){

        JDBC jdbc=new JDBC();
        jdbc.setDriver(driver);
        jdbc.setUrl(url);
        jdbc.setUsername(username);
        jdbc.setPassword(passwrod);
        return  jdbc;

    }

}
