package com.pcschool.ocp.d16_derby.case2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//更新資料
public class UpdateRecord {

    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/Demo"; // 資料庫的位置在哪裡 ?
        String username = "app";
        String password = "app";
        // 建立資料庫連線
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        //假設要修改 id = 1 這一筆的價格 = 600 !!!這方法不大好,當程式失敗,無法關閉
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM book WHERE id = 1";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.last()) {// 是否有資料? 將游標指向該筆紀錄
            rs.last();
            rs.updateInt("price", 600);
            // ...
            //rs.cancelRowUpdates();
            rs.updateRow();
            System.out.println("Update Success!");
        } else {
            System.out.println("Update Error!");
        }
        conn.close();
    }
}