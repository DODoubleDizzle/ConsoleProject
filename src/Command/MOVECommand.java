package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.FileSystemItem;

public class MOVECommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        FileSystemItem toRemove = null;
        if ((input.split(" ")[1]).equals("..")) {
            for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
                if (fileSystemItem.getName().equals(input.split(" ")[0])) {
                    Console.getCurrentDirectory().getParentDirectory().getFileSystemItems().add(fileSystemItem);
                    toRemove = fileSystemItem;
                }
            }
            Console.getCurrentDirectory().getFileSystemItems().remove(toRemove);
        } else {
            System.out.println("Coming soon!");
        }
    }
}