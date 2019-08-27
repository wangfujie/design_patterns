package creative.prototype;

import java.io.*;

/**
 * 原型模式：将一个对象作为原型，对其进行复制、克隆，产生一个和原理对象类似的新对象。
 * 实现Cloneable接口，它是个空接口，做标记用（标记接口）
 *
 * 场景：短时间大量创建对象时，new方式效率低，原型模式创建对象效率高
 * 一般和工厂方法模式一起使用，通过clone的方法创建一个对象，然后由工厂方法提供给调用者
 *      spring中的bean的创建实际就是两种：单例模式和原型模式。（@Scope注解的singleton和prototype属性），当然，原型模式需要和工厂模式搭配使用
 *
 * @author wangfj
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String string;
    private Object obj;

    /**
     * 浅复制：将一个对象复制后，基本数据类型的变量会重新创建，而引用类型指向的还是原对象所指向的。
     */
    public Prototype clone() throws CloneNotSupportedException {
        //调用的Object的clone方法，该方法是native方法
        return (Prototype) super.clone();
    }

    /**
     * 深复制：将一个对象复制后，不论是基本数据类型还是引用类型都重新创建，深复制是完全彻底的复制，而浅复制不彻底。
     * 要实现深复制，需要采用流的形式读入当前对象的二进制输入，在写出二进制数据对应的对象。
     */
    public Prototype deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流（序列化）
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制产生的新对象（反序列化）
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(inputStream);

        return (Prototype) ois.readObject();
    }
}
