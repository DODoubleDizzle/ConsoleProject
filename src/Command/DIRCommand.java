package Command;

public class DIRCommand extends Command {
    // Creates an array which will store the names of files and directories
    String[] dirOuput;

    // Creates a new File instance by abstract pathname
    File f = new File("C:\\");

    // fills the array with the file and directory names
    dirOutput = f.list();

    // To singlehandly get the content of the path from the command output
    for (String pathContent : dirOutput) {
        // Print names of files and directories
        System.out.println(pathContent);
    }
}