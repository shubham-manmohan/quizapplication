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
import java.sql.Statement;
import java.util.ArrayList;
import techquiz.dbutil.DBConnection;
import techquiz.pojo.PerformancePOJO;
import techquiz.pojo.StudentScorePOJO;

/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class PerformanceDAO {
    public static ArrayList<String> getAllExamId(String studentId)throws SQLException
    {
       String qry="select examid from performance where userid=?";
       ArrayList<String> examIdList=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1, studentId);
       ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               String id=rs.getString(1);
               examIdList.add(id);
           }
               
    return examIdList;                      
   }
    
    
    public static void addPerformance(PerformancePOJO performance)throws SQLException{
        String qry="insert into performance values(?,?,?,?,?,?,?)";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1, performance.getUserId());
           ps.setString(2, performance.getExamId());
           ps.setString(3, performance.getSubject());
           ps.setInt(4,performance.getRight());
           ps.setInt(5,performance.getWrong());
           ps.setInt(6,performance.getUnattempted());
           ps.setDouble(7,performance.getPer());
           
           ps.executeUpdate();
           }

    public static ArrayList<String> getAllStudentId()throws SQLException
    {
       String qry="select distinct userid from performance";
       ArrayList<String> studentIdList=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
           
           while(rs.next()){
               String id=rs.getString(1);
               studentIdList.add(id);
           }
               
    return studentIdList;                      
   }

    public static StudentScorePOJO getScore(String studentId,String examId)throws SQLException{
        String qry="Select subject,percentage from performance where userid=? and examid=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,studentId);
        ps.setString(2,examId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        StudentScorePOJO scoreObj=new StudentScorePOJO();
        scoreObj.setSubject(rs.getString(1));
        scoreObj.setPer(rs.getDouble(2));
        return scoreObj;
        }

    public static ArrayList<PerformancePOJO> getAllData()throws SQLException{
       String qry="select * from performance order by userid";
       ArrayList<PerformancePOJO> performanceList=new ArrayList<PerformancePOJO>();
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       while(rs.next()){
               String userId=rs.getString("userid");
               String examId=rs.getString("examid");
               String subject=rs.getString("subject");
               int right=rs.getInt("right");
               int wrong=rs.getInt("wrong");
               int unattempted=rs.getInt("unattempted");
               double percentage=rs.getDouble("percentage");
               PerformancePOJO p=new PerformancePOJO(userId,examId,subject,right,wrong,unattempted,percentage);
               performanceList.add(p);
          }
       return performanceList;
         
        }

    
}
