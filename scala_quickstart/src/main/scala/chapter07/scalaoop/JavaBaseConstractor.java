package chapter07.scalaoop;

/**
 * @author yuting
 * @version 1.0
 * @date 2022/6/4 3:18 PM
 */
public class JavaBaseConstractor {
    public static void main(String[] args) {
        B b = new B();
        B mm = new B("mm");

    }
}

class A{
    public A(){
        System.out.println("A()");
    }

    public A(String name){
        System.out.println("A(String name)" + name);
    }
}


class B extends A{
    public B(){
        //这里会隐式调用super(); 就是无参的父类构造器A()
        //super();
        System.out.println("B()");
    }

    public B(String name){
        super(name);
        System.out.println("B(String name)" + name);
    }
}