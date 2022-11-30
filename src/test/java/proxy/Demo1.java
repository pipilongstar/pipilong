package proxy;

import proxy.CGLIBProxyFactory;
import proxy.MyInterface1;
import proxy.MyInterfaceImpl;

/**
 * @author pipilong
 * @createTime 2022/10/21
 * @description
 */
public class Demo1 {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface=new MyInterfaceImpl();
        CGLIBProxyFactory cglibProxyFactory = new CGLIBProxyFactory();

        MyInterface1 proxy = (MyInterfaceImpl) cglibProxyFactory.getProxy(myInterface.getClass());

        proxy.lll();

    }
}
