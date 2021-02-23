package Command;

import Console.IOutputWriter;

public abstract class Command {
    public abstract void execute(String input, IOutputWriter outputWriter);
}
