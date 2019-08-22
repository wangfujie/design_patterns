package creative.factory.method;

/**
 * 工厂方法模式：
 * 简单工厂有个问题，类的创建依赖工厂类，也就是说，如果想扩展程序，必须对工厂类进行修改，这违背了闭包原则
 * 工厂方法模式解决此问题：创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，直接增加新的工厂类即可，无需修改之前的代码
 * 此方法好处是增加功能不需要修改以前的代码，只需要增加相关的实现类和工厂类即可，扩展性较好。
 * @author wangfj
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

    }
}
