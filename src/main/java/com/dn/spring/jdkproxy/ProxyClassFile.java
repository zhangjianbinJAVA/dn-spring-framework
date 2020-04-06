package com.dn.spring.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 将代理类写入文件中，对文件通过反编译工具查看内存中的代理类是什么样子
 *
 * @author: zh
 * @date: 2020/3/25/025 21:49
 */
public class ProxyClassFile {

    public static void createProxyClassFile(Class clazz) {
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{clazz});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
            fileOutputStream.write(data);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
