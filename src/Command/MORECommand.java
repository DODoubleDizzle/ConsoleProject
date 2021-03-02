package Command;

import Console.Console;
import Console.IOutputWriter;

public class MORECommand extends Command {
    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        for (int i = 0; i < Console.getCurrentDirectory().getFileSystemItems().size(); i++) {
            if(Console.getCurrentDirectory().getFileSystemItems().get(i).getName().equals(input)){
                int index = 0;
                while (index < Console.getCurrentDirectory().getFileSystemItems().get(i).getContent().length()) {
                    outputWriter.printLine(Console.getCurrentDirectory().getFileSystemItems().get(i).getContent().substring(index, Math.min(index + 80,Console.getCurrentDirectory().getFileSystemItems().get(i).getContent().length())));
                    index += 80;
                }
                return;
            }
        }
    }
}
