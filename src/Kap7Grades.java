import java.util.Scanner;

public class Kap7Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many students: ");
        String[] classes = new String[scanner.nextInt()];
        for(int i = 0; i < classes.length;i++){
            classes[i] = scanner.nextLine();
            System.out.println("Student: " + i);
        }
        for(int n = 0; n < classes.length; ++n){
            System.out.println(classes[n]);
        }
    }
}
