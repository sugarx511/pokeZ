package cn.tangz.api;

import cn.tangz.service.HatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author: tz
 * @create: 2020-08-19
 **/
@RestController
@RequestMapping("/api/hatchApi")
public class HatchApi {

    @Autowired
    private HatchService hatchService;

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


}
