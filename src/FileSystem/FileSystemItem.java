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
        getPathRecursion(parentDirectory);
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
        path += directory.getName() + "\\";
        if(directory.parentDirectory != null){
            getPathRecursion(directory.parentDirectory);
        }
    }
}
