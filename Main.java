public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command command = new InsertCommand(editor, "Hello World!", 0);

        app.executeCommand(command);

        System.out.println(editor.getText());
    }
}