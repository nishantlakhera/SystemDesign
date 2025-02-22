import java.util.HashMap;
import java.util.Map;

public class ChatbotInterpreter {
    private Map<String, Command> commands = new HashMap<>();
    public ChatbotInterpreter(){
        commands.put("hello", new GreetCommand());
        commands.put("bye", new ByeCommand());
    }
    public String interpret(String input){
        Command command  = commands.getOrDefault(input.toLowerCase(), new UnknownCommand());
        return command.interpret();
    }
}
