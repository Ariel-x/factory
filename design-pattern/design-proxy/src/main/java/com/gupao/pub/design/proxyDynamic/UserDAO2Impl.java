package com.gupao.pub.design.proxyDynamic;

public class UserDAO2Impl implements UserDAO2 {
    @Override
    public void save(String name) {
        System.out.println("核心，保存用户数据：" + name);
    }

    @Override
    public void query(Integer id) {
        System.out.println("核心，查询用户 David" );
    }

    @Override
    public void update(String name) {
        System.out.println("核心，更新用户： " + name );
    }
}
