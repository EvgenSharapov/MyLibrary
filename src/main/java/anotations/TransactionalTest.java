package anotations;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionalTest {
    @Transactional
    public void placeOrder(Order order){
        validateOrder(order);
        saveOrder(order);
    }
    //вынести метод в отдельный бин,который будет внедрятся в TransactionalTest
    @Transactional
    public void saveOrder(Order order){

    }
    private void validateOrder(Order order){

    }

}
