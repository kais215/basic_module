package com.kais.crazy_java.chapter06.summary_6_7;

import lombok.var;

/**
 * @author kais
 * @date 2022.08.10. 16:15
 * 区分外部类与内部类同名的实例变量，外部类.this.实例变量/内部类.实例变量
 */
public class DiscernVariable {

    private String prop = "外部类的实例变量";

    private class InClass {

        private String prop = "内部类的实例变量";

        public void info() {
            var prop = "局部变量";
            // 通过 外部类类名.this.varName 访问外部类实例变量
            System.out.println("外部类的实例变量值："
                    + DiscernVariable.this.prop);
            // 通过 this.varName 访问内部类实例的变量
            System.out.println("内部类的实例变量值：" + this.prop);
            // 直接访问局部变量
            System.out.println("局部变量的值：" + prop);
        }
    }
    public void test() {
        var in = new InClass();
        in.info();
    }
    public static void main(String[] args) {
        new DiscernVariable().test();
    }

}
