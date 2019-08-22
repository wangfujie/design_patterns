package creative.factory.simple;

/**
 * 短信发送实现类
 *
 * @author wangfj
 */
public class SmsSender implements Sender {

    @Override
    public void sendMsg() {
        System.out.println("发送短信方法。。。");
    }
}
