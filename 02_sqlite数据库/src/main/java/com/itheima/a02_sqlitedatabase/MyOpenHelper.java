package com.itheima.a02_sqlitedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by M on 2016/5/22.
 */
public class MyOpenHelper extends SQLiteOpenHelper {
    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //数据库创建时，此方法会调用
    @Override
    public void onCreate(SQLiteDatabase db) {
        System.out.println("数据库被创建了");
    }

    //数据库升级时，此方法会调用
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("数据库升级了");
    }
}
