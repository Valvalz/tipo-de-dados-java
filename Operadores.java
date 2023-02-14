import java.text.Format;

public class Operadores {
    
    public static void main(String[] args){
        int x = 9;
        int y = 2;

        System.out.print("x + y = %d\n" , x + y);
        System.out.print("x - y = %d\n" , x - y);
        System.out.print("x * y = %d\n" , x * y);
        System.out.print("x / y = %d\n" , x / y);
        System.out.print("x / y = %2.2d\n" , x /(double)y);
        System.out.print("x %% y = %d\n" , x % y);
    
}
