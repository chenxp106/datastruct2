package cn.gdut.designpattern.adpater;

/**
 * @ClassName Client
 * @Desctiption 客户端类。相当于笔记本，只有USB接口
 * @Date 2020/6/27 17:13
 */
public class Client {
    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adpatee adpatee = new Adpatee();


//        Target target = new Adpater();
        Target target = new Adpater2(adpatee);
        client.test1(target);

    }
}












