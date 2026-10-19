public class Main {
    public static void main(String[] args){
        Buch[] buecherArray = {
            new Buch("Clean Code", "Robert Martin", 45.0f, 464),
            new Buch("1984", "George Orwell", 18.0f, 328),
            new Buch("Animal Farm", "George Orwell", 12.0f, 112),
            new Buch("Java Basics", "Max Müller", 35.0f, 520),
            new Buch("Kinderbuch", "Jemand", 28.0f, 10)
        };

        System.out.print("Autor -> ");
        Bibliothek bibliothek = new Bibliothek(buecherArray);
        Buch[] gefundeneBucher=bibliothek.findeAutor("Robert Martin");
        for (int i=0; i<gefundeneBucher.length; i++){
            System.out.println(gefundeneBucher[i].getTitel());
        }

        System.out.print("Durchschnitt -> ");
        float durchschnitt=bibliothek.durchschnittSeiten(buecherArray);
        System.out.println(durchschnitt);

        System.out.print("Maximal Preis (30) -> ");
        Buch[] maximPreis=bibliothek.maximalPreis(30);
        for (int i=0; i< maximPreis.length; i++)
            System.out.println(maximPreis[i].getTitel());

        Buch teuerstes = bibliothek.teuerstesBuch();
        System.out.println("Teuerstes Buch: " + teuerstes.getTitel() + " (" + teuerstes.getPreis() + " Euro)");

        Buch [] minimalSeit = bibliothek.Mindestseitenanzahl(buecherArray, 30);
        for (int i = 0; i < minimalSeit.length; i++) {
            System.out.println("Mindestseitenanzahl(30): " + minimalSeit[i].getTitel());
        }
    }

}
