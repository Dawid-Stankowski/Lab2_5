public class Szkielet {

    String opisPierwszy;
    String opisDrugi;
    int opisTrzeci;
    String opisCzwarty;

    public Szkielet(String opisPierwszy, String opisDrugi, int opisTrzeci, String opisCzwarty) {
        this.opisPierwszy = opisPierwszy;
        this.opisDrugi = opisDrugi;
        this.opisTrzeci = opisTrzeci;
        this.opisCzwarty = opisCzwarty;
    }

    public void wyswietlInformacje() {
        System.out.println("Inf 1: " + opisPierwszy);
        System.out.println("Inf 2: " + opisDrugi);
        System.out.println("Inf 3: " + opisTrzeci);
        System.out.println("Inf 4: " + opisCzwarty);
    }

    public static void main(String[] args) {
        Szkielet mojSzkielet = new Szkielet("Opis 1 ", "Opis 2", 1234, "Opis 4");

                mojSzkielet.wyswietlInformacje();
    }
}