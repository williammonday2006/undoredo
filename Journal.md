# Phase 1

The EditorApp is decoupled from the TextEditor because it only works with the Command interface. It does not need to know how the text is changed. If the app directly called editor.insertText(), it would become more dependent on the TextEditor implementation and would be harder to change later. Using commands also makes it easier to add different text operations without changing the EditorApp.

# Phase 2

Having the Command object responsible for its own undo logic makes EditorApp simpler because EditorApp does not need to know how each operation is reversed. It only needs to call undo() on the command. This also makes it easier to add more command types with their own undo behavior.