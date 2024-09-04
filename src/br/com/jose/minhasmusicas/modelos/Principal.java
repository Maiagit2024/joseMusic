package br.com.jose.minhasmusicas.modelos;

import br.com.jose.minhasmusicas.musica;
import br.com.jose.minhasmusicas.podcast;

public class Principal {
    public static void main(String[] args) {
        musica minhamusica = new musica();
        minhamusica.setTitulo("to sweet");
        minhamusica.setCantor("Hozier");

        for (int i = 0; i <5000; i++) {
            minhamusica.reproduz();
            
        }

        for (int i = 0; i < 50; i++) {
            minhamusica.curtir();
            
        }

        podcast meuPoscast = new podcast();
        meuPoscast.setTitulo("Jovem nerd");
        meuPoscast.setHost("Azaghal e Jovem nerd");

        for (int i = 0; i < 5000; i++) {
            meuPoscast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPoscast.curtir();
            
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPoscast);
        preferidas.inclui(minhamusica);

    }
}
