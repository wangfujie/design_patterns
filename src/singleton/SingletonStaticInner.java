package singleton;

/**
 *
 * 单例模式：静态内部类方式（线程安全）
 *
 * @author wangfj
 */
public class SingletonStaticInner {

    private SingletonStaticInner(){}

    public static SingletonStaticInner getInstance(){
        return SingletonHolder.instance;
    }

    //私有的静态内部类
    private static class SingletonHolder{
        private static final SingletonStaticInner instance = new SingletonStaticInner();
    }

}
