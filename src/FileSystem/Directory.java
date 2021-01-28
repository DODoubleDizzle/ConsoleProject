package FileSystem;

import java.util.ArrayList;

public class Directory extends FileSystemItem{
    ArrayList<FileSystemItem> fileSystemItems = new ArrayList<>();

    public ArrayList<FileSystemItem> getFileSystemItems() {
        return fileSystemItems;
    }

    public void setFileSystemItems(ArrayList<FileSystemItem> fileSystemItems) {
        this.fileSystemItems = fileSystemItems;
    }

    public void addFileSystemItem(FileSystemItem fileSystemItems) {
        this.fileSystemItems.add(fileSystemItems);
    }

}
