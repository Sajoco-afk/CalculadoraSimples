import java.util.Scanner;

public class Calculadora{

  public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);

    int opcao;

    do {

      System.out.println("===========================");
      System.out.println("=== CALCULADORA SIMPLES ===");
      System.out.println("===========================");

       System.out.println("");

      System.out.println("1 - Somar");

      System.out.println("");

      System.out.println("2 - Subtrair");

      System.out.println("");

      System.out.println("3 - Multiplicar");

      System.out.println("");

      System.out.println("4 - Dividir");

      System.out.println("");

      System.out.println("0 - Sair");

      System.out.println("");

      System.out.print("Escolha uma opção: ");

      opcao = entrada.nextInt();

      if (opcao != 0) {


        System.out.print("Digite o primeiro número: ");

        double a = entrada.nextDouble();

 
        System.out.print("Digite o segundo número: ");

        double b = entrada.nextDouble();

 
        double resultado = 0;

 
        switch (opcao) {

          case 1:

            resultado = a + b;

            break;

          case 2:

            resultado = a - b;

            break;

          case 3:

            resultado = a * b;

            break;

          case 4:

            if (b != 0) {

              resultado = a / b;

            } else {

              System.out.println("Erro: divisão por zero!");

            }

            break;

          default:

            System.out.println("Opção inválida.");

        }

 

        if (opcao >= 1 && opcao <= 4) {

          System.out.println("Resultado: " + resultado);

        }

      }

    } while (opcao != 0);

 
    System.out.println("Encerrando a calculadora...");

    entrada.close();

  }

}