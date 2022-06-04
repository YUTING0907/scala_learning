package chapter07.scalaoop;

/**
 * @author yuting
 * @version 1.0
 * @date 2022/6/4 3:23 PM
 */
public class JavaDaynamicBind {
    public static void main(String[] args) {
        /**
         * 将一个子类的对象地址，交给了一个AA(父类的)引用
         * java的动态绑定机制的小结
         *    1.如果调用的是方法，则Jvm将该方法和对象的内存地址绑定
         *    2.如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应值
         */
         AA obj = new BB();
         System.out.println(obj.sum());
         System.out.println(obj.sum1());
    }
}

class AA{
    public int i =10;
    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i+10;
    }
    public int getI(){
        return i;
    }
}

class BB extends AA{
    public int i = 20;
    @Override
    public int getI(){
        return i;
    }
}
