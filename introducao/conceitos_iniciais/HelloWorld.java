import java.util.Scanner;

public class HelloWorld {
    public static int soma(int a, int b){
        int c = a + b;
        return c;
    }
    public static double soma(double a, double b){
        return 0.0;
    }
 
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int y = sc.nextInt();
        int z = soma(x, y);
        System.out.printf("%2d + %2d é igual a %2d.", x, y, z); 
    }
}