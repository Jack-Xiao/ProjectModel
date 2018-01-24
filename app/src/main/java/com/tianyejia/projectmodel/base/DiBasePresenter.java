package com.tianyejia.projectmodel.base;

/**
 * Created by xiaojiang on 2018/1/23.
 */

public interface DiBasePresenter<T extends DiBaseView> extends BasePresenter {

    void attachView(T view);

    void detachView();
}