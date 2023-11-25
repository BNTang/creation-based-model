package top.it6666.factorymethodpattern.example02.logistic.road;

import top.it6666.factorymethodpattern.example02.logistic.Logistic;

/**
 * @author BNTang
 * @version 1.0
 * @description 三轮车陆运方式
 * @since 2023/11/26 0026
 **/
public class Pedicab implements Logistic {
    @Override
    public void transport() {
        System.out.println("三轮车陆运");
    }
}
