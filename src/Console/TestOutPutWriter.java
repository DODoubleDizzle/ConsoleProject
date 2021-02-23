package Console;

public class TestOutPutWriter implements IOutputWriter {

    String output = "";

    @Override
    public void print(String text) {
        output = text;
    }

    @Override
    public void printLine(String text) {
        output = text;
    }

    public String getOutput(){
        return  output;
    }
}
