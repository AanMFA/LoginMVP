package com.example.login.modul.profile;

import com.example.login.base.BasePresenter;
import com.example.login.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<ProfileContract.Presenter> {
    }

    interface Presenter extends BasePresenter {
        String retrieveUsername();
        String retrievePassword();
    }
}
