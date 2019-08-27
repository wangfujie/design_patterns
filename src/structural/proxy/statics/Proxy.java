package structural.proxy.statics;

/**
 * 代理角色：实现抽象角色，将统一的流程控制放入代理角色中处理
 *
 * @author wangfj
 */
public class Proxy implements SourceAble {

    //真实角色对象，操作真实角色的方法（代理行使权力）
    private SourceAble source;

    public Proxy(SourceAble source){
        this.source = source;
    }

    @Override
    public void proxyMethod() {
        before();
        source.proxyMethod();
        after();
    }

    private void before() {
        System.out.println("代理自己的流程方法before");
    }

    private void after() {
        System.out.println("代理自己的流程方法after");
    }
}
