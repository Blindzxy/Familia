package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        Filho filho1 = new Filho("Maria", "Jorge", "Jose");
        Filho filho2 = new Filho("Maria", "Fernando", "Pedro");

        System.out.println(saoMeioIrmaos(filho1, filho2));
    }

    public static String maeDe(Filho filho) {
        return filho.getMae();
    }

    public static String paiDe(Filho filho) {
        return filho.getPai();
    }

    public static Boolean temAmesmaMae(Filho filho1, Filho filho2) {
        return maeDe(filho1) == maeDe(filho2);
    }

    public static Boolean temOmesmoPai(Filho filho1, Filho filho2) {
        return paiDe(filho1) == paiDe(filho2);
    }

    public static Boolean saoMeioIrmaos(Filho filho1, Filho filho2){
        return temAmesmaMae(filho1, filho2) && !temOmesmoPai(filho1, filho2) || temOmesmoPai(filho1, filho2) && !temAmesmaMae(filho1, filho2);
    }
}