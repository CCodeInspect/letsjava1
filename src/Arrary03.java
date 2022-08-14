public class Arrary03 {
    public static void main(String[] args) {
        MerchandiseUsingVariable[] m1arrary = new MerchandiseUsingVariable[5];
        for (int i = 0; i < m1arrary.length; i++) {
            if (i % 2 == 0) {
                m1arrary[i] = new MerchandiseUsingVariable();
            }
            ;
        }
        for (int j = 0; j < m1arrary.length; j++) {
            System.out.println(m1arrary[j]);
        }
        ;
    }
};

