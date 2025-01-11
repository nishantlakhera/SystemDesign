public class XmlFormatter implements BookFormatter{
    @Override
    public String format(Book book, Availability availability){
        return "<book><title>" + book.getTitle() + "</title><author>" + book.getAuthor() + "</author><availability>"+ availability.checkAvailability()+ "<availability></book>";
    }
}
