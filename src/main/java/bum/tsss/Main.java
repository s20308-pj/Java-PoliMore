package bum.tsss;

public class Main {
    public static void main(String[] args) {
    //Szczel mi teraz tą klaskę, z jedną metodą, o nazwie, jak wyżej.  Metoda Ma zwracać Stringa.
    // + 3 klasy dziedziczące po tej klasie - np. WordDocument, ExcelDocument i PdfDocument.
    // Na koniec klasa z metodą Main, która tworzy 3 obiekty i "na nich" odala getDescription.
    // Tylko uwaga, wszystkie obiekty mają być typu DocumentItem ;)

        WordDocument word = new WordDocument();
        ExcelDocument excel = new ExcelDocument();
        PdfDocument pdf = new PdfDocument();

        System.out.println("PART ONE:");
        System.out.println(word.getDescription());
        System.out.println(excel.getDescription());
        System.out.println(pdf.getDescription());

    //uprzejmie proszę zrobić międzytwarz PrinterService z jedną metodą typu void printDocument.
    //Następnie  3 klasy np. DocumentPrinter, CardPrinter i ImagePrinter, implementujące tą międzytwarz.
    // Na koniec, klasa z metodą Main z trzema obiektami typu PrinterService, które odpalają swoje metodki.

        DocumentPrinter documentPrinter = new DocumentPrinter();
        CardPrinter cardPrinter = new CardPrinter();
        ImagePrinter imagePrinter = new ImagePrinter();
        PrinterService document = documentPrinter;
        PrinterService card = cardPrinter;
        PrinterService image = imagePrinter;

        System.out.println("\nPART TWO:");
        document.printDocument();
        card.printDocument();
        image.printDocument();
    }
}
