package proxy;

import proxy.MyInterface;
import proxy.MyInterface1;

/**
 * @author pipilong
 * @createTime 2022/10/21
 * @description
 */
public class MyInterfaceImpl implements MyInterface, MyInterface1 {

    @Override
    public void say() {
        System.out.println("hello pipilong");
    }

    @Override
    public int lll() {
        System.out.println("lll");
        return 0;
    }
}
