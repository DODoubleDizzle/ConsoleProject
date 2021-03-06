package FileSystem;

public abstract class FileSystemItem {
    String name;
    String path;
    Directory parentDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        path = "";
        if(parentDirectory != null) {
            getPathRecursion(parentDirectory);
        }
        path += this.getName();
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Directory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(Directory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public void getPathRecursion(Directory directory){
        path = directory.getName() + "\\" + path;
        if(directory.parentDirectory != null){
            getPathRecursion(directory.parentDirectory);
        }
    }

    public String getContent() {
        return "";
    }

    public void setContent(String content) {
        return;
    }
}
