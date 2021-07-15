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
public class AnswerStorePOJO {
     ArrayList <AnswerPOJO> answerList;
    public AnswerStorePOJO(){
        answerList=new ArrayList<>();
    }
    public void addAnswer(AnswerPOJO answer){
        answerList.add(answer);
    }
    public AnswerPOJO getAnswer(int pos){
        return answerList.get(pos);
    }
    public void removeAnswer(int pos){
        answerList.remove(pos);
    }
    public void setAnswerAt(int pos,AnswerPOJO answer){
        answerList.add(pos, answer);
    }
    public ArrayList<AnswerPOJO> getAllAnswers(){
        return answerList;
    }
    public int getCount(){
        return answerList.size();
    }
    public AnswerPOJO getAnswerByQno(int qno){
        for(AnswerPOJO answer:answerList){
            if(answer.getQno()==qno)
                return answer;
        }
        return null;
    }
    public int removeAnswer(AnswerPOJO answer){
       int pos=answerList.indexOf(answer);
        answerList.remove(pos);
        return pos;
    }
  
}
