package Invoker;

import Command.CDCommand;
import Command.Command;
import Command.DIRCommand;
import Command.ExitCommand;
import Parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static Map<String, Command> commands = new HashMap<>();

    public Invoker(){
        commands.put("exit", new ExitCommand());
        commands.put("cd", new CDCommand());
        commands.put("dir", new DIRCommand());
    }

    public void executeCommand(String userInput) {
        Command command = Parser.ParseCommand(userInput.toLowerCase());
        if (ExitCommand.class.equals(command.getClass()) || DIRCommand.class.equals(command.getClass())) {
            command.execute("");
        }else {
            command.execute(userInput.split(" ")[1]);
        }
    }
}
