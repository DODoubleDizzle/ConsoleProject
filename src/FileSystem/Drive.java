package FileSystem;

import java.util.ArrayList;

public class Drive {

    String label;

    ArrayList<FileSystemItem> fileSystemItems = new ArrayList<>();

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }



    public void addFileSystemItem(FileSystemItem fileSystemItem) {
        this.fileSystemItems.add(fileSystemItem);
    }

    /**
     *     String size;
     *     String prompt;
     *     String name;
     *
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

         public String getName() {
         return name;
         }

         public void setName(String name) {
         this.name = name;
     }
     */
}
