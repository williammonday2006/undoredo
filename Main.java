public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        app.executeCommand(new InsertCommand(editor, "Hello World!", 0));
        System.out.println(editor.getText());

        app.executeCommand(new DeleteCommand(editor, 5, 6));
        System.out.println(editor.getText());

        app.undo();
        System.out.println(editor.getText());
    }
}