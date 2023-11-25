package top.it6666.factorymethodpattern.example02.factory;

import top.it6666.factorymethodpattern.example02.logistic.road.LandLogistics;
import top.it6666.factorymethodpattern.example02.logistic.Logistic;

/**
 * @author BNTang
 * @version 1.0
 * @description 陆运卡车
 * @since 2023/11/26 0026
 **/
public class TruckLogistics extends Logistics {
    @Override
    public Logistic createLogistic() {
        return new LandLogistics();
    }
}
