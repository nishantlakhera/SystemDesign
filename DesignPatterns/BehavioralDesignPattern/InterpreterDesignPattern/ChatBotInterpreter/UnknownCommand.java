public class UnknownCommand implements Command{
    @Override
    public String interpret() {
        return "Sorry, I don't understand";
    }
}
