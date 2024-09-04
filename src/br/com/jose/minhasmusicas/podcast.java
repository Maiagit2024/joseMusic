package br.com.jose.minhasmusicas;

public class podcast extends Audio {
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    @Override
    public int getTotalReproducoes() {
        if(this.getTotalCurtidas()>500){
            return 10;

        }else{
            return 8;
        }
    }
}
