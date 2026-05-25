package RedesSociales;

public class RedSocialApp {

    static void main() {

        Usuario ana = new Usuario("Ana", 30, "@ana", 231);
        ana.mostrarInfoUsuario();

        System.out.println();

        Influencer luis = new Influencer("Luis", 25, "@luis_influencer", 5000);
        luis.mostrarInfoUsuario();

        System.out.println();

        Streamer carlos = new Streamer("Carlos", 27, "@carlos_stream", 150, 2000, 2000);
        carlos.mostrarInfoUsuario();

        System.out.println();

        Basico pedro = new Basico("Pedro", 22, "@pedro123", 455);
        pedro.mostrarInfoUsuario();
    }
}
