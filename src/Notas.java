import java.util.*;
public class Notas {
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o numero de alunos: ");
        int qtd = leitor.nextInt();

        double somaNotas = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1));
            float nota = leitor.nextFloat();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida");
                i--;
            }
            else {
                somaNotas += nota;
            }
        }
        double media = somaNotas / qtd;
        System.out.println("Media das notas: " + media);
    }
}
