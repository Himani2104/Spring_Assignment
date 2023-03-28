package congig;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execute(* demo.PaymentServiceImpl.payNow())")
    public void before()
    {
        System.out.println("Payment Started");
    }
/*@After("*execute(demo.PaymentServiceImpl.payNow())")
    public void After()
    {
        System.out.println("Payment done");
    }*/
}
