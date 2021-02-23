package Test;

import Console.IOutputWriter;

public class TestOutPutWriter implements IOutputWriter {
    @Override
    public void print(String text) {
        returnPrint(text);
    }

    public String returnPrint(String text){
        return text;
    }

    @Override
    public void printLine(String text) {

    }
}
