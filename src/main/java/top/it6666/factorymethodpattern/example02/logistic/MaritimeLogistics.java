package top.it6666.factorymethodpattern.example02.logistic;

/**
 * @author BNTang
 * @version 1.0
 * @description 海运
 * @since 2023/11/26 0026
 **/
public class MaritimeLogistics implements Logistic {
    @Override
    public void transport() {
        System.out.println("海运");
    }
}
