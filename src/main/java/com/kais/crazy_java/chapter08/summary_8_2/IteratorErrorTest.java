package com.kais.crazy_java.chapter08.summary_8_2;

import lombok.var;

import java.util.HashSet;

/**
 * @author kais
 * @date 2022.08.19. 13:57
 */
public class IteratorErrorTest {
    public static void main(String[] args) {
        // 创建集合、添加元素的代码与前一个程序相同
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");

        // 获取books集合对应的迭代器
        var it = books.iterator();
        while (it.hasNext()) {
            var book = (String) it.next();
            System.out.println(book);
            if (book.equals("疯狂Android讲义")) {
                // 使用Iterator迭代过程中，不可修改集合元素,下面代码引发异常
                books.remove(book);
            }
        }
    }
}
