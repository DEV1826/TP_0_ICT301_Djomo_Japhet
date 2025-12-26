package ict301.solid.srp;

// Utilisation des classes après refactoring
public class MainSRP {
    public static void main(String[] args) {
        // Création du livre
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");
        
        // Utilisation de BookPrinter pour l'affichage
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        printer.printToHTML(book);
        
        // Utilisation de BookSaver pour la sauvegarde
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        saver.saveToFile(book, "livre.txt");
        
        // Utilisation de BookBusinessLogic pour la logique métier
        BookBusinessLogic business = new BookBusinessLogic();
        business.emprunter(book, "Marcial");
        business.autreService(book);
    }
}
