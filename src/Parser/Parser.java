package Parser;


import Command.Command;
import Command.ExitCommand;

import java.util.ArrayList;

public class Parser {
    //TYPE?????
    public static Command ParseCommand(String userInput){
        return new ExitCommand();
    }

    public static ArrayList<String> ParseCommandParameters(String userInput){
        return new ArrayList<>();
    }
}
