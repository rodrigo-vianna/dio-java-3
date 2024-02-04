package apps;

import interfaces.IAparelhoTelefonico;

public class Telefone implements IAparelhoTelefonico {

  @Override
  public void ligar() {
    System.out.println("Ligando telefone");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo telefone");
  }

  @Override
  public void iniciarCorrerioVoz() {
    System.out.println("Iniciando correio de voz");
  }

}
