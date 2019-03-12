package com.gupao.pub.design.proxyStatic;

public class Test1 {

    public static void main(String[] args) {

//        UserDAO1 userDAO = new UserDAO1Impl();
//        userDAO.save("David");

        //静态代理
        UserDAO1 userDAO1 = new UserDAOProxy(new UserDAO1Impl());
        userDAO1.save("David");

        userDAO1.query(1);

    }

}
