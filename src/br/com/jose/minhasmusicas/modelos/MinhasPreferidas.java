package br.com.jose.minhasmusicas.modelos;

import br.com.jose.minhasmusicas.Audio;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>=8){
            System.out.println(audio.getTitulo()+"É considerado sucesso");

        }else{
            System.out.println(audio.getTitulo()+" também é um dos mais escutados");
        }
    }
}
