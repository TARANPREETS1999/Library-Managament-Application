package com.example.waheguru.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="Students.db";
    public static final String TABLE_NAME ="Students_table";
   //Attributes Id,Name, bookname and Date
    public static final String COL_1 ="ID";
    public static final String COL_2 ="S_name";
    public static final String COL_3 ="B_name";
    public static final String COL_4 ="R_day";
    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db= this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY ,S_name TEXT,B_name TEXT,R_day INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
