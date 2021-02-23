package Command;

import Console.IOutputWriter;

public class MOVECommand extends Command {

    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        if (input.equals("..")) {
            String newPath = "Console.setCurrentDirectory(Console.getCurrentDirectory().getParentDirectory())";
        } else {
            String source = input.split(" ")[0];
            String target = input.split("")[1];

        }
    }
}