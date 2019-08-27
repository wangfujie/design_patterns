package structural.proxy.dynamic;

import structural.proxy.statics.Source;
import structural.proxy.statics.SourceAble;

import java.lang.reflect.Proxy;

/**
 * 动态代理：
 *
 *
 * @author wangfj
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        SourceAble source = new Source();
        SourceHandler handler = new SourceHandler(source);
        SourceAble proxy = (SourceAble) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{SourceAble.class}, handler);
        proxy.proxyMethod();
    }
}
