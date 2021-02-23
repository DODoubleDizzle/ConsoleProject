package Command;

import Console.Console;
import Console.IOutputWriter;
import FileSystem.Directory;
import FileSystem.FileSystemItem;

public class CLRCommand extends  Command {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLACK = "\u001B[37m";

    @Override
    public void execute(String input, IOutputWriter outputWriter) {
        String changeText = "Text color changed.";
        switch (input) {
            case "red": {
                System.out.println(ANSI_RED + changeText);
                break;
            }
            case "blue": {
                System.out.println(ANSI_BLUE + changeText);
                break;
            }
            case "green": {
                System.out.println(ANSI_GREEN + changeText);
                break;
            }
            case "yellow": {
                System.out.println(ANSI_YELLOW + changeText);
                break;
            }
            case "black": {
                System.out.println(ANSI_BLACK + changeText);
                break;
            }
            case "white": {
                System.out.println(ANSI_WHITE + changeText);
                break;
            }
            case "purple": {
                System.out.println(ANSI_PURPLE + changeText);
                break;
            }
            case "cyan": {
                System.out.println(ANSI_CYAN + changeText);
                break;
            }
            default: {
                System.out.println(ANSI_RESET + "Something went horribly wrong!");
                break;
            }
        }
    }
}
