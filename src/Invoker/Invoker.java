package Invoker;

import Command.Command;
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
            if (commands.get("exit").getClass().equals(command.getClass()) || commands.get("dir").getClass().equals(command.getClass()) || commands.get("ver").getClass().equals(command.getClass()) || commands.get("cls").getClass().equals(command.getClass())) {
                command.execute("", outputWriter);
                return;
            } else if (commands.get("ren").getClass().equals(command.getClass()) || commands.get("move").getClass().equals(command.getClass())) {

                try {
                    command.execute(userInput.split(" ")[1] + " " + userInput.split(" ")[2], outputWriter);
                } catch (Exception e){
                    System.out.println("Wrong Input");
                }

            } else {
                command.execute(userInput.split(" ")[1], outputWriter);
                return;
            }
        } else {
            new ConsoleOutputWriter().printLine("Command not found");
        }
    }
}
