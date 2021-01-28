package Console;

public class ConsoleOutputWriter implements IOutputWriter {
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void printLine(String text) {
        System.out.println(text);
    }
}
