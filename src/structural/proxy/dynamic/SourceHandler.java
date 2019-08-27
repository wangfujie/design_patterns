package structural.proxy.dynamic;

import structural.proxy.statics.SourceAble;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理处理类
 *
 * @author wangfj
 * @datetime 2019-08-27 21:54
 */
public class SourceHandler implements InvocationHandler {

    private SourceAble sourceAble;

    public SourceHandler(SourceAble sourceAble){
        this.sourceAble = sourceAble;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 方法
     * @param args  方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("动态代理方法执行----------");
        if (method.getName().equals("proxyMethod")){
            //执行代理方法
            method.invoke(this.sourceAble, args);
        }
        return result;
    }
}
