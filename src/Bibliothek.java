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

    public Buch[] maximalPreis(int preis){
        int count = 0;
        for (int i = 0; i < buecher.length; i++) {
            if (buecher[i].getPreis()<=preis) {
                count++;
            }
        }
        int aux=0;
        Buch[] maximalPreis = new Buch[count];
        for (int i = 0; i < buecher.length; i++) {
            if (buecher[i].getPreis()<=preis) {
                maximalPreis[aux]=buecher[i];
                aux++;
            }
        }
        return maximalPreis;
    }

    public Buch teuerstesBuch(){
        float maxi=buecher[0].getPreis();
        Buch Teuerste = buecher[0];
        for (int i=1; i< buecher.length; i++)
        {
            if (buecher[i].getPreis()>maxi){
                maxi = buecher[i].getPreis();
                Teuerste = buecher[i];
            }
        }
        return Teuerste;
    }

    public Buch[] Mindestseitenanzahl(Buch[] buecher, int nrSeiten){
        int count = 0;
        for (int i = 0; i < buecher.length; i++) {
            if (buecher[i].getAnzahlSeiten()>=nrSeiten) {
                count++;
            }
        }
        int aux=0;
        Buch[] minimalSeiten = new Buch[count];
        for (int i = 0; i < buecher.length; i++) {
            if (buecher[i].getAnzahlSeiten()>=nrSeiten) {
                minimalSeiten[aux]=buecher[i];
                aux++;
            }
        }
        return minimalSeiten;
    }

}
