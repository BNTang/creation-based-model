package top.it6666.factorymethodpattern.example02.factory;

import top.it6666.factorymethodpattern.example02.logistic.Logistic;
import top.it6666.factorymethodpattern.example02.logistic.road.Pedicab;

/**
 * @author BNTang
 * @version 1.0
 * @description 三轮车物流工厂
 * @since 2023/11/26 0026
 **/
public class PedicabLogistics extends Logistics {
    @Override
    public Logistic createLogistic() {
        return new Pedicab();
    }
}
