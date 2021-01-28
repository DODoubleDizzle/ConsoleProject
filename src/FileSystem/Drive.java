package FileSystem;

import java.util.ArrayList;

public class Drive {
    String name;
    String label;
    String size;
    String prompt;
    ArrayList<FileSystemItem> fileSystemItems = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public ArrayList<FileSystemItem> getFileSystemItems() {
        return fileSystemItems;
    }

    public void setFileSystemItems(ArrayList<FileSystemItem> fileSystemItems) {
        this.fileSystemItems = fileSystemItems;
    }

    public void addFileSystemItem(FileSystemItem fileSystemItem) {
        this.fileSystemItems.add(fileSystemItem);
    }
}
