public class Main {
    public static void main(String[] args){
        Buch[] buecherArray = {
            new Buch("Clean Code", "Robert Martin", 45.0f, 464),
            new Buch("1984", "George Orwell", 18.0f, 328),
            new Buch("Animal Farm", "George Orwell", 12.0f, 112),
            new Buch("Java Basics", "Max Müller", 35.0f, 520),
            new Buch("The Hobbit", "J. R. R. Tolkien", 28.0f, 310)
        };

        Bibliothek bibliothek = new Bibliothek(buecherArray);
        Buch[] gefundeneBucher=bibliothek.findeAutor("Robert Martin");
        for (int i=0; i<gefundeneBucher.length; i++){
            System.out.println(gefundeneBucher[i].getTitel());
        }

        float durchschnitt=bibliothek.durchschnittSeiten(buecherArray);
        System.out.println(durchschnitt);
    }
}
