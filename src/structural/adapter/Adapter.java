package structural.adapter;

/**
 * 适配器，实现客户需求
 * 相当于usb和ps/2转接头
 *
 * 类适配器方式：继承需要适配的类，调用父类的适配方法
 * 对象适配方式：将需要适配的类作为成员属性
 *
 * @author wangfj
 */
public class Adapter implements Target{

    private AdapterObject adapterObject;

    Adapter(AdapterObject adapterObject){
        this.adapterObject = adapterObject;
    }

    @Override
    public void handleReq() {
        adapterObject.request();
    }
}
