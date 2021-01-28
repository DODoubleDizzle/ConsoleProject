package Console;

import FileSystem.Directory;
import FileSystem.Drive;
import FileSystem.File;
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

    public Console(){
    }
    public void Start(){
        try {
            drive = new Drive();
            drive.setLabel("C:\\");
            rootDirectory = new Directory();
            rootDirectory.setName("Root");
            drive.addFileSystemItem(rootDirectory);

            ProcessInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Invoker invoker = new Invoker();
        invoker.executeCommand(userInput);
    }
    private void ProcessInput() throws IOException {

        currentDirectory = new Directory();
        currentDirectory.setName("CurrentDirectory");
        File asd = new File();
        asd.setName("File");
        currentDirectory.addFileSystemItem(asd);
        currentDirectory.setParentDirectory(rootDirectory);

        new ConsoleOutputWriter().Print(drive.getLabel() + currentDirectory.getPath() + "> ");
        userInput = new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static Directory getCurrentDirectory(){
        return  currentDirectory;
    }
}
