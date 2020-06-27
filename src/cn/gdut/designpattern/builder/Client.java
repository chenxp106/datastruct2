package cn.gdut.designpattern.builder;

/**
 * @ClassName Client
 * @Desctiption
 * 1 StringBuilder 的append方法。
 * 2 SQL中的PrepareStatement
 * 3 JDOM中，DomBuilder、SAXBuilder
 * @Date 2020/6/27 16:15
 */
public class Client {
    public static void main(String[] args) {

        MyAirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip ship = director.creatAirShip();
        System.out.println(ship.getEngine().getName());

    }
}
