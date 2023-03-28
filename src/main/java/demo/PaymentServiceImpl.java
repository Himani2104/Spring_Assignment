package demo;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentSerive{

    @Override
    public void payNow() {
        System.out.println("Amount Debited");


        System.out.println("Amount Credited");
    }
}
