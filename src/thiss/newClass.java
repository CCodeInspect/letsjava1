package thiss;

public class newClass {
    public String name;
    public int age;


    public void setAge(int age) {
        this.age = age;
//        System.out.println(age);
    }

    public void setName(String name) {
        this.name = name;
//        System.out.println(name);
    }

    public void gget(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + this.age);
        System.out.println(name + age);
    }


    public static void main(String[] args) {
        newClass newClass = new newClass();
        newClass.setAge(12);
        newClass.setName("pauline");
        newClass.gget("pauline", 12);
    }
}
