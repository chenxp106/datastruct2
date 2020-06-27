package cn.gdut.designpattern.adpater;

/**
 * @ClassName Adpater (对象适配器方式，使用了组合的方式)
 * @Desctiption 适配器 (相当于USB转接口)
 * @Date 2020/6/27 17:16
 */
public class Adpater2  implements Target{

    private Adpatee adpatee;

    @Override
    public void handleReq() {
        adpatee.request();
    }

    public Adpater2(Adpatee adpatee) {
        this.adpatee = adpatee;
    }
}
