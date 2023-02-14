import java.text.Format;

public class Operadores {
    
    public static void main(String[] args){
        int x = 9;
        int y = 2;

        System.out.printf("x + y = %d\n" , x + y);
        System.out.printf("x - y = %d\n" , x - y);
        System.out.printf("x * y = %d\n" , x * y);
        System.out.printf("x / y = %d\n" , x / y);
        System.out.printf("x / y = %2.2d\n" , x /(double)y);
        System.out.printf("x %% y = %d\n" , x % y);
    
    }
}