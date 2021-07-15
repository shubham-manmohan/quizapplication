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
import techquiz.pojo.ExamPOJO;


/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class ExamDAO {

    public static String getExamId() throws SQLException
    {
        int rowCount;
        Connection conn=DBConnection.getConnection();
        Statement ps=conn.createStatement();
        ResultSet rs=ps.executeQuery("select count(*) as totalrows from exam");
        rs.next();
        rowCount=rs.getInt(1);
        String newId="EX->"+(rowCount+1);
        return newId;
    }
   public static boolean addExam(ExamPOJO newExam)throws SQLException{
        String qry="Insert into exam values(?,?,?)";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, newExam.getExamId());
        ps.setString(2, newExam.getSubject());
        ps.setInt(3,newExam.getTotalQuestions());
        int ans=ps.executeUpdate();
        return ans==1;
     }
   public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("select examid from exam where subject=?");
     ps.setString(1, subject);
     ResultSet rs=ps.executeQuery();
     ArrayList <String> examIdList=new ArrayList <>();
     while(rs.next())
     {
      examIdList.add(rs.getString(1));
     }
     return examIdList;
   }
   public static int getQuestionCountByExam(String examId)throws SQLException{
        String qry="select totalquestions from exam where examid=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,examId);
        ResultSet rs=ps.executeQuery();
	rs.next();
          return rs.getInt(1);

        }
   


       public static boolean isPaperSet(String subject)throws SQLException{
       String qry="select examid from exam where subject=? ";       
           Connection conn=DBConnection.getConnection();
           PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1,subject);
           ResultSet rs=ps.executeQuery();
           return rs.next();
    }
       
       public static ArrayList<String> getExamIdBySubject(String userid,String subject)throws SQLException{
       String qry="select examid from exam where subject=? minus select examid from performance where userid=?";
       ArrayList<String> examList=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,subject);
        ps.setString(2,userid);
        ResultSet rs=ps.executeQuery();
       while(rs.next()){
               examList.add(rs.getString(1));
           }
         return examList;        
    }
      

}
