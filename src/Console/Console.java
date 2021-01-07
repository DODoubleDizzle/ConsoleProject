package Console;

import Invoker.Invoker;

public class Console {

    String userinput;

    public Console(){
    }
    public void Start(){
        String userInput = "readline"; //Last Userinput
        Invoker invoker = new Invoker();
        invoker.executeCommand(userInput);
    }
    private void ProcessInput(){
        //Nimmt input entgegen
    }
}
