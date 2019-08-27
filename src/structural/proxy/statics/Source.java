package structural.proxy.statics;

/**
 * 真实角色：实现抽象角色，实现代理方法，
 *
 * @author wangfj
 */
public class Source implements SourceAble {

    @Override
    public void proxyMethod() {
        //真正的业务逻辑
        System.out.println("真实角色的方法，真正的业务逻辑实现！");
    }
}
