import java.util.Scanner;

public class Bee1115 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X, Y;

        X = sc.nextInt();
        Y = sc.nextInt();


        int primeiro, segundo, terceiro, quarto;

        while (X != 0 && Y != 0){
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
                X = sc.nextInt();
                Y = sc.nextInt();
            }
        else if (X < 0 && Y > 0){
                System.out.println("segundo");
                X = sc.nextInt();
                Y = sc.nextInt();
            }
        else if (X < 0 && Y < 0){
                System.out.println("terceiro");
                X = sc.nextInt();
                Y = sc.nextInt();
            }
        else{
                System.out.println("quarto");
                X = sc.nextInt();
                Y = sc.nextInt();

            }
        }

        sc.close();

    }

}
