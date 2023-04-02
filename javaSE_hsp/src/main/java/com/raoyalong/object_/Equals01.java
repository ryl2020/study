package com.raoyalong.object_;

/**
 * @author raoyalong
 * @create 2022 - 12 - 31 15:50
 */
public class Equals01 {

    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);

        B bobj = a;
        System.out.println(bobj == c);

        "hello".equals("abc");

        System.out.println(new String("hello"));
    }
}

class B {

}

class A extends B{

}
