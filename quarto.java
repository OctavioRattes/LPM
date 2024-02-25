import java.util.Scanner;

public class quarto {
    /**
     * Um imposto é calculado com base na seguinte tabela:
    Até 1.200,00 isento
    de 1.201,00 a 2.500,00 10%
    de 2.501,00 a 5.000,00 15%
    acima de 5.000,00 20%.
    Implemente um programa que leia o valor base e calcule o imposto a pagar.
     */
    
    static Scanner leitorTeclado;

    static double lerValorBase(){
      System.out.println("Digite o valor base:");
      return leitorTeclado.nextDouble();
    }

   static void calcularImposto (double valor) {
      if (valor <= 1200) {
         System.out.println("Valor isento de imposto.");

      } else if (valor <= 5000) {
         double imposto = (valor * 10) / 100;
         System.out.println("Incide imposto de 10 % do valor. Valor a pagar: " + imposto);

      } else if (valor <= 10000) {
         double imposto = (valor * 15) / 100;
         System.out.println("Incide imposto de 15 % do valor. Valor a pagar: " + imposto);

      } else {
         double imposto = (valor * 20) / 100;
         System.out.println("Incide imposto de 20 % do valor. Valor a pagar: " + imposto);
      }
   }

   public static void main(String[] args) {
      leitorTeclado = new Scanner(System.in);

      double valorBase = lerValorBase();
      calcularImposto(valorBase);
      
      leitorTeclado.close();
   }

}
