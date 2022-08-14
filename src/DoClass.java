public class DoClass {
    public static void main(String[] args) {
        CClass cClass = new CClass();


        //student 是个引用，所以需要创建对象，否则会报空指针。
        cClass.student = new Student();
        cClass.student.name = "123";
        cClass.student.age = 1;
        cClass.student.sex = "female";
        System.out.println(cClass.student.age);
        System.out.println(cClass.student.sex);
        System.out.println(cClass.student.name);


        cClass.teacher = new Teacher();
        cClass.teacher.name = "tt";
        cClass.teacher.sex = "male";
        System.out.println(cClass.teacher.sex);
        System.out.println(cClass.teacher.name);


    }
}
