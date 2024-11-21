package other.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathContextExp {
    public static void main(String[] args) {
        MathContext math1=new MathContext(10,RoundingMode.HALF_UP);
        MathContext math2=new MathContext(2,RoundingMode.CEILING);
        BigDecimal dividend = new BigDecimal("10.1414141241515");
        BigDecimal divisor = new BigDecimal("3.1415151541515");

        BigDecimal value1=dividend.divide(divisor,math1);
        BigDecimal value2=dividend.divide(divisor,math2);
        System.out.println("Результат: "+value1);
        System.out.println("Результат: "+value2);

    }
}
