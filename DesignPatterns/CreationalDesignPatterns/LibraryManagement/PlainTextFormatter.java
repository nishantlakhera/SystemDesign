public class PlainTextFormatter implements BookFormatter{
    @Override
    public String format(Book book, Availability availability){
        return "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + "Avilability: "+ availability.checkAvailability();
    }
}
