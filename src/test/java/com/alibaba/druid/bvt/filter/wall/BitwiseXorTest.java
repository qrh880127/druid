package com.alibaba.druid.bvt.filter.wall;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.druid.wall.WallConfig;
import com.alibaba.druid.wall.WallUtils;

public class BitwiseXorTest extends TestCase {

    public void test_false() throws Exception {
        Assert.assertFalse(WallUtils.isValidateMySql(//
        "SELECT * from t where id = 1 ^ 2")); //
    }

    public void test_true() throws Exception {
        WallConfig config = new WallConfig();
        config.setConditionOpBitwseAllow(true);
        Assert.assertTrue(WallUtils.isValidateMySql(//
        "SELECT * from t where id = 1 ^ 2", config)); //
    }
}
