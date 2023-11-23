package top.it6666.factorymethodpattern.factory;

import top.it6666.factorymethodpattern.buttons.Button;
import top.it6666.factorymethodpattern.buttons.WindowsButton;

/**
 * @author BNTang
 * @version 1.0
 * @description Windows 对话框将生成 Windows 按钮。
 * @since 2023-11-23 23:16:45
 **/
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
