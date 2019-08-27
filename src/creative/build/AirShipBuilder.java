package creative.build;

/**
 * 构建器实现类
 *
 * @author wangfj
 */
public class AirShipBuilder implements IAirShipBuilder {

    @Override
    public Object builderOrbitalModule() {
        System.out.println("构建轨道舱");
        //这里可以通过工厂模式获取实例
        return "轨道舱对象";
    }

    @Override
    public Object builderEngine() {
        System.out.println("构建发动机");
        //这里可以通过工厂模式获取实例
        return "发动机对象";
    }

    @Override
    public Object builderEscapeTower() {
        System.out.println("构建逃逸塔");
        //这里可以通过工厂模式获取实例
        return "逃逸塔对象";
    }
}
