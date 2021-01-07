package Console;

import Invoker.Invoker;

public class Console {

    String userInput;

    public Console(){
    }
    public void Start(){
        userInput = "readline"; //Last Userinput
        Invoker invoker = new Invoker();
        invoker.executeCommand(userInput);
    }
    private void ProcessInput(){
        //Nimmt input entgegen
    }
}
