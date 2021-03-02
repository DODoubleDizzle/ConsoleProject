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
    public static Directory currentDirectory;
    public static Directory rootDirectory;
    IOutputWriter outputWriter = new ConsoleOutputWriter();
    boolean toProcess = true;

    public Console() {
    }

    public void start() {
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
        while (toProcess) {
            outputWriter.print(drive.getLabel() + currentDirectory.getPath() + "> ");
            userInput = new BufferedReader(new InputStreamReader(System.in)).readLine();
            runCommand();
        }
    }

    public void runCommand(){
        Invoker invoker = new Invoker();
        invoker.executeCommand(userInput, outputWriter);
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

    public void setToProcess(boolean toProcess) {
        this.toProcess = toProcess;
    }

    public IOutputWriter getOutputWriter() {
        return outputWriter;
    }

    public static Directory getRootDirectory() {
        return rootDirectory;
    }
}
