public class Buch {
    String Titel;
    String Autor;
    float Preis;
    int AnzahlSeiten;

    public Buch(String Titel, String Autor, float Preis, int AnzahlSeiten) {
        this.Titel=Titel;
        this.Autor=Autor;
        this.Preis=Preis;
        this.AnzahlSeiten=AnzahlSeiten;

    }

    public String getTitel(){
        return Titel;
    }
    public String getAutor() {
        return Autor;
    }
    public float getPreis() {
        return Preis;
    }

    public int getAnzahlSeiten() {
        return AnzahlSeiten;
    }
}
