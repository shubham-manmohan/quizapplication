/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techquiz.pojo;

import java.util.ArrayList;

/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class QuestionsStore {
     ArrayList <QuestionPOJO> questionList;
    public QuestionsStore()
    {
       questionList=new ArrayList<>();
    }
    public void addQuestion(QuestionPOJO q){
        questionList.add(q);
    }
    
    public QuestionPOJO getQuestionByQno(int qno)
    {
    for(QuestionPOJO question:questionList){
            if(question.getQno()==qno)
                return question;
        }
        return null;
    }
    
    public QuestionPOJO getQuestion(int pos){
        return questionList.get(pos);
    }
   public void removeQuestion(int pos){
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos,QuestionPOJO q){
        questionList.add(pos, q);
    }
    public ArrayList<QuestionPOJO> getAllQuestions(){
        return questionList;
    }
    public int getCount(){
        return questionList.size();
    }

    @Override
    public String toString() {
        return "QuestionsStore{" + "questionList=" + questionList + '}';
    }


}
