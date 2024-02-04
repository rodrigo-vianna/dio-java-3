import interfaces.IAparelhoTelefonico;
import interfaces.INavegadorInternet;
import interfaces.IReprodutorMusical;

public class IPhone {

  private IReprodutorMusical reprodutorMusical;
  private IAparelhoTelefonico aparelhoTelefonico;
  private INavegadorInternet navegadorInternet;

  public IPhone(IReprodutorMusical reprodutorMusical, IAparelhoTelefonico aparelhoTelefonico,
      INavegadorInternet navegadorInternet) {
    this.reprodutorMusical = reprodutorMusical;
    this.aparelhoTelefonico = aparelhoTelefonico;
    this.navegadorInternet = navegadorInternet;
  }

  public IReprodutorMusical getReprodutorMusical() {
    return this.reprodutorMusical;
  }

  public IAparelhoTelefonico getAparelhoTelefonico() {
    return this.aparelhoTelefonico;
  }

  public INavegadorInternet getNavegadorInternet() {
    return this.navegadorInternet;
  }

}
