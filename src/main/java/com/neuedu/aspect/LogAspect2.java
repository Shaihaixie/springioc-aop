package com.neuedu.aspect;


import com.neuedu.entity.Product;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 *
 * 日志服务切面类
 * */
@Component
@Aspect //声明切面类
public class LogAspect2 {

    @Pointcut("execution(* com.neuedu.service.ProductService.findProductById(int,String))  ")
    public  void  test(){}
    @Around(value="test()")
    public  void  around(ProceedingJoinPoint proceedingJoinPoint){
        try {
            Object target=proceedingJoinPoint.getTarget();
            System.out.println("target="+target);
            System.out.println("第一个参数==" +proceedingJoinPoint.getArgs()[0]);
            System.out.println("第二个参数=" +proceedingJoinPoint.getArgs()[1]);
            String  target_method= proceedingJoinPoint.getSignature().getName();
            System.out.println("target_method"+target_method);
            System.out.println("开始执行方法。。。");
            //执行原对象的方法  --->findProductByid
            Object result=proceedingJoinPoint.proceed();
            System.out.println("result"+result);
            System.out.println("开始完成。。。");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("抛出异常。。。");
        }
        System.out.println("finish。。。");

    }
 /* @Before("test(productid,name)")
    public  void   start(int productid,String name){
        System.out.println("方法开始执行22..."+productid+" name="+name);
    }
    @AfterThrowing(value = "test(productid,name)" , throwing = "ex")
    public  void   throwing(int productid,String name,Throwable ex){
        System.out.println("方法抛出异常..."+ex.getMessage());
    }
    @AfterReturning(value = "test(productid,name)",returning = "product")
    public  void  after_returnning(int productid,String name,Product product){
        System.out.println("==after_returnning=="+product);
    }
    @After("test(productid,name)")
    public  void   finish(int productid,String name){
        System.out.println("方法执行完成...");
    }*/







}
