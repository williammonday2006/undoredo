public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void insertText(int position, String value) {
        text.insert(position, value);
    }

    public void deleteText(int start, int end) {
        text.delete(start, end);
    }

    public String getText() {
        return text.toString();
    }
}