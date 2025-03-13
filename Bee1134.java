import java.util.Scanner;

public class Bee1134 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tipoCombustivel = sc.nextInt();

        int contAlcool = 0, contGasolina = 0, contDiesel = 0;

        while (tipoCombustivel != 4){
            if (tipoCombustivel == 1){
                contAlcool = contAlcool + 1;
            }
            else if (tipoCombustivel == 2){
                contGasolina = contGasolina + 1;
            }
            else if (tipoCombustivel == 3){
                contDiesel = contDiesel + 1;
            }

            tipoCombustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ contAlcool);
        System.out.println("Gasolina: "+ contGasolina);
        System.out.println("Diesel: "+ contDiesel);

        sc.close();

    }

}
