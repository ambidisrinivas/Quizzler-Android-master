package com.londonappbrewery.quizzler;

/**
 * Created by AMBIDI SRINIVAS on 09-08-2017.
 */

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionResourceId,boolean trueOrFlase){
        mQuestionId = questionResourceId;
        mAnswer = trueOrFlase;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
