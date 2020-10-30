import java.util.Random;

public class Compare {
    public static void main(String[] args) {
        int[] listofInt = new int[11];
        Random cunt = new Random();


        for(int i = 0; i < listofInt.length; i++){
            listofInt[i] = cunt.nextInt(100) + 1 ;
        }

        for(int n = 0; n < listofInt.length; n++) {
            if (listofInt[n] > listofInt[10]) {
                System.out.println(listofInt[n] + " is greater than " + listofInt[10]);
            }
            else if (listofInt[n] < listofInt[10]) {
                System.out.println(listofInt[n] + " is smaller than " + listofInt[10]);
            } else {
                System.out.println(listofInt[n] + " is equal to " + listofInt[10]);
            }
        }

    }

}
