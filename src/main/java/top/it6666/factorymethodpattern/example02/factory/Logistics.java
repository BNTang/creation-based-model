package top.it6666.factorymethodpattern.example02.factory;

import top.it6666.factorymethodpattern.example02.logistic.Logistic;

/**
 * @author BNTang
 * @version 1.0
 * @description 物流工厂
 * @since 2023/11/26 0026
 **/
public abstract class Logistics {

    /**
     * 创建物流
     *
     * @return 物流
     */
    public abstract Logistic createLogistic();

    /**
     * 运输
     */
    public void transport() {
        Logistic logistic = createLogistic();
        logistic.transport();
    }
}
