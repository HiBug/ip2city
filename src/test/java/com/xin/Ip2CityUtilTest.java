package com.xin;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @author three
 * @since 2019/1/16 16:20
 * <p>
 *
 * </p>
 */

public class Ip2CityUtilTest {

    @Test
    public void test() throws Throwable {
        System.out.println(JSON.toJSONString(Ip2CityUtil.getCityByIp("180.155.118.42")));
    }

}
