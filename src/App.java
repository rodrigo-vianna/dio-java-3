import apps.Musica;
import apps.Safari;
import apps.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone(new Musica(), new Telefone(), new Safari());
        iphone.getAparelhoTelefonico().ligar();
        iphone.getReprodutorMusical().tocar();
        iphone.getNavegadorInternet().exibirPagina();
    }
}
