package Command;


import Console.Console;
import FileSystem.FileSystemItem;
import Console.ConsoleOutputWriter;

public class DELCommand extends Command {
    @Override
    public void execute(String input) {
        for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
            if(fileSystemItem.getName().equals(input)){
                Console.getCurrentDirectory().getFileSystemItems().remove(fileSystemItem);
                new ConsoleOutputWriter().printLine("Item has been removed.");
                return;
            }
        }
    }
}