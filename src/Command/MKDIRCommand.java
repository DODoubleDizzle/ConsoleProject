package Command;


import Console.Console;
import FileSystem.Directory;

public class MKDIRCommand extends Command {
    @Override
    public void execute(String input) {
        Directory directory = new Directory();
        directory.setName(input);
        directory.setParentDirectory(Console.getCurrentDirectory());
        Console.getCurrentDirectory().addFileSystemItem(directory);

    }
}