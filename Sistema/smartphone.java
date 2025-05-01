package Sistema;

public class smartphone implements chamada, Internet, Player{
     static int numero;
    @Override
    public void chamar(String chamando){
        System.out.println("O telefone está "+ chamando);
    }
    @Override
    public  void desligar(String desligando){
        System.out.println("o telefone desligou");
    }
    @Override
    public void caixaPostal(){
        System.out.println("O telefone está em caixa postal");
    }
    @Override
    public Boolean conectar(String conectado){
       return true;
    }
    @Override
    public void navegar(){
        System.out.println("O telefone está navegando");
    }
    @Override
    public void atualizar(){
        System.out.println("O telefone atualizou a página");
    }
    @Override
    public void fechar(){
        System.out.println("O telefone fechouo navegador");
    }
    
    @Override
    public void play(String play){
        System.out.println("O telefone está tocando "+ play);
    }
    @Override
    public void exit(){
        System.out.println("Você saiu do player de música");
    }
    @Override
    public void stop(){
        System.out.println("Você pausou a música");
    }

}
