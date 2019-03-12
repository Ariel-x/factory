package com.gupao.pub.design;

/**
 * 普通方法，直接调用业务方式
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "操作前打印日志。。。" );

        UserDAO userDAO = new UserDAOImpl();
        userDAO.save("David");

        System.out.println( "操作后打印日志。。。" );
    }
}
