package 原型模式;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Address add = new Address("Colin Street",15);
        Person p = new Person("Li",15);
        p.setAdd(add);
        Person p2 = p.clone();
        Person p3 = p.deepClone();
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
}
