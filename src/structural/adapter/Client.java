package structural.adapter;

/**
 * 客户端类：
 *  相当于电脑，只有usb接口
 *
 * @author wangfj
 */
public class Client {

    public void request(Target target){
        target.handleReq();
    }
}
