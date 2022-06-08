package uz.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.feign.util.FeignServiceUtil;

import java.util.HashMap;

@RestController
@RequestMapping("/demo")
public class FeignController {

    @Autowired
    private FeignServiceUtil feignServiceUtil;

    @GetMapping
    public HashMap<String, String> getData(){
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", feignServiceUtil.getName());
        hm.put("address", feignServiceUtil.getAddress());
        hm.put("status", feignServiceUtil.getStatus());
        return hm;
    }

}
