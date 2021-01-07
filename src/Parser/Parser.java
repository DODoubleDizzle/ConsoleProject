package Parser;


import Command.Command;
import Command.ExitCommand;
import Invoker.Invoker;

import java.util.ArrayList;

public class Parser {
    public static Command ParseCommand(String userInput){
        return Invoker.commands.get(userInput.split(" ")[0]);
    }

    public static ArrayList<String> ParseCommandParameters(String userInput){
        return new ArrayList<>();
    }
}
