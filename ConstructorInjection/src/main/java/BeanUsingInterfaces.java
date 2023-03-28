import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanUsingInterfaces implements InitializingBean, DisposableBean {

    int price;

    @Override
    public String toString() {
        return "BeanUsingInterfaces{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Called for Interface");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("init called for interfaces");

    }
}
