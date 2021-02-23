package Parser;


import Command.Command;
import Invoker.Invoker;

public class Parser {
    public static Command parseCommand(String userInput){
        return Invoker.commands.get(userInput.split(" ")[0]);
    }
}
