package Invoker;

import Command.*;
import Console.ConsoleOutputWriter;
import Parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static Map<String, Command> commands = new HashMap<>();

    public Invoker() {
        commands.put("exit", new ExitCommand());
        commands.put("cd", new CDCommand());
        commands.put("dir", new DIRCommand());
        commands.put("mkdir", new MKDIRCommand());
        commands.put("del", new DELCommand());
        commands.put("ver", new VERCommand());
        commands.put("ren", new RENCommand());
        commands.put("cls", new CLSCommand());
    }

    public void executeCommand(String userInput) {
        Command command = Parser.parseCommand(userInput.toLowerCase());
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter();
        if (command != null) {
            if (ExitCommand.class.equals(command.getClass()) || DIRCommand.class.equals(command.getClass()) || VERCommand.class.equals(command.getClass()) || CLSCommand.class.equals(command.getClass())) {
                command.execute("", outputWriter);
                return;
            } else if (RENCommand.class.equals(command.getClass())) {
                command.execute(userInput.split(" ")[1] + " " + userInput.split(" ")[2], outputWriter);
            } else {
                command.execute(userInput.split(" ")[1], outputWriter);
                return;
            }
        } else {
            new ConsoleOutputWriter().printLine("Command not found");
        }
    }
}
