package com.example.songyang.healthmanager.login.presenter;

import com.example.songyang.healthmanager.login.model.ILoginModel;
import com.example.songyang.healthmanager.login.model.LoginModel;
import com.example.songyang.healthmanager.login.view.ILoginView;

/**
 * Created by SongYang on 2016/4/13.
 */
public class LoginPresenter implements ILoginPresenter {

    private ILoginModel mLoginModel;
    private ILoginView mLoginView;

    public LoginPresenter(ILoginView view) {
        mLoginView = view;
        mLoginModel = new LoginModel();
    }

    @Override
    public void login(String userName, String password) {
        boolean result = mLoginModel.checkUserAuthority(userName, password);
        mLoginView.showLoginResult(result);
    }
}
