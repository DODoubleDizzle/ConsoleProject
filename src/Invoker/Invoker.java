package Invoker;

import Command.Command;
import Console.ConsoleOutputWriter;
import Console.IOutputWriter;
import Factory.CommandFactory;
import Parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static Map<String, Command> commands = new HashMap<>();

    public Invoker() {
        commands = CommandFactory.getCommands();
    }

    public void executeCommand(String userInput, IOutputWriter outputWriter) {
        Command command = Parser.parseCommand(userInput.toLowerCase());
        if (command != null) {
            if (commands.get("exit").getClass().equals(command.getClass()) || commands.get("dir").getClass().equals(command.getClass()) || commands.get("ver").getClass().equals(command.getClass()) || commands.get("cls").getClass().equals(command.getClass())) {
                command.execute("", outputWriter);
                return;
            } else if (commands.get("ren").getClass().equals(command.getClass())) {
                try {
                    command.execute(userInput.split(" ")[1] + " " + userInput.split(" ")[2], outputWriter);
                } catch (Exception e) {
                    System.out.println("Wrong Input");
                }

            } else {
                command.execute(userInput.split(" ")[1], outputWriter);
                return;
            }
        } else {
            outputWriter.printLine("Command not found");
        }
    }
}
