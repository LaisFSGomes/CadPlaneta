package cadplaneta;

public class Planeta {

    //atributos
    private String nome;
    private String regiao;
    private String setor;
    private String orbita;
    private String sistema;
    private String terreno;
    private String corPredominante;
    private String distancia;
    private String forca;
    private String especies;
    private String filiacao;
    private String galaxia;
    private final String infoAdd;
    private String luas;
    private String populacao;
    private String diamentro;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    
    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }
    
    
    public String getForca() {
        return forca;
    }

    public void setForca(String forca) {
        this.forca = forca;
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(String galaxia) {
        this.galaxia = galaxia;
    }

    public String getInfoAdd() {
        return infoAdd;
    }

    public String getLuas() {
        return luas;
    }

    public void setLuas(String luas) {
        this.luas = luas;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getDiamentro() {
        return diamentro;
    }

    public void setDiamentro(String diamentro) {
        this.diamentro = diamentro;
    }

    //Construtor 
    public Planeta(String nome, String regiao, String setor, String orbita, String sistema, String terreno, String corPredominante, String distancia, String forca, String especies, String filiacao, String galaxia, String infoAdd, String luas, String populacao, String diamentro) {
        this.nome = nome;
        this.regiao = regiao;
        this.setor = setor;
        this.orbita = orbita;
        this.sistema = sistema;
        this.terreno = terreno;
        this.corPredominante = corPredominante;
        this.distancia = distancia;
        this.forca = forca;
        this.especies = especies;
        this.filiacao = filiacao;
        this.galaxia = galaxia;
        this.infoAdd = infoAdd;
        this.luas = luas;
        this.populacao = populacao;
        this.diamentro = diamentro;
    }

    @Override
    public String toString() {
        return "Planeta: " + nome + "\n\niNFoRMAÇÕES ASTROGRÁFICAS\nRegião: " + regiao + "\nGaláxia: " + galaxia + "\nLocalizado no Sistema " + sistema
                + "\norbita a estrela " + orbita + "\nquantidade de luas: " + luas + "\n\niNFoRMAÇÕES FÍSiCAS\nDiâmetro de "
                + diamentro + " km\nTerreno Primário: " + terreno + "\nCor Predominante: " + corPredominante + "\nDistância da Terra: "+ distancia +" anos-luz"
                + "\n\niNFoRMAÇÕES SoCiAiS\nPopulação: " + populacao + "\nusuários da Força: " + forca + "\nFiliação: " + filiacao + "\nInformações Adicionais:" + infoAdd;
    }

}
