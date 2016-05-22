package com.itheima.a02_sqlitedatabase;

import android.database.sqlite.SQLiteDatabase;
import android.test.InstrumentationTestCase;

import org.junit.Before;

/**
 * Created by M on 2016/5/22.
 */
public class MyOpenHelperTest extends InstrumentationTestCase {
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testDb() throws Exception {
        // getTargetContext:获取一个虚拟的上下文.如果使用getContext会出现数据库无法打开的问题，
        // 参考http://stackoverflow.com/questions/5088796/cannot-open-database-in-android-test-app
//        MyOpenHelper oh = new MyOpenHelper(getInstrumentation().getTargetContext(), "people.db", null, 1);
        MyOpenHelper oh = new MyOpenHelper(getInstrumentation().getTargetContext(), "people.db", null, 2);
        //如果数据库不存在，先创建数据库，再获取可读可写的数据库对象，如果数据库存在，就直接打开
        SQLiteDatabase db = oh.getWritableDatabase();
        //如果存储空间满了，那么返回只读数据库对象
//        SQLiteDatabase db = oh.getReadableDatabase();
    }
}
