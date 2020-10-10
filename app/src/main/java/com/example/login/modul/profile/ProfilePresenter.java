package com.example.login.modul.profile;

import android.os.Bundle;

public class ProfilePresenter implements ProfileContract.Presenter {
    private final ProfileContract.View view;
    private final Bundle bundle;

    public ProfilePresenter(ProfileContract.View view, Bundle bundle) {
        this.view = view;
        this.bundle = bundle;
    }

    public String retrieveUsername() {
        return bundle.getString("username");
    }

    @Override
    public String retrievePassword() {
        return bundle.getString("password");
    }

    @Override
    public void start() {

    }
}
