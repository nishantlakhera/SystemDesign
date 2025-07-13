public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        editor.write("Hello ");
        history.save(editor);

        editor.write("World! ");
        history.save(editor);

        editor.write(" Not saved");
        editor.print(); // Hello World! Not saved

        history.undo(editor);
        editor.print(); //Hello World!

        history.undo(editor);
        editor.print(); //Hello
    }
}
