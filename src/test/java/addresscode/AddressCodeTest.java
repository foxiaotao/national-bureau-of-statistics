package addresscode;

import com.alibaba.fastjson.JSONArray;

/**
 * function:
 * date: 2019/10/31
 *
 * @author: suntao
 */
public class AddressCodeTest {
    public static void main(String[] args) {
        JSONArray citiesJson = ChinaCityNameUtils.getCitiesJson();
        System.out.println(citiesJson);
    }
}
