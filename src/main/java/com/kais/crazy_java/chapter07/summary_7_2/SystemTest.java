package com.kais.crazy_java.chapter07.summary_7_2;

import lombok.var;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * @author kais
 * @date 2022.08.18. 11:47
 */
public class SystemTest {
    public static void main(String[] args) throws Exception {
        // 获取系统所有的环境变量
        Map<String, String> env = System.getenv();
        for (var name : env.keySet()) {
            System.out.println(name + " ---> " + env.get(name));
        }
        // 获取指定环境变量的值
        System.out.println(System.getenv("JAVA_HOME"));
        // 获取所有的系统属性
        Properties props = System.getProperties();
        // 将所有系统属性保存到props.txt文件中
        props.store(new FileOutputStream("props.txt"), "System Properties");
        // 输出特定的系统属性
        System.out.println(System.getProperty("os.name"));
    }
}
