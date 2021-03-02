package Command;

import Console.IOutputWriter;

import java.io.IOException;

public class CLSCommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        //locked
        outputWriter.printLine("Coming soon!");
        System.out.println("Coming soon!");
    }
}