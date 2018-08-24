package com.example.leya9.pillservice.business.login;

import io.reactivex.Completable;

public interface ILoginInteractor {
    Completable login(Number id, String password);
    Completable registration(Number id, String password);
    Completable isLoggined();
}
