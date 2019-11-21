package com.androidcodeshop.mvpdemo;

public interface GetQuoteInteractor {

    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);

}
