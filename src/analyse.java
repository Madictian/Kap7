import java.util.Scanner;

public class analyse {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int uses = 0;
        int equalorabove = 0;
        int below = 0;

        for (int n = 0;n < 100; n++){
           numbers[n] = scanner.nextInt();
           uses++;
           sum += numbers[n];
           if(numbers[n] < 0){
               numbers[n] = 0;
               uses--;
               break;
           }
        }

        int average = sum / uses;

        for(int m = 0; m < uses; m++){
            if (numbers[m] > average){
                below++;
            }else{
                equalorabove++;
            }
        }
        System.out.println(equalorabove + " are average or above, and " + below + " are below the average of " + average);

    }
}
