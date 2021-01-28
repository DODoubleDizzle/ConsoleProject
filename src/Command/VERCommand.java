package Command;

import Console.ConsoleOutputWriter;

public class VERCommand extends  Command{
    @Override
    public void execute(String input) {
        new ConsoleOutputWriter().printLine(System.getProperty("os.name") + " Version: " + System.getProperty("os.version"));
    }
}
