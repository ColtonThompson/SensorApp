package com.colton.projectthree.data.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.colton.projectthree.data.storage.LoginContract.LoginEntry;

public class LoginDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "project_three.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + LoginEntry.TABLE_NAME + " (" +
                    LoginEntry._ID + " INTEGER PRIMARY KEY," +
                    LoginEntry.COLUMN_NAME_USERNAME + " TEXT," +
                    LoginEntry.COLUMN_NAME_PASSWORD + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + LoginEntry.TABLE_NAME;

    public LoginDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
