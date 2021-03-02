package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.Directory;
import FileSystem.File;

public class MKFILECommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {

        File file = new File();
        file.setName(input.split(" ")[0]);
        file.setContent(input.split(" ")[1]);
        file.setParentDirectory(Console.getCurrentDirectory());
        Console.getCurrentDirectory().addFileSystemItem(file);
        outputWriter.printLine("File " + input.split(" ")[0] + " has been created.");
    }
}
