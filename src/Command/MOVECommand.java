package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.File;
import FileSystem.FileSystemItem;

public class MOVECommand extends Command {
// TODO: fix DIR Command
    @Override
    public void execute(String input, IOutputWriter outputWriter) {

        if ((input.split(" ")[1]).equals("..")) {
            for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
                if (fileSystemItem.getName().equals(input.split(" ")[0])) {
                    if (input.split(" ")[1] != null) {
                        fileSystemItem.setPath(fileSystemItem.getParentDirectory().getPath());
                        return;
                    } else {
                        outputWriter.printLine("Directory not found!");
                    }
                }
            }
        } else {
            for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
                if (fileSystemItem.getName().equals(input.split(" ")[0])) {
                    if (input.split(" ")[1] != null) {
                        fileSystemItem.setPath(input.split(" ")[1]);
                        return;
                    } else {
                        outputWriter.printLine("Directory not found!");
                    }
                }
            }
        }
    }
}