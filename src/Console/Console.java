package Console;

public class Console {
    public Console(){
    }
    public void Start(){
        String userInput = "readline";
        Invoker invoker = new Invoker();
        invoker.executeCommand(userInput);
    }
    private void ProcessInput(){
        //Nimmt input entgegen
    }
}
