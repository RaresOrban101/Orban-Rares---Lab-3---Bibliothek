public class Bibliothek {
    private Buch[] buecher;
    public Bibliothek(Buch[] buecher){
        this.buecher=buecher;
    }

    public Buch[] findeAutor(String Autor){
        int count = 0;
        for (int i = 0; i < buecher.length; i++) {
            if (Autor.equals(buecher[i].getAutor())) {
                count++;
            }
        }

        // 2. Create the array with the EXACT count size
        Buch[] buecherAutor = new Buch[count];
        int aux=0;
        for (int i=0; i< buecher.length; i++){
            if (Autor.equals(buecher[i].getAutor())){
                buecherAutor[aux]=buecher[i];
                aux++;
            }
        }
        return buecherAutor;
    }

    public float durchschnittSeiten(Buch[] buecher){
        int s=0;
        for (int i=0; i< buecher.length; i++)
            s+=buecher[i].getAnzahlSeiten();
        float durchschnitt=(float)s/ buecher.length;
        return durchschnitt;
    }
}
