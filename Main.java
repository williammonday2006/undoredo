import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        MacroCommand template = new MacroCommand(Arrays.asList(
            new InsertCommand(editor, "=== HEADER ===", 0),
            new InsertCommand(editor, "\n", 15),
            new InsertCommand(editor, "=== FOOTER ===", 16)
        ));

        app.executeCommand(template);

        System.out.println(editor.getText());

        app.undo();

        System.out.println(editor.getText());
    }
}