package Sistema;
import java.util.Scanner;
public class Celular {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
 
      smartphone Iphone = new smartphone();
      
     int option;
      while (true){
           System.out.println("Escolha uma função do Iphone");
           System.out.println("1 - Ligar");
           System.out.println("2 - Desligar");
           System.out.println("3 - Caixa postal");
           System.out.println("4-  Internet");
           System.out.println("5 - Player de música");
           System.out.println("0 - Sair");

           option = scanner.nextInt();
           
            switch (option) {
              case 1:
                  Ligacoes(Iphone);
                  break;
              case 2:
                  Desligar(Iphone);
                  break;
              case 3:
                  CaixaPostal(Iphone);
                  break;
              case 4:
                  Internet(Iphone);
                  break;
              case 5:
                  PlayerMusica(Iphone);
                  break;
              case 0:
                  System.out.println("Encerrando o programa.");
                  return; // ou break + boolean para sair do loop
              default:
                  System.out.println("Opção inválida.");
          }
      
          System.out.println("Deseja fazer outra operação? (s/n)");
          String continuar = scanner.next();
          if (!continuar.equalsIgnoreCase("s")) {
              System.out.println("Encerrando o programa.");
              break;
          }
        }
      }
  

    private static void Ligacoes(smartphone Iphone){
      System.out.println("Digite o numero para ligar");
      int numero = scanner.nextInt();
      Iphone.chamar("ligando para" + numero);
      
    }
    private static void Desligar(smartphone Iphone){
      System.out.println("Digite o numero para ligar");
      
      Iphone.desligar("Desligando da chamada");
      
    }
    private static void CaixaPostal(smartphone Iphone){
      Iphone.caixaPostal();
      
    }
    private static void Internet(smartphone Iphone){
      Boolean conectado = Iphone.conectar("wifi");
       if(conectado == true){
        System.out.println("conectado com sucesso");
        Iphone.navegar();
        Iphone.navegar();
        Iphone.atualizar();
        Iphone.fechar();
       }
    }
    private static void PlayerMusica(smartphone Iphone){
      Iphone.play("Lovers Rock - TV Girl");
      
    }
}


