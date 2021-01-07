package Console;

import Invoker.CommandInvoker;

public class Console {
    public Console(){
    }
    public void start(){
        String userInput = "readline";
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.executeCommand(userInput);
    }
}
