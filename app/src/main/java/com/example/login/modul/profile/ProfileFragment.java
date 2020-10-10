package com.example.login.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.login.R;
import com.example.login.base.BaseFragment;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {
    TextView username;
    TextView password;

    public ProfileFragment() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this, getActivity().getIntent().getExtras());
        mPresenter.start();

        username = fragmentView.findViewById(R.id.tvUsername);
        password = fragmentView.findViewById(R.id.tvPassword);
        username.setText(mPresenter.retrieveUsername());
        password.setText(mPresenter.retrievePassword());
        setTitle("My Profile View");

        return fragmentView;
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
