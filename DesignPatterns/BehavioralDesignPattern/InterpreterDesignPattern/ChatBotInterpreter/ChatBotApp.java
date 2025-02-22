public class ChatBotApp {
    public static void main(String[] args) {
        ChatbotInterpreter chatbot = new ChatbotInterpreter();
        System.out.println(chatbot.interpret("hello"));
        System.out.println(chatbot.interpret("bye"));
        System.out.println(chatbot.interpret("help"));
    }
}
