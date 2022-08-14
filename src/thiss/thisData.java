package thiss;

public class thisData {
    public String name;
    public String sex;

    public void set(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.get();
    }

    ;

    public void get() {
        System.out.println("我叫" + name + "!我是" + sex + "生");

    }

    ;

    public static void main(String[] args) {
        thisData thisData = new thisData();
        thisData.set("pauline", "女");
        thisData.get();

    }
}
