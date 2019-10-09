package com.hunau.text;/**
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @Author: 王春蕾
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 *@开发版本：综合练习v0.1
        */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "王春蕾学号为201841882203";
    }
}
