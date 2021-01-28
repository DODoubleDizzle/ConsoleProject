package Command;


import Console.Console;
import FileSystem.FileSystemItem;

public class DELCommand extends Command {
    @Override
    public void execute(String input) {
        for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
            if(fileSystemItem.getName().equals(input)){
                Console.getCurrentDirectory().getFileSystemItems().remove(fileSystemItem);
                return;
            }
        }
    }
}