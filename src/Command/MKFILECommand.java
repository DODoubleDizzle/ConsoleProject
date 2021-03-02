package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.Directory;
import FileSystem.File;

public class MKFILECommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {

        File file = new File();
        file.setName(input.split(" ")[0]);
        String content = "";
        for(String temp : input.split(" ")){
            if(!temp.equals(input.split(" ")[0])){
                content += temp + " ";
            }
        }
        file.setContent(content);
        file.setParentDirectory(Console.getCurrentDirectory());
        Console.getCurrentDirectory().addFileSystemItem(file);
        outputWriter.printLine("File " + input.split(" ")[0] + " has been created.");
    }
}
