package cn.tangz.api;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 测试
 *
 * @author: tz
 * @create: 2020-08-18
 **/
@RestController
@RequestMapping("/api/testApi")
public class TestApi {

    /**
     * 测试
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Object test(@RequestBody HashMap<String, String> map) {

        String testValue = map.getOrDefault("testValue", "");
        HashMap<String, String> resultMap = new HashMap<>(2);
        resultMap.put("testResult", "Result:" + testValue);
        return resultMap;
    }

    /**
     * 测试
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/testNum", method = RequestMethod.POST)
    public Object testNum(@RequestBody HashMap<String, String> map) {

        String testValue = map.getOrDefault("testValue", "");
        HashMap<String, String> resultMap = new HashMap<>(2);
        resultMap.put("testResult", String.valueOf(StringUtils.isNumericSpace(testValue)));

        try {
            Double num = Double.valueOf(testValue);
            resultMap.put("tryResult", String.valueOf(true));
        } catch (Exception e) {
            resultMap.put("tryResult", String.valueOf(false));
        }
        return resultMap;
    }
}
