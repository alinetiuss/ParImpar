import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
    System.out.println("Digite o numerador:");
    int numerador = sc.nextInt();
    
    System.out.println("Digite o denominador:");
    int denominador = sc.nextInt();

    int resto = numerador % denominador;

    System.out.println("O resto é: " + resto);
    if (resto==0) {
    System.out.println("O número escolhido é Par");
    }

    if (resto>1) {
      System.out.println("O número escohido é Ímpar");
    }

    if(resto==1) {
      System.out.println("O número escolhido é Ímpar");
    }
    
    sc.close();
  }

  
}