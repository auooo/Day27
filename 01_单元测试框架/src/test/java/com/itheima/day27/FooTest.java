package com.itheima.day27;

import org.junit.Assert;
import org.junit.Test;;

/**
 * Created by M on 2016/5/22.
 */
public class FooTest {

    @Test
    public void addTest() {
        int x = Foo.add(3, 5);

        //断言：用来检测实际值与期望值是否一致
//        Assert.assertEquals(7,x);
        Assert.assertEquals(8,x);
    }

    @Test
    public void divideTest() {
        Foo.divide(3, 1);
//        Foo.divide(3, 0);
    }
}
