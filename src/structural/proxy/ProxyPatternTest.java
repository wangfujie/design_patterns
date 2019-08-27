package structural.proxy;

import structural.proxy.statics.Proxy;
import structural.proxy.statics.Source;
import structural.proxy.statics.SourceAble;

/**
 * 代理模式：通过代理，控制对象的访问
 * 可以详细控制访问某个对象的方法，在调用这个方法前做前置处理，调用这个方法后做后置处理。（即：AOP的微观实现！）
 *
 * @author wangfj
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        SourceAble source = new Source();
        SourceAble proxy = new Proxy(source);
        proxy.proxyMethod();
    }
}
