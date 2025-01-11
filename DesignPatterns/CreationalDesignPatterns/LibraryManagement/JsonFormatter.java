public class JsonFormatter implements BookFormatter{
    @Override
    public String format(Book book, Availability availability){
        return "{ \"title\": \"" + book.getTitle() + "\", \"author\": \"" + book.getAuthor() + "\"" + "\", \"availability\": \"" + availability.checkAvailability() + "\" }";
    }
}
