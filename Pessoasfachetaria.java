import java.util.Scanner;

public class Pessoasfachetaria {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n1;
        String nome;

        System.out.println("Informe o nome: ");
        nome = input.next();

        System.out.println("Informe a idade: ");
        n1 = input.nextInt();

        if (n1 >= 0 && n1 <=12 )
        {
            
         System.out.print("Voce é bebe \n");

        }else if ( n1 >= 13 && n1 <=17) {
            System.out.print("Voce é adolecente\n");
        }else if (n1>= 18 && n1 <= 59){
            System.out.print("Voce é adulto \n");
        }else if (n1>60 ){
            System.out.print("Voce é idoso \n");
        }
    
    }
}
