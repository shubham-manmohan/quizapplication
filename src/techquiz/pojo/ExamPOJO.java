/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techquiz.pojo;

/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class ExamPOJO {
    private String examId;
    private String subject;
    private int totalQuestions;

    public ExamPOJO(String examId, String subject, int totalQuestions) {
        this.examId = examId;
        this.subject = subject;
        this.totalQuestions = totalQuestions;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
    
    
}
