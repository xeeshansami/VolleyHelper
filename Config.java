package com.cloudchef.VolleyApiHelper;

import android.content.SharedPreferences;

/**
 * Created by xeeshan7860 on 2/16/2018.
 */

public class Config
{


    //URL to our login.php file
    public static final String Chef_LOGIN_URL = "http://lara.cloudchef.pk/chefLogin";
    public static final String Chef_LOGOUT_URL = "http://lara.cloudchef.pk/chefLogout";
    public static final String Chef_IMAGE_URL = "http://lara.cloudchef.pk/chefUpdateImage";
    public static final String User_LOGIN_URL = "http://lara.cloudchef.pk/userLogin";
    public static final String User_LOGOUT_URL = "http://lara.cloudchef.pk/chefLogout";
    public static final String User_REGISTRATION_URL = "http://lara.cloudchef.pk/userRegister";

    public  static final SharedPreferences.Editor editor = null;

    // Directory name to store captured images and videos
    public static final String IMAGE_DIRECTORY_NAME = "Android File Upload";

    //Keys for email and password as defined in our $_POST['key'] in login/logout
    public static final String KEY_CHEF_IMAGE = "ImageData";
    public static final String KEY_EMAIL = "Email";
    public static final String KEY_PASSWORD = "Password";
    public static final String KEY_NAME = "Name";
    public static final String KEY_CONTACT = "Contact";
    public static final String KEY_ADDRESS = "Address";

    //server request with though to ID that means logout is successful
    public static final String CHEFID = "ChefId";
    public static final String USERID = "UserId";


    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "Success";


}
