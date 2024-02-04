package apps;

import interfaces.IReprodutorMusical;

public class Musica implements IReprodutorMusical {

  @Override
  public void tocar() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando música");
  }

}
