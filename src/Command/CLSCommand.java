package Command;

import Console.IOutputWriter;

public class CLSCommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        //locked
        for(int i = 0; i < 20; i++){
            outputWriter.printLine(" ");
        }
    }
}