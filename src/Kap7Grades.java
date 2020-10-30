import java.util.Scanner;

public class Kap7Grades {

    public static void grades(int[] studentgrades, String[] classes){
        for(int v = 0; v < studentgrades.length; v++){
        for (int m = 0; m < studentgrades.length - 1; m++){
            if (studentgrades[m] < studentgrades[m + 1]) {
                int temp = studentgrades[m];
                studentgrades[m] = studentgrades[m + 1];
                studentgrades[m + 1] = temp;
                String temp2 = classes[m];
                classes[m] = classes[m + 1];
                classes[m + 1] = temp2;
            }
            }

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many students: ");

        String[] classes = new String[scanner.nextInt()];
            for(int i = 0; i < classes.length;i++){
            System.out.println("Student: " + i);
            classes[i] = scanner.next();
        }

        int[] studentgrades = new int[classes.length];
            for (int n = 0; n < classes.length; n++){
            studentgrades[n] = scanner.nextInt();
            System.out.println(classes[n] + " grade:" + studentgrades[n]);
            }

            grades(studentgrades, classes);

            for (int b = 0; b < classes.length; b++){
                if (b == 0){
                    System.out.println(classes[b] + " has earned " + studentgrades[b] + " which gives an A");}

                else if (studentgrades[0] - studentgrades[b] < 5){
                    System.out.println(classes[b] + " has earned " + studentgrades[b] + " which gives an A");}

                else if (studentgrades[0] - studentgrades[b] < 10){
                    System.out.println(classes[b] + " has earned " + studentgrades[b] + " which gives an B");}

                else if (studentgrades[0] - studentgrades[b] < 15){
                    System.out.println(classes[b] + " has earned " + studentgrades[b] + " which gives an C");}

                else if (studentgrades[0] - studentgrades[b] < 20){
                    System.out.println(classes[b] + " has earned " + studentgrades[b] + " which gives an D");}

                else{
                    System.out.println(classes[b] + " has earned " + studentgrades[b] + " which gives an F");}

            }
            }



        }


