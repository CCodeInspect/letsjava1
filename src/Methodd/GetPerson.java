package Methodd;

public class GetPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 12;
        person.sex = "female";
        person.name = "pauline";
        person.score = 12.43;

        person.getPerson();
        person.getName();
        person.getAge();
        person.getScore();
        person.getSex("male");
        //为什么这里报错要搞清楚
//        person.getName(person.getSex("male"));
    }


}
