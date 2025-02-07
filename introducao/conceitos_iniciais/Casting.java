public class Casting {
    //transforma o valor de um tipo para outro, ex:float 22.50 para 22
    // casting implicito -> transforma sem declarar a transformação, parte de uma representação menor para uma maior, ex: int para double, mas o contrario da erro
    public static void main(String[] args){
        int nota1 = 9;
        double nota2 = nota1;

        System.out.println("Nota1: " + nota1); 
        System.out.println("Nota2: " + nota2); 

    // casting explicito -> transforma declarando, independente do tamanho da representação da variável

        char letra = 'a';
        String nome = String.valueOf(letra);

        letra = nome.charAt(0);
    }
}
