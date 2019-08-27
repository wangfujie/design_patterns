package structural.adapter;

/**
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口。
 * Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作；
 *
 * 实现：将Client和AdapterObject适配
 *
 * @author wangfj
 */
public class AdapterTest {

    public static void main(String[] args) {
        Client client = new Client();
        AdapterObject adapterObject = new AdapterObject();
        Target targetAdapter = new Adapter(adapterObject);
        client.request(targetAdapter);
    }
}
