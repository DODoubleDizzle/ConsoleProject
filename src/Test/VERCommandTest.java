package Test;

import Command.VERCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VERCommandTest {

    @Test
    void verwithNoInput() {
        //
        VERCommand verCommand = new VERCommand();
        String input = "";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();

        //
        verCommand.execute(input, testOutPutWriter);

        //
        assertEquals(System.getProperty("os.name") + " Version: " + System.getProperty("os.version"), testOutPutWriter.getOutput());
    }
}