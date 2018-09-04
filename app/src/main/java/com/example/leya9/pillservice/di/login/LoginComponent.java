package com.example.leya9.pillservice.di.login;

import com.example.leya9.pillservice.presentation.login_app.presenter.LoginAppPresenter;
import com.example.leya9.pillservice.presentation.login_healthcare.presenter.LoginHealthCarePresenter;

import dagger.Component;

@Component(modules = {LoginModule.class})
public interface LoginComponent {
    void inject(LoginAppPresenter loginAppPresenter);
    void inject(LoginHealthCarePresenter loginHealthCarePresenter);
}
