package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.FileSystemItem;

public class RENCommand extends Command {

    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
            if (fileSystemItem.getName().equals(input.split(" ")[0])) {
                if (input.split(" ")[1] != null) {
                    fileSystemItem.setName(input.split(" ")[1]);
                    outputWriter.printLine(input.split(" ")[0] + " has been renamed to " + input.split(" ")[1]);
                    return;
                }else {
                    outputWriter.printLine("Directory not found!");
                }
            }
        }
    }
}
