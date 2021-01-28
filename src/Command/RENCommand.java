package Command;

import Console.Console;
import FileSystem.FileSystemItem;

public class RENCommand extends Command {

    @Override
    public void execute(String input) {
        for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
            if(fileSystemItem.getName().equals(input.split(" ")[0])){
                fileSystemItem.setName(input.split(" ")[1]);
                return;
            }
        }
    }
}
