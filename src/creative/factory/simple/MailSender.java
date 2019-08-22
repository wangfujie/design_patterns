package creative.factory.simple;

/**
 * 邮件发送实现类
 *
 * @author wangfj
 */
public class MailSender implements Sender {

    @Override
    public void sendMsg() {
        System.out.println("发送邮件方法。。。");
    }
}
