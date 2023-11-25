package top.it6666.factorymethodpattern.example02;

import top.it6666.factorymethodpattern.example02.factory.Logistics;
import top.it6666.factorymethodpattern.example02.factory.PedicabLogistics;
import top.it6666.factorymethodpattern.example02.factory.ShipLogistics;
import top.it6666.factorymethodpattern.example02.factory.TruckLogistics;
import top.it6666.factorymethodpattern.example02.logistic.road.Pedicab;

/**
 * @author BNTang
 * @version 1.0
 * @description
 * @since 2023/11/26 0026
 **/
public class Demo {
    private static Logistics logisticsFactory;

    public static void main(String[] args) {
        configure("三轮车");
        startTransport();
    }

    static void configure(String type) {
        if (type.equals("卡车")) {
            logisticsFactory = new TruckLogistics();
        } else if (type.equals("轮船")) {
            logisticsFactory = new ShipLogistics();
        } else if (type.equals("三轮车")) {
            logisticsFactory = new PedicabLogistics();
        } else {
            throw new RuntimeException("没有这种物流");
        }
    }

    static void startTransport() {
        logisticsFactory.transport();
    }
}
