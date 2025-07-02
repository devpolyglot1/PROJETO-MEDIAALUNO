import java.util.Scanner;


public class Exemplo {
    public static void main(String[] args) {


        System.out.println("------------ PRIMEIRO BIMESTRE------------");

        Scanner input = new Scanner(System.in); //Estou a referenciar que o Scanner tem o nome de Input, e é recebido new scanner e referenciado entre parenteses seu tipo, se é in ou out System.in ou System.out/
        double alunosnota1 = input.nextDouble(); //Temos que referenciar que tipo de dado vai receber, se é double, int, caracteres e etc.
        double alunosnota2 = input.nextDouble();

        double resultado = (alunosnota1 + alunosnota2)/2;

        if (resultado > 6 ){
            System.out.println("Aluno está aprovado neste semestre e teve a media de: " + resultado);
        }
        else{
            System.out.println(("Aluno está reprovado e neste semestre teve a media de: " + resultado));
        }


        System.out.println("O aluno teve a media de:" + resultado);

        System.out.println("----SEGUNDO SEMESTRE ----");

        double alunosnota3 = input.nextDouble();
        double alunosnota4 = input.nextDouble();

        double resultado2 = (alunosnota3 + alunosnota4)/2;

        System.out.println("A media do segundo semestre do aluno é igual de: " + resultado2);

        double mediafinal = (alunosnota1 + alunosnota2 + alunosnota3 + alunosnota4)/4;
        System.out.println("A MEDIA FINAL DO ALUNO FOI DE: " + mediafinal);



    }
}
