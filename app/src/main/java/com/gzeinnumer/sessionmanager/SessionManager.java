package com.gzeinnumer.sessionmanager;

import android.content.Context;
import android.content.SharedPreferences;

//todo 67
public class SessionManager {
    private String PREF_NAME = "SIMPAN";
    private String KEY_ID = "antrian_id";

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;


    public SessionManager(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void setIdAntrian(String id) {
        mEditor = mSharedPreferences.edit();
        mEditor.putString(KEY_ID, id).apply();
    }

    public String getIdAntrian() {
        return mSharedPreferences.getString(KEY_ID, null);
    }

    public void logout() {
        mEditor = mSharedPreferences.edit();
        mEditor.clear().commit();
    }


}
