package Methodd;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Person {
    public String name;
    public String sex;
    public int age;

    double score;


    public void getPerson() {
        System.out.println("姓名是" + name + ",性别是" + sex + ",年龄是" + age);
    }

    ;

    public String getName() {
        System.out.println(name);
        return name;
    }

    ;

    public int getAge() {
        System.out.println(age);
        return age;
    }

    ;


    public int getScore() {
        System.out.println((int) score);
        return (int) score;
    }

    ;

    public String getSex(String sex) {
        System.out.println(sex);
        return sex;
    }

    ;
}
