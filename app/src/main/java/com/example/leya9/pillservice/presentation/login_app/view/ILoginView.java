package com.example.leya9.pillservice.presentation.login_app.view;

import com.arellomobile.mvp.MvpView;

public interface ILoginView extends MvpView{
    void showProgress();
    void hideProgress();
    void showNextView();
    void IdValidError(Number error);
    void passwordValidError(String error);
    void showError(String error);
}
