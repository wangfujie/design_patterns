package creative.build;

/**
 * 建造者模式：将一个复杂对象的构建与他的表示相分离，使得同样的构建过程可以创建不同的表示
 * 场景：建造一个复杂的产品时，比如，火箭、飞船、手机等。复杂的产品需要装配子组件可能需要步骤问题。
 * 在实际开发中，对象构建时，也很复杂，有很多步骤需要处理。
 *
 * 本质：分离了对象子组件的单独构造（由Builder负责）和装配（由Director负责）
 *      由于实现了构建和装配的解耦。不同的构建器，相同的装配，也可以做出不同的对象；相同的构建器，不同的装配顺序也可以做出不同的对象。
 *      也就是实现了构建算法、装配算法的解耦，实现了更好的复用
 *
 *  建造者模式一般与工厂模式联合使用（组件的创建需要通过工厂来）
 *
 * @author wangfj
 */
public class BuilderTest {

    public static void main(String[] args) {
        //对于用户来说，只需要直到装配器和所需对象，即可获取到对象实例，对象实现细节由装配器实现
        //装配器获取
        IAirShipDirector airShipDirector = new AirShipDirector(new AirShipBuilder());
        //装配对象
        AirShip airShip = airShipDirector.directorAirShip();

        System.out.println(airShip);
    }
}
