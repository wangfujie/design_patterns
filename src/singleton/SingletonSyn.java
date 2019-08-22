package singleton;

/**
 * 单例模式，线程安全
 *
 * @author wangfj
 */
public class SingletonSyn {

    //volatile保证可见性，禁止指令重排
    private static volatile SingletonSyn instance;

    private SingletonSyn(){}

    /**
     * 双重检测，提高同步性能
     * @return
     */
    public static SingletonSyn getInstance(){
        if (null != instance){
            return instance;
        }
        synchronized (SingletonSyn.class){
            if (null == instance) {
                instance = new SingletonSyn();
            }
        }
        return instance;
    }
}
