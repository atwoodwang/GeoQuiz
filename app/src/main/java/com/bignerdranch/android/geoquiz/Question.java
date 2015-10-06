package com.bignerdranch.android.geoquiz;

/**
 * Created by Zicong on 2015/10/3.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTure;

    public Question(int textResId, boolean answerTure){
        mTextResId = textResId;
        mAnswerTure = answerTure;
    }

    public int getTextResId() {return mTextResId;}

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTure() {
        return mAnswerTure;
    }

    public void setAnswerTure(boolean answerTure) {
        mAnswerTure = answerTure;
    }


}
