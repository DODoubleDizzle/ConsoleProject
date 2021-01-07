package Invoker;

import Command.Command;
import Command.ExitCommand;
import Parser.Parser;

import java.util.Dictionary;

public class Invoker {
    public static Dictionary<String, Command> commands;

    public Invoker(){
        commands.put("Exit", new ExitCommand());
    }

    public void executeCommand(String userInput) {
        Parser.ParseCommand(userInput);
    }
}
