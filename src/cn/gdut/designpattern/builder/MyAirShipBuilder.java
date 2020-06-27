package cn.gdut.designpattern.builder;

/**
 * @ClassName MyAirShipBuilder
 * @Desctiption 实现接口，构建对象
 * StringBuilder， xml解析中，JDOM库中的类DomBuilder， SaxBuilder
 * @Date 2020/6/27 16:03
 */
public class MyAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("发动机");
    }

    @Override
    public OrbitalModule builderOritalModul() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("逃逸塔");
    }
}
