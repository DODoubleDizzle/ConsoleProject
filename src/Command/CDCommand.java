package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.Directory;
import FileSystem.FileSystemItem;

public class CDCommand extends Command {

    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        if(input.equals("..")){
            Console.setCurrentDirectory(Console.getCurrentDirectory().getParentDirectory());
        }else{
            for(FileSystemItem fileSystemItem : Console.getCurrentDirectory().getFileSystemItems()){
                if(fileSystemItem.getName().equals(input)){
                    Console.setCurrentDirectory((Directory) fileSystemItem);
                    return;
                }
            }
            outputWriter.printLine("Directory not found!");
        }
    }
}
