public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Book", "Nishant Lakhera");
        Availability availability = new Availability();

        BookFormatter plainTextFormatter = new PlainTextFormatter();
        plainTextFormatter.format(book, availability);
        System.out.println(plainTextFormatter.format(book, availability));

        availability.borrowBook();

        BookFormatter jsonFormatter = new JsonFormatter();
        jsonFormatter.format(book, availability);
        System.out.println(jsonFormatter.format(book, availability));

        availability.returnBook();

        BookFormatter xmlFormatter = new XmlFormatter();
        xmlFormatter.format(book, availability);
        System.out.println(xmlFormatter.format(book, availability));

    }
}
