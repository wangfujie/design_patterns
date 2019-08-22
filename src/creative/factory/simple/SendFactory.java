package creative.factory.simple;

/**
 * 简单工厂模式：发送邮件和短信的简单工厂例子
 *
 * @author wangfj
 */
public class SendFactory {

    /**
     * 生产发送短信的实例
     */
    public static Sender produceSms(){
        return new SmsSender();
    }

    /**
     * 生产发送邮件的实例
     */
    public static Sender produceMail(){
        return new MailSender();
    }

}
