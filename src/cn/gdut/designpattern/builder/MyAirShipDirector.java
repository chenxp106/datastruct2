package cn.gdut.designpattern.builder;

/**
 * @ClassName MyAirShipDirector
 * @Desctiption 实现装配者
 * @Date 2020/6/27 16:09
 */
public class MyAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip creatAirShip() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOritalModul();

        // 装配飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);

        return ship;
    }
}
