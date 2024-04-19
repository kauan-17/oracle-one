package br.com.alura.minhasMusicas.modelo;

public class _Podcast extends Audio{
    private String host;
    private String descricao;


    @Override
    public int getClassificacao() {
        if(this.getTotalCurtifas()>1000){
            return 10;
        }else {
            return 5;
        }
    }

    public String getAprsentador() {
        return aprsentador;
    }

    public void setAprsentador(String aprsentador) {
        this.aprsentador = aprsentador;
    }

    private String aprsentador;

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
}
