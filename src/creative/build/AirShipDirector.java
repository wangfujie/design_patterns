package creative.build;

/**
 * 装配器实现类
 *
 * @author wangfj
 */
public class AirShipDirector implements IAirShipDirector {

    private AirShipBuilder builder;

    AirShipDirector(AirShipBuilder builder){
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        AirShip airShip = new AirShip();
        //装配轨道舱
        airShip.setOrbitalModule(builder.builderOrbitalModule());
        //装配发动机
        airShip.setEngine(builder.builderEngine());
        //装配逃逸仓
        airShip.setEscapeTower(builder.builderEscapeTower());
        return airShip;
    }
}
