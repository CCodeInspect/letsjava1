package others;

public class Array02 {
    public static void main(String[] args) {
        int num = 5;
        int[] intArray = new int[num];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray + " : " + intArray[i]);
        }
        ;
    }
}
