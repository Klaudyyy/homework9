import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] inputArray1 = {1000, 2000, 3000, 4000, 5000};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int value : inputArray1) {
            sum = sum + value;
            if (value > max) {
                max = value;
            }
            if (value < min)
                min = value;
            }
            float average = (float) sum / inputArray1.length;
            float[] outputArray1 = {sum, max, min, average};
            for (int i = 0; i < inputArray1.length; i++) {
                System.out.print(inputArray1[i] + "  ");

            }
            System.out.println();

            for (int i = 0; i < outputArray1.length; i++) {
                System.out.print(outputArray1[i] + " ");
            }
            System.out.println();


        int[] inputArray2 = {2500, 3000, 10000, 13000, 18000};
        double[] outputArray2 = new double[5];
            double tax  = 0.13;
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * tax;
        }
        System.out.println("Входной массив (выплаты): " + Arrays.toString(inputArray2));
        System.out.println("Выходной массив (налог 13%): " + Arrays.toString(outputArray2));


        int[] inputArray3 = {1000, 6000, 3000, 7000, 5000};
        boolean[] outputArray3 = new boolean[5];
        int index = 0;
        for (int bonus : inputArray3) {
            if (bonus > 5000) {
                outputArray3[index] = true;
            } else {
                outputArray3[index] = false;
            }
            index++;
        }
        System.out.println("Входной массив: " + Arrays.toString(inputArray3));
        System.out.println("Выходной массив: " + Arrays.toString(outputArray3));



        int[] inputArray4 = {2500 , 5700, 1700, -3500 , 12500};
        boolean outputArray4 = true;
        int badValue = 0;
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                badValue = balance;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);
        if (!outputArray4) {
            System.out.println(" проблемное значение :" + badValue);


            int[] inputArray5 = {190000, 98500, -194000, 458000, 98788};
            int outputArray5 = 0;
            for (int i = 0; i < inputArray5.length; i++)
                if (inputArray5[i] > 0)
                    outputArray5 ++;
            System.out.println(Arrays.toString(inputArray5));
            System.out.println("Месяцев рентабельно " + outputArray5);

        }

        }
        }

