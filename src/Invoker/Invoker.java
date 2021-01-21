package Invoker;

import Command.Command;
import Command.ExitCommand;
import Command.CDCommand;
import Parser.Parser;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static Map<String, Command> commands = new HashMap<>();

    public Invoker(){
        commands.put("exit", new ExitCommand());
        commands.put("cd", new CDCommand());
    }

    public void executeCommand(String userInput) {
        Command command = Parser.ParseCommand(userInput.toLowerCase());
        if (ExitCommand.class.equals(command.getClass())) {
            command.execute("");
        }else {
            command.execute(userInput.split(" ")[1]);
        }
    }
}
