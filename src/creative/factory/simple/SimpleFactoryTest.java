package creative.factory.simple;

/**
 * 简单工厂测试类
 *
 * @author wangfj
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //发送邮件
        SendFactory.produceMail().sendMsg();
        //发送短信
        SendFactory.produceSms().sendMsg();
    }
}
