package creative.build;

/**
 * 宇宙飞船类
 *
 * @author wangfj
 */
public class AirShip {

    //轨道舱
    private Object orbitalModule;

    //发动机
    private Object engine;

    //逃逸塔
    private Object escapeTower;

    public Object getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(Object orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Object getEngine() {
        return engine;
    }

    public void setEngine(Object engine) {
        this.engine = engine;
    }

    public Object getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(Object escapeTower) {
        this.escapeTower = escapeTower;
    }

    @Override
    public String toString() {
        return "airShip{" + this.orbitalModule + ":" + this.engine + ":" + this.escapeTower + "}";
    }
}
