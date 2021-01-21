package Invoker;

import Command.Command;
import Command.ExitCommand;
import Parser.Parser;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static Map<String, Command> commands = new HashMap<>();

    public Invoker(){
        commands.put("Exit", new ExitCommand());
    }

    public void executeCommand(String userInput) {
        Parser.ParseCommand(userInput);
    }
}
