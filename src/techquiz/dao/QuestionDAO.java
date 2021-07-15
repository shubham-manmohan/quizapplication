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
import java.util.ArrayList;
import techquiz.dbutil.DBConnection;
import techquiz.pojo.QuestionPOJO;
import techquiz.pojo.QuestionsStore;

/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class QuestionDAO {
    public static void addQuestions(QuestionsStore qstore)throws SQLException{
       String qry="Insert into questions values(?,?,?,?,?,?,?,?,?)";
       ArrayList <QuestionPOJO> questionList=qstore.getAllQuestions();
        Connection conn=DBConnection.getConnection();
           PreparedStatement ps=conn.prepareStatement(qry);
          for(QuestionPOJO obj:questionList){
           ps.setString(1, obj.getExamId());
           ps.setString(2, obj.getSubject());
           ps.setInt(3, obj.getQno());
           ps.setString(4,obj.getQuestion());
           ps.setString(5,obj.getAnswer1());
           ps.setString(6,obj.getAnswer2());
           ps.setString(7,obj.getAnswer3());
           ps.setString(8,obj.getAnswer4());
           ps.setString(9,obj.getCorrectAnswer());
          
           ps.executeUpdate();
           }
      }
    
    public static ArrayList<QuestionPOJO> getQuestionsByExamId(String examId) throws SQLException
    {
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("select * from questions where examid=?");
     ps.setString(1, examId);
     ResultSet rs=ps.executeQuery();
     ArrayList <QuestionPOJO> questionList=new ArrayList<>();
     while(rs.next())
     {
         String subject=rs.getString(2);
         int qno=rs.getInt(3);
         String question=rs.getString(4);
         String option1=rs.getString(5);
         String option2=rs.getString(6);
         String option3=rs.getString(7);
         String option4=rs.getString(8);
         String correctOption=rs.getString(9);
         QuestionPOJO newQuestion=new QuestionPOJO(examId,subject,qno,question,option1,option2,option3,option4,correctOption);
         questionList.add(newQuestion);
     }
     return questionList;
    }

    public static void updateQuestions(QuestionsStore qstore)throws SQLException{
        Connection conn=DBConnection.getConnection();
        String qry="Update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correctanswer=? where examid=? and qno=?";
        ArrayList <QuestionPOJO> questionList=qstore.getAllQuestions();
       
        
           
           PreparedStatement ps=conn.prepareStatement(qry);
           for(QuestionPOJO obj:questionList){
           ps.setString(1, obj.getQuestion());
           ps.setString(2, obj.getAnswer1());
           ps.setString(3, obj.getAnswer2());
           ps.setString(4, obj.getAnswer3());
           ps.setString(5, obj.getAnswer4());
           ps.setString(6, obj.getCorrectAnswer());
           ps.setString(7, obj.getExamId());
           ps.setInt(8,obj.getQno());
           ps.executeUpdate();
           }
    }

}
