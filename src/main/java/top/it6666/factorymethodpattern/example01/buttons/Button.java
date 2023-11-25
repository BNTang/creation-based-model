package top.it6666.factorymethodpattern.example01.buttons;

/**
 * @author BNTang
 * @version 1.0
 * @description 通用产品接口
 * @since 2023-11-23 23:10:54
 **/
public interface Button {
    /**
     * 渲染
     */
    void render();

    /**
     * 点击
     */
    void onClick();
}
