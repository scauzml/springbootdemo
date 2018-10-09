package com.controller;


import com.model.TvSeriesDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author 张明亮
 * @date 2018/10/8 16:24
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public List<TvSeriesDto> home() {
        List<TvSeriesDto> list=new ArrayList<>();
        Date date=new Date();
        list.add(new TvSeriesDto(1, "haha",date));
        list.add(new TvSeriesDto(2, "enen",date));
        list.add(new TvSeriesDto(3, "enen",date));
        return list ;
    }
}
