import java.util.Locale;
import java.util.Scanner;

public class Bee1154 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int cont = 0;
        int soma = 0;

        while (idade > 0){
            soma = soma + idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }
       double media = (double) soma / cont;
        System.out.printf("%.2f%n", media);
        sc.close();
    }
}
