package com.example.calculator4;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemStorage {

    public static final String KEY_THEME = "KEY_THEME";
    private Context context ;
    private SharedPreferences sharedPreferences;

    public ThemStorage(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("ThemPref", Context.MODE_PRIVATE);
    }

    public Theme getTheme() {
        String key = sharedPreferences.getString(KEY_THEME,Theme.OPTION1.getKey());
        for (Theme theme: Theme.values()) {
            if(theme.getKey().equals(key)) {
                return theme;
            }
        }
        throw new RuntimeException("TTT");
    }

    public void setTheme(Theme theme) {
        sharedPreferences.edit().putString(KEY_THEME,theme.getKey()).apply();
    }
}
