package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.FileSystemItem;

public class MOVECommand extends Command {

    @Override
    public void execute(String input, IOutputWriter outputWriter) {

        if (input.equals("..")) {
            String newPath = "Console.setCurrentDirectory(Console.getCurrentDirectory().getParentDirectory())";
        } else {
            String source = input.split(" ")[0];
            String target = input.split("")[1];

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