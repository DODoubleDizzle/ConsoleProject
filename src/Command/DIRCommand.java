package Command;


import java.io.File;

public class DIRCommand extends Command {
    // not working at the moment
    File dir = new File("C:\\");
    File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
        for (File file : files) {
            // Check if the file is a directory
            if (file.isDirectory()) {
                // We will not print the directory name, just use it as a new
                // starting point to list files from
                listDirectory(file.getAbsolutePath());
            } else {
                // We can use .length() to get the file size
                System.out.println(file.getName() + " (size in bytes: " + file.length()+")");
            }
        }
    }
}