package Command;


import Console.Console;
import Console.IOutputWriter;
import FileSystem.FileSystemItem;

public class DIRCommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        if(Console.getCurrentDirectory().getFileSystemItems().size() != 0) {
            for (FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()) {
                outputWriter.printLine(fileSystemItem.getName());
                return;
            }
        } else {
            outputWriter.printLine("There are no files to see here!");
        }
    }
}