package Console;

public class ConsoleOutputWriter implements IOutputWriter {
    @Override
    public void Print(String text) {
        System.out.print(text);
    }

    @Override
    public void PrintLine(String text) {
        System.out.println(text);
    }
}
