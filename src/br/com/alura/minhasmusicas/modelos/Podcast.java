package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String aprensentador;
    private String descricao;

    public String getAprensentador() {
        return aprensentador;
    }

    public void setAprensentador(String aprensentador) {
        this.aprensentador = aprensentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}
