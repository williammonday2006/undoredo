import java.util.ArrayDeque;
import java.util.Deque;

public class EditorApp {
    private Deque<Command> history = new ArrayDeque<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }
}