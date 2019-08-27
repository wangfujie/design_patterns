package creative.prototype;

/**
 * 测试原型模式和new方式效率
 *
 * @author wangfj
 */
public class PrototypeTest {

    private static void testNew(int size){
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Prototype prototype = new Prototype();
        }
        long end  = System.currentTimeMillis();
        System.out.println("new方式耗时：" + (end - start));
    }

    private static void testProto(int size) throws Exception{
        long start = System.currentTimeMillis();
        Prototype prototype = new Prototype();
        for (int i = 0; i < size; i++) {
            Prototype prototypeC = prototype.clone();
        }
        long end  = System.currentTimeMillis();
        System.out.println("原型模式方式耗时：" + (end - start));
    }

    public static void main(String[] args) throws Exception {
        testNew(10000);
        testProto(10000);
    }
}
