package com.example.pattern.享元模式;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 通过连接池的管理，实现了数据库连接的共享，不需要每一次都重新创建连接，节省了数据库重新创建
 * 的开销，提升了系统的性能！
 *
 * @author liwen
 */
public class ConnectionPool {
    private Vector<Connection> pool;

    /**
     * 公有属性
     */
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.driver";

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    private Connection conn = null;

    /**
     * 构造方法，做一些初始化的工作
     */
    private ConnectionPool () {
        pool = new Vector<>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            }catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 返回连接到连接池
     */
    public synchronized void release() {
        pool.add(conn);
    }

    /**
     * 获取数据库连接
     * @return
     */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }else {
            return null;
        }
    }
}
