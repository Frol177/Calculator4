package com.example.calculator4;

public enum Theme {
    OPTION1("option_1", R.style.Theme_Calculator4),
    OPTION2("option_2", R.style.Theme_Calculator4Light);

    Theme(String key, int resurse) {
        this.key = key;
        this.resurse = resurse;
    }

    public String getKey() {
        return key;
    }

    private final String key;

    public int getResurse() {
        return resurse;
    }

    private final int resurse;

}
