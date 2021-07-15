/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techquiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import techquiz.dbutil.DBConnection;
import techquiz.pojo.UserPOJO;

/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class UserDAO {

    public static boolean validateUser(UserPOJO up)throws SQLException
    {
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from loginuser where userid=? and password=? and usertype=?");
    ps.setString(1,up.getUserId());
    ps.setString(2,up.getPassword());
    ps.setString(3,up.getUserType());
    
    ResultSet rs=ps.executeQuery();
    
    return rs.next(); 
    }
    
    public static boolean registerUser(UserPOJO newUser) throws SQLException
    {
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("insert into loginuser values(?,?,?)");
    ps.setString(1, newUser.getUserId());
    ps.setString(2, newUser.getPassword());
    ps.setString(3, newUser.getUserType());
    
    int ans=ps.executeUpdate();
    return ans==1;
    }
    
    public static void updatePassword(String userId,String password) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      String qry="update loginuser set password=? where userid=?";
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1, password);
       ps.setString(2, userId);
       ps.executeUpdate();
       JOptionPane.showMessageDialog(null, "Password Successfully Saved!!! \nRe-Login With New Password!!!");
       
    }
    
}
