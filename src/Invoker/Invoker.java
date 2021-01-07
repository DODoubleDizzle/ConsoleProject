package Invoker;

import Command.Command;
import Parser.Parser;

import java.util.Dictionary;

public class Invoker {
    private static Dictionary<String, Command> commands;


    public void executeCommand(String userInput) {
        Parser.ParseCommand(userInput);
    }
}
