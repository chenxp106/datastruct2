package cn.gdut.designpattern.builder;

/**
 * @ClassName AirShipBuilder
 * @Desctiption 用于构建
 * @Date 2020/6/27 15:58
 */
public interface AirShipBuilder {

    Engine builderEngine();
    OrbitalModule builderOritalModul();
    EscapeTower builderEscapeTower();

}
