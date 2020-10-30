import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[50];
        int i = scanner.nextInt();
        while (i != 0){
            if (i > 0 && 50 < i){
                i = scanner.nextInt();
            }else{
                numbers[i - 1]++;
            }
            i = scanner.nextInt();
        }

        for (int n = 0; n < numbers.length ; n++){
            if (numbers[n] == 1){
                System.out.println(n + 1 + " occurs " + numbers[n] + " time" );
            }else if(numbers[n] > 1){
                System.out.println(n + 1 + " occurs " + numbers[n] + " times");

            }
        }



    }
}
