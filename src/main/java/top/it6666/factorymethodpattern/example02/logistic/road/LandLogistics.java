package top.it6666.factorymethodpattern.example02.logistic.road;

import top.it6666.factorymethodpattern.example02.logistic.Logistic;

/**
 * @author BNTang
 * @version 1.0
 * @description 陆运
 * @since 2023/11/26 0026
 **/
public class LandLogistics implements Logistic {
    @Override
    public void transport() {
        System.out.println("陆运");
    }
}
