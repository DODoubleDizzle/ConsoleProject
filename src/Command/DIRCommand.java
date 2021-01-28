package Command;


import Console.Console;
import Console.ConsoleOutputWriter;
import FileSystem.FileSystemItem;

public class DIRCommand extends Command {
    @Override
    public void execute(String input) {
        if(Console.getCurrentDirectory().getFileSystemItems().size() != 0) {
            for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
                new ConsoleOutputWriter().PrintLine(fileSystemItem.getName());
            }
        }
    }
}