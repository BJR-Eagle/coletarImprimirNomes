import java.util.Scanner;

import java.util.Scanner;
public class Arq4 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome");

    boolean respostaValida = false;
    String nome = sc.nextLine();
    System.out.println("O nome digitado foi: "+ nome);

    while (!respostaValida) {
        
    
        System.out.println("Deseja Realizar Outra Operação? (S = Sim/N = Não)");
        String respostaFinal = sc.nextLine();

        if (respostaFinal.equalsIgnoreCase("S")) {
            main(args);
            
        } else if (respostaFinal.equalsIgnoreCase("N")) {
            
            respostaValida = true;
        } else { 
            System.out.println("Resposta inválida. Por favor, digite 'S' para sim ou 'N' para não.");
            
        }
    }
    System.out.println("Então até mais tarde!");
}   
}

