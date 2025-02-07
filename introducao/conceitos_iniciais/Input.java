import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);

        System.out.print("Digite sua data de nascimento: ");
        String data = scanner.nextLine();
        System.out.println(data);
    }
    
}
