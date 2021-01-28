package Command;


import java.io.File;

public class DIRCommand extends Command {
    @Override
    public void execute(String input) {
        // not working at the moment
        File dir = new File("C:\\");
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                // Check if the file is a directory
                if (file.isDirectory()) {
                    // File is directory, so we just want the name
                    System.out.println(file.getName());
                } else {
                    // We can use .length() to get the file size
                    System.out.println(file.getName() + " (size in bytes: " + file.length() + ")");
                }
            }
        }
    }
}