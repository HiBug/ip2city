package com.xin;

import com.maxmind.db.CHMCache;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.model.CityResponse;

import java.io.InputStream;
import java.net.InetAddress;

/**
 * @author three
 * @since 2019/1/16 16:20
 * <p>
 *
 * </p>
 */
public class Ip2CityUtil {
    public static CityResponse getCityByIp(String ip) throws Exception {
        InputStream    cityDatabase = Ip2CityUtil.class.getResourceAsStream("/GeoLite2-City.mmdb");
        DatabaseReader cityInfo     = new DatabaseReader.Builder(cityDatabase).withCache(new CHMCache()).build();
        return cityInfo.city(InetAddress.getByName(ip));
    }
}
