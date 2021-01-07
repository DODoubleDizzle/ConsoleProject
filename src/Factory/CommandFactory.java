package Factory;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    /**public static ICommand getCommand(String command){

        return new CdCommand();
    }**/

    public static List<String> getCommands(){
        List<String> commandList = new ArrayList();
        return commandList;
    }
}
