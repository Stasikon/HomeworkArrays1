import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] box = new int[3];
        box[1] = 1;
        box[2] = 2;
        box[3] = 3;
        double[] box2 = {1.57, 7.654, 9.986};

        char[] box3 = {'m', 'n', 'i', 'a' };
    }

    public static void task2() {
        int[] box = {1, 2, 3};
        double[] box2 = {1.57, 7.654, 9.986};
        char[] box3 = {'m', 'n', 'i', 'a' };
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i]);
            if (i != box.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < box2.length; i++) {
            System.out.print(box2[i]);
            if (i != box2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < box3.length; i++) {
            System.out.print(box3[i]);
            if (i != box3.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task3() {
        int[] boxT = {1, 2, 3};
        double[] boxT2 = {1.57, 7.654, 9.986};
        char[] boxT3 = {'m', 'n', 'i', 'a' };
        for (int i = boxT.length - 1; i >= 0; i--) {
            System.out.print(boxT[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = boxT2.length - 1; i >= 0; i--) {
            System.out.print(boxT2[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = boxT3.length - 1; i >= 0; i--) {
            System.out.print(boxT3[i]);
            if (i != 0) {
                System.out.print(", ");

            }
        }
        System.out.println();
    }
    public static void task4(){
        int[] boxTs = {1, 2, 3};
        for (int i = 0; i < boxTs.length; i++) {
            if(boxTs[i]%2!=0){
                boxTs[i]+=1;
            }
        }
        System.out.println(Arrays.toString(boxTs));
    }

}