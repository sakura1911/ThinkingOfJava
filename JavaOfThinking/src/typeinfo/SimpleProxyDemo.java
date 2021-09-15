package typeinfo;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-15 14:32
 **/

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse" + arg);
    }
}

/**
 * 动态代理：根据RTTI在运行期间根据具体的对象调用对象的方法实现
 *  不仅动态代理对象而且动态处理对代理方法的调用。
 *  在动态代理上进行的所有调用都被重定向到单个调用处理程序
 *  该处理程序负责发现调用的内容并决定如何处理
 *
 * 对象代理可以调用该接口的同名方法实现
 * 不需要不同对象分别去调用实现，可以管理一类操作
 * 可以将额外的操作与“真实对象”做分离（指对相同接口实现类的一类操作）
 *
 */
class SimpleProxy implements Interface {
    private Interface proxied;

    SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse" + arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    /**
     * consumer接受Interface
     * 不论获得的是RealObject还是SimpleProxy
     * 在客户端和RealObject之间插入了SimpleProxy执行操作
     * 在RealObject上调用相同的方法
     *
     * @param iface
     */
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }


}
