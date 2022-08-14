package others;

public class Arrary04 {
    public static void main(String[] args) {
        MerchandiseUsingVariable[] arrary = new MerchandiseUsingVariable[5];
        for (int i = 0; i < arrary.length; i++) {
            //一级跳
            System.out.println(arrary[i]);
            //二级跳，终于知道空指针咋来的了～
            System.out.println(arrary[i].sex);

            arrary[i] = new MerchandiseUsingVariable();
            System.out.println(arrary[i]);
        }
        ;
        for (int j = 0; j < arrary.length; j++) {
            arrary[j].sex = "female";
            System.out.println(arrary[j]);

        }
        ;
    }
}
