package top.it6666.factorymethodpattern;

import top.it6666.factorymethodpattern.factory.Dialog;
import top.it6666.factorymethodpattern.factory.HtmlDialog;
import top.it6666.factorymethodpattern.factory.WindowsDialog;

/**
 * @author BNTang
 * @version 1.0
 * @description
 * @since 2023-11-23 23:17:38
 **/
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
