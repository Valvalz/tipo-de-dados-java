import java.util.Scanner;

public class SomaDeNumeros {


    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n1, n2, soma;
        
        System.out.println("Informe o valor do primeiro numero : ");
        n1 = input.nextInt();

        System.out.println("Informe o valor do segundo numero ");
        n2 = input.nextInt();

        soma = n1 + n2 ;

        System.out.print("Seu primeiro numero foi = " + n1);
        System.out.print("\n Seu segundo numero foi = " + n2);
        System.out.print("\n A soma dos dos dois numero = " + soma + "\n");
    }
    
}
