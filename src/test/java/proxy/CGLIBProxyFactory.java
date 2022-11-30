package proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author pipilong
 * @createTime 2022/10/21
 * @description
 */
public class CGLIBProxyFactory implements MethodInterceptor {

    public Object getProxy (Class cls){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(cls);

        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before...");

        Object res = methodProxy.invokeSuper(o, objects);

        System.out.println("after...");
        return res;
    }
}

























