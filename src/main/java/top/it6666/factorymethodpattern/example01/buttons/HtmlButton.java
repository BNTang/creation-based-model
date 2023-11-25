package top.it6666.factorymethodpattern.example01.buttons;

/**
 * @author BNTang
 * @version 1.0
 * @description HTML按钮
 * @since 2023-11-23 23:10:54
 **/
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
