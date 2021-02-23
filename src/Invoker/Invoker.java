package Invoker;

import Command.*;
import Console.ConsoleOutputWriter;
import Factory.CommandFactory;
import Parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static Map<String, Command> commands = new HashMap<>();

    public Invoker() {
        commands = CommandFactory.getCommands();
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
