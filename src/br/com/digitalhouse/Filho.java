package br.com.digitalhouse;

public class Filho {
    private String mae;
    private String pai;
    private String filho;

    public Filho (String nomeMae, String nomePai, String nomeFilho){
        mae = nomeMae;
        pai = nomePai;
        filho = nomeFilho;
    }


    //Get - Acesssor
    public String getMae() {
        return mae;
}

    public String getPai() {
        return pai;
        }

}