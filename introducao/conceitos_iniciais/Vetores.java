import java.util.ArrayList;

public class Vetores {
    public static void main(String[] args){
        //declaração do array -> tipo[] nome;

        // inicializar array 
        // - direta:
        int[] idades = {18, 19, 20};
        int idade = idades[1];

        System.out.println(idade);

        // - indireta -> inicializa para depois inserir os valores
        int[] ano = new int[3];
        //ano.lenght;
        ano[0] = 2006;
        ano[1] = 2005;
        ano [2] = 2004;

        System.out.println(ano[0] + ", " + ano[1] + ", " + ano[2]);

        // -array dinâmico: ArrayList - como se fosse um tipo
        ArrayList<Integer> matriculas = new ArrayList<Integer>();
        matriculas.add(2024);
        matriculas.add(2023);
        matriculas.add(2022);
        matriculas.add(2021);

        // -metodos auxiliares: remove, pega um valor e tamanho
        matriculas.remove(1);
        matriculas.get(0);
        matriculas.size();

        for (int i = 0; i < matriculas.size(); i++) {
            System.out.println(matriculas.get(i));
        }
    }
}

