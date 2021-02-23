package Command;

import Console.IOutputWriter;

public class ExitCommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        System.exit(0);
    }
}
