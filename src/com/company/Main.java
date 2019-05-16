import java.lang.*;
import java.util.Scanner;

class Main {
    public static void checkResistor() {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("What coulor you want to check? ");
        word = input.nextLine();

        int i = 0;

        String[] arr = new String[10];
        arr[0] = "Black";
        arr[1] = "Brown";
        arr[2] = "Red";
        arr[3] = "Orange";
        arr[4] = "Yellow";
        arr[5] = "Green";
        arr[6] = "Blue";
        arr[7] = "Violet";
        arr[8] = "Grey";
        arr[9] = "White";

        for (i = 0; i < arr.length; i++) {
            if (word.equals(arr[i])) {
                System.out.println(i);
            }
        }
    }

    public static void darts(){
        Scanner place = new Scanner(System.in);
        System.out.println("How was your darts (x,y)");
        int x,y;
        x = place.nextInt();
        y = place.nextInt();

        if(0<(x+y)&&(x+y)<=2){
            System.out.println("You get 10 point ");
        }else if(2<(x+y)&&(x+y)<=10){
            System.out.println("You get 5 point");
        }else {
            System.out.println("You dont gat any point");
        }


    }

    public static void main(String[] args) {
//Make function here
        //checkResistor();
        darts();
    }

}

