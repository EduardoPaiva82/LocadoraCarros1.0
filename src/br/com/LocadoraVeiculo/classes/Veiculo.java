package br.com.LocadoraVeiculo.classes;

/**
 *
 * @author edunativa
 */
public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String chassi;
    private boolean situacaoLocacao;
    private float vlrDiaria;
    private byte imagemCarro;

    //Construtores
    public Veiculo(String marca, String modelo, int ano, String placa, String chassi, boolean situacaoLocacao, float vlrDiaria, byte imagemCarro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.chassi = chassi;
        this.situacaoLocacao = situacaoLocacao;
        this.vlrDiaria = vlrDiaria;
        this.imagemCarro = imagemCarro;
    }

    public Veiculo() {
    }

    //Metodos Acessores;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public boolean isSituacaoLocacao() {
        return situacaoLocacao;
    }

    public void setSituacaoLocacao(boolean situacaoLocacao) {
        this.situacaoLocacao = situacaoLocacao;
    }

    public float getVlrDiaria() {
        return vlrDiaria;
    }

    public void setVlrDiaria(float vlrDiaria) {
        this.vlrDiaria = vlrDiaria;
    }

    public byte getImagemCarro() {
        return imagemCarro;
    }

    public void setImagemCarro(byte imagemCarro) {
        this.imagemCarro = imagemCarro;
    }
    
    

}
