package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.FileSystemItem;

public class TYPECommand extends Command{
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        for (int i = 0; i < Console.getCurrentDirectory().getFileSystemItems().size(); i++) {
            if(Console.getCurrentDirectory().getFileSystemItems().get(i).getName().equals(input)){
                outputWriter.printLine(Console.getCurrentDirectory().getFileSystemItems().get(i).getContent());
                return;
            }
        }
    }
}
