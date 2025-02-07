package breecrowd;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("forneça o número: ");
        int entrada = scanner.nextInt();

        int range = 10;
        int i = 1;
        while(i <= range){
            int x = i * entrada;
            i = i+1;


            System.out.println(x);
    }
}
}
