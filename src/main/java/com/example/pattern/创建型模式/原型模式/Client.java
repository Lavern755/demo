package com.example.pattern.创建型模式.原型模式;

import java.io.IOException;

/**
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型
 * 来创建新的对象。
 *
 * @author liwen
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Address address = new Address("China", "guangdong", "baolong", "zhongjunyunjingfu");
        Person person = new Person();
        person.setName("中骏");
        person.setAge(3);
        person.setAddress(address);

        System.out.println(person);
        Person clonePerson = person.clone();
        System.out.println(clonePerson);

        System.out.println("---修改person属性---");
        clonePerson.setName("clone中骏");
        System.out.println(person);
        System.out.println(clonePerson);

        // 浅拷贝的例子
        System.out.println("---修改address属性---");
        clonePerson.getAddress().setArea("American");
        System.out.println(person);
        System.out.println(clonePerson);


        System.out.println("---深度拷贝---");
        // 深拷贝的例子
        System.out.println(person);
        Person deepClonePerson= (Person) person.deepClone();
        System.out.println(deepClonePerson);

        System.out.println("---修改person属性---");
        deepClonePerson.setName("deepClone中骏");
        System.out.println(person);
        System.out.println(deepClonePerson);

        // 修改address
        System.out.println("---修改address属性---");
        deepClonePerson.getAddress().setCountry("American");
        System.out.println(person);
        System.out.println(deepClonePerson);
    }
}
