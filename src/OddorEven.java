import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int odd = 0;
        int even = 0;
        int count = 0;


        for (int i = 0; i < 10; i++){
            numbers[i] = scanner.nextInt();
            count++;
            if (numbers[i] == 0){
                count--;
                break;
            }
        }

        for (int n = 0; n < count ; n++){
            if (numbers[n] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("odds: " + odd + " evens: " + even);
    }
}
