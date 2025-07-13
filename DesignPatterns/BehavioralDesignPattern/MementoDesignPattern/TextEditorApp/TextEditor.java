//Originator
public class TextEditor {
    private String text = "";

    public void write(String newText){
        text = text + newText;
    }

    public TextMemento save(){
        return new TextMemento(text);
    }

    public void restore(TextMemento memento){
        this.text = memento.getState();
    }

    public void print(){
        System.out.println("Current Content: "+ text);
    }
}
