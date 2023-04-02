package com.raoyalong.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author raoyalong
 * @create 2023 - 03 - 25 23:17
 */
public class RegexPractise {

    String content = "Java17已经在2021年9月份发布，虽说目/前//大部分\\java生产环境上还是java8和java11，" +
            "但作为技术积累，了解并学习Java17相对Java11的新特性还是很重要的。" +
            "从2017年9月发布Java9开始，Java进入相对快速的迭代节奏，每半年发布一个新版本，每三年发布一个LTS长期支持版本。" +
            "因此Java开发者保持三年一次对新的LTS版本的学习是比较好的。至于生产环境要不要上新的LTS版本，有太多技术以外的因素影响，只能说保持低一个LTS版本挺好的。" +
            "比如Java11出来了就用Java8，Java17出来了就用Java11。。。java" +
            "这里对Java12到Java17的一系列新特性进行整理学习，主要关注那些对开发影响比较大的新特性。a";


    @Test
    public void regPractise3() {
        //?i不区分大小写
        Pattern pattern = Pattern.compile("(?i)java(?:9|8)");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }

    String str = "java,haha";

    @Test
    public void regPractise1() {
        //?i不区分大小写
        Pattern pattern = Pattern.compile("ha$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }

    @Test
    public void regPractise2() {
        //?i不区分大小写
        Pattern pattern = Pattern.compile("a$");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }

    @Test
    public void regPractise4() {
        //反向分组 去掉重复的字
        String str = "我我要学学学编程";
        Pattern pattern = Pattern.compile("(.)\\1+");
        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()) {
//            System.out.println("找到：" + matcher.group(0));
//        }
//        String s = Pattern.compile("(.)\\1+").matcher(str).replaceAll("$1");
        System.out.println(str.replaceAll("(.)\\1+", "$1"));
    }

    //^(?!.*public).*
    //^((?!public).)*
}
