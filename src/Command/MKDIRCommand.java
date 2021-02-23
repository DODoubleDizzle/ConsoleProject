package Command;


import Console.Console;
import Console.IOutputWriter;
import FileSystem.Directory;

public class MKDIRCommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        Directory directory = new Directory();
        directory.setName(input);
        directory.setParentDirectory(Console.getCurrentDirectory());
        Console.getCurrentDirectory().addFileSystemItem(directory);
    }
}