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
                String color = ANSI_RED;
                System.out.println(color + changeText);
                break;
            }
            case "blue": {
                String color = ANSI_BLUE;
                System.out.println(color + changeText);
                break;
            }
            case "green": {
                String color = ANSI_GREEN;
                System.out.println(color + changeText);
                break;
            }
            case "yellow": {
                String color = ANSI_YELLOW;
                System.out.println(color + changeText);
                break;
            }
            case "black": {
                String color = ANSI_BLACK;
                System.out.println(color + changeText);
                break;
            }
            case "white": {
                String color = ANSI_WHITE;
                System.out.println(color + changeText);
                break;
            }
            case "purple": {
                String color = ANSI_PURPLE;
                System.out.println(color + changeText);
                break;
            }
            case "cyan": {
                String color = ANSI_CYAN;
                System.out.println(color + changeText);
                break;
            }
            default: {
                String color = ANSI_RESET;
                System.out.println(color + "Something went wrong!");
                break;
            }
        }
    }
}
