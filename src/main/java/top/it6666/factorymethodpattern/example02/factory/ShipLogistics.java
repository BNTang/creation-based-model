package top.it6666.factorymethodpattern.example02.factory;

import top.it6666.factorymethodpattern.example02.logistic.Logistic;
import top.it6666.factorymethodpattern.example02.logistic.MaritimeLogistics;

/**
 * @author BNTang
 * @version 1.0
 * @description 船运
 * @since 2023/11/26 0026
 **/
public class ShipLogistics extends Logistics {
    @Override
    public Logistic createLogistic() {
        return new MaritimeLogistics();
    }
}
