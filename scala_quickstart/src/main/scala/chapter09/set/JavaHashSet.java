package chapter09.set;

import java.util.HashSet;

/**
 * @author yuting
 * @version 1.0
 * @date 2022/6/5 11:14 AM
 */
public class JavaHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet<String>();
        hs.add("jack");
        hs.add("tom");
        hs.add("jack");
        hs.add("jack2");
        // [jack2, tom, jack]
        System.out.println(hs);
    }
}
