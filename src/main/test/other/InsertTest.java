package other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * InsertTest
 * 用于测试高效插入千万级数据的测试方法
 *
 * @author 丁旭
 * @E-mail <a href="mailto:dingxu@sjgtw.com"/>
 * @date 2016/4/25
 */
public class InsertTest {



    public static void main(String args[]) throws SQLException {
        Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.1.211:3310/archsite?useUnicode=true&characterEncoding=utf8","developer","d123456");
        // 开时时间
        Long begin = new Date().getTime();
        // sql前缀
        String prefix = "INSERT INTO test_user (user_name,PASSWORD,card_num,update_Count,create_Time,modify_Time,deleted) VALUES ";
        try {

            // 保存sql后缀
            StringBuffer suffix = new StringBuffer();
            // 设置事务为非自动提交
            conn.setAutoCommit(false);
            // Statement st = conn.createStatement();
            // 比起st，pst会更好些
            PreparedStatement pst = conn.prepareStatement("");
            // 外层循环，总提交事务次数
            for (int i = 1; i <= 2000; i++) {
                // 第次提交步长
                for (int j = 1; j <= 10000; j++) {
                    // 构建sql后缀
                    suffix.append("('").append(i * j).append("username','password',4,4,SYSDATE(),SYSDATE(),0),");
                }
                // 构建完整sql
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // 添加执行sql
                pst.addBatch(sql);
                // 执行操作
                pst.executeBatch();
                // 提交事务
                conn.commit();
                // 清空上一次添加的数据
                suffix = new StringBuffer();
            }
            // 头等连接
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 结束时间
        Long end = new Date().getTime();
        // 耗时
        System.out.println("cast : " + (end - begin) / 1000 + " ms");
    }
}
