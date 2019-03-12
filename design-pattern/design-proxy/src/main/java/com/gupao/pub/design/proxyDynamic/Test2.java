package com.gupao.pub.design.proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test2 {

    public static void main(String[] args) {

        /*
        动态代理，不需要根据接口的变动而变动
         */
        UserDAO2 userDAO2 = (UserDAO2) Proxy.newProxyInstance(UserDAO2.class.getClassLoader(),
                new Class[]{UserDAO2.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println( "非核心操作前，打印日志。。。" );
                        Object result = method.invoke(new UserDAO2Impl(), args);
                        System.out.println( "非核心操作后，打印日志。。。" );
                        return result;
                    }
                });

//        userDAO2.save("David");
        userDAO2.query(1);
    }

}
