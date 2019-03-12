package com.gupao.pub.design.proxyStatic;

/**
 * 静态代理
 * 实现接口，一但接口发生改变，代理也要发生改变
 *
 */
public class UserDAOProxy implements UserDAO1 {

    private UserDAO1 userDAO1;


    public UserDAOProxy(UserDAO1Impl userDAO1) {
        this.userDAO1 = userDAO1;
    }

    @Override
    public void save(String name) {

        System.out.println( "保存非核心操作前，打印日志。。。" );
        userDAO1.save(name);
        System.out.println( "保存非核心操作后，打印日志。。。" );

    }

    @Override
    public void query(Integer id) {
        System.out.println( "查询非核心操作前，打印日志。。。" );
        userDAO1.query(id);
        System.out.println( "查询非核心操作后，打印日志。。。" );
    }
}
