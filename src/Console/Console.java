package Console;

import FileSystem.Directory;
import FileSystem.Drive;
import FileSystem.FileSystemItem;
import Invoker.Invoker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    FileSystemItem fileSystemItem;
    Drive drive;
    String userInput;
    static Directory currentDirectory;
    Directory rootDirectory;
    IOutputWriter outputWriter = new ConsoleOutputWriter();

    public Console() {
    }

    public void Start() {
        try {
            drive = new Drive();
            drive.setLabel("C:\\");
            rootDirectory = new Directory();
            rootDirectory.setName("Root");
            drive.addFileSystemItem(rootDirectory);
            processInput();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void processInput() throws IOException {

        currentDirectory = rootDirectory;

        while (true) {
            outputWriter.print(drive.getLabel() + currentDirectory.getPath() + "> ");
            userInput = new BufferedReader(new InputStreamReader(System.in)).readLine();
            runCommand();
        }
    }

    public void runCommand(){
        Invoker invoker = new Invoker();
        invoker.executeCommand(userInput);
    }

    public static Directory getCurrentDirectory() {
        return currentDirectory;
    }

    public static void setCurrentDirectory(Directory directory) {
        currentDirectory = directory;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public void setOutputWriter(IOutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }
}
