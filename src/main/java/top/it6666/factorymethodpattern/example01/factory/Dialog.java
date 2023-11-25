package top.it6666.factorymethodpattern.example01.factory;

import top.it6666.factorymethodpattern.example01.buttons.Button;

/**
 * @author BNTang
 * @version 1.0
 * @description 基本工厂类。请注意，"工厂 "只是该类的一个角色。它
 * 应该有一些需要创建不同产品的核心业务逻辑。
 * @since 2023-11-23 23:14:36
 **/
public abstract class Dialog {
    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
