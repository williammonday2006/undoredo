public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        app.executeCommand(new InsertCommand(editor, "Hello", 0));
        app.executeCommand(new InsertCommand(editor, " World", 5));
        app.executeCommand(new InsertCommand(editor, "!", 11));

        System.out.println(editor.getText());

        app.undo();
        System.out.println(editor.getText());

        app.undo();
        System.out.println(editor.getText());

        app.undo();
        System.out.println(editor.getText());
    }
}