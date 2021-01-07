package Console;

import Invoker.Invoker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    String userInput;

    public Console(){
    }
    public void Start(){
        try {
            ProcessInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Invoker invoker = new Invoker();
        invoker.executeCommand(userInput);
    }
    private void ProcessInput() throws IOException {
        userInput = new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
