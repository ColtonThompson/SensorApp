package com.colton.projectthree.data.storage;

import android.provider.BaseColumns;

public final class LoginContract {

    private LoginContract() {}

    public static class LoginEntry implements BaseColumns {
        public static final String TABLE_NAME = "account";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
}
