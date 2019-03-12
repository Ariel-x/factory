package com.gupao.pub.design;

public class UserDAOImpl implements UserDAO {

    @Override
    public void save(String name) {

        System.out.println("保存用户操作：" + name);

    }
}
