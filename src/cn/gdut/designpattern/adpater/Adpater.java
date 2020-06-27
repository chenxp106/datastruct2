package cn.gdut.designpattern.adpater;

/**
 * @ClassName Adpater (使用继承的方式)
 * @Desctiption 适配器 (相当于USB转接口)
 * @Date 2020/6/27 17:16
 */
public class Adpater extends Adpatee implements Target{


    @Override
    public void handleReq() {
        super.request();
    }
}
