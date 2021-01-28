package Parser;


import Command.Command;
import Invoker.Invoker;

import java.util.ArrayList;

public class Parser {
    public static Command parseCommand(String userInput){
        return Invoker.commands.get(userInput.split(" ")[0]);
    }

    public static ArrayList<String> parseCommandParameters(String userInput){
        return new ArrayList<>();
    }
}
