package Invoker;

import Factory.CommandFactory;
import Parser.CommandParser;

public class CommandInvoker {
    public void executeCommand(String userInput){
        CommandParser.setCommandList(CommandFactory.getCommands());

        CommandFactory.getCommands();
        CommandParser.Parse(userInput);
    }
}
