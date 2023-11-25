package top.it6666.factorymethodpattern.example01.factory;

import top.it6666.factorymethodpattern.example01.buttons.Button;
import top.it6666.factorymethodpattern.example01.buttons.HtmlButton;

/**
 * @author BNTang
 * @version 1.0
 * @description HTML 对话框将生成 HTML 按钮。
 * @since 2023-11-23 23:14:36
 **/
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
