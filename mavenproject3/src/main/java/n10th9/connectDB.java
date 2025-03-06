/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n10th9;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Acer
 */
public class connectDB {
    public static Connection KetnoiDB(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = ("jdbc:mysql://localhost:3306/nhanvien?zeroDateTimeBehavior=CONVERT_TO_NULL");
//            String url = ("jdbc:mysql://localhost:3306/thongtinsach?zeroDateTimeBehavior=CONVERT_TO_NULL");
//            String url = ("jdbc:mysql://localhost:3306/nhacungcap?zeroDateTimeBehavior=CONVERT_TO_NULL");
//             String url = ("jdbc:mysql://localhost:3306/quanlytacgia?zeroDateTimeBehavior=CONVERT_TO_NULL");
            String user = "root";
            String pass  =  "";
            con = DriverManager.getConnection(url, user , pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
