package Command;


import Console.Console;
import Console.IOutputWriter;
import FileSystem.FileSystemItem;

public class DELCommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
            if(fileSystemItem.getName().equals(input)){
                Console.getCurrentDirectory().getFileSystemItems().remove(fileSystemItem);
                outputWriter.printLine("Item has been removed.");
                return;
            }
        }
        outputWriter.printLine("Item has not been found.");
    }
}