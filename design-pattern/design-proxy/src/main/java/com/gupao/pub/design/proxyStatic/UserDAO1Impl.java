package com.gupao.pub.design.proxyStatic;

public class UserDAO1Impl implements UserDAO1{

    @Override
    public void save(String name) {
        System.out.println("核心，保存用户数据：" + name);
    }

    @Override
    public void query(Integer id) {
        System.out.println("核心，查询用户 David" );
    }
}
