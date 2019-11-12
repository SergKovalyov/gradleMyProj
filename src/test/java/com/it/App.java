package com.it;

import com.it.Helpers.CommonHelper;
import com.it.Helpers.DashBordHelper;
import com.it.Helpers.LoginHelper;
import com.it.Pages.DashBordPage;
import com.it.Pages.LoginPage;


public class App {
    public LoginHelper login;
    public DashBordHelper dashbord;
    public CommonHelper common;

    public App() {
        login = new LoginHelper();
        dashbord = new DashBordHelper();
        common = new CommonHelper();
    }
}
