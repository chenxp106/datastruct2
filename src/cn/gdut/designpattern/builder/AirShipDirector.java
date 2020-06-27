package cn.gdut.designpattern.builder;

/**
 * @ClassName AirShipDirector
 * @Desctiption 装配者
 * @Date 2020/6/27 16:01
 */
public interface AirShipDirector {

    /**
     * 用于组装飞船对象
     * @return
     */
    AirShip creatAirShip();
}
