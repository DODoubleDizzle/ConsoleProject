package Test;

import Command.VERCommand;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VERCommandTest {

    @Test
    void VerWithNoInput() {
        //Arrange
        VERCommand verCommand = new VERCommand();
        String input = "";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();

        //Act
        verCommand.execute(input, testOutPutWriter);

        //Assert
        assertEquals(System.getProperty("os.name") + " Version: " + System.getProperty("os.version"), testOutPutWriter.getOutput());
    }

    @Test
    void VerWithAdditionalInput() {
        //Arrange
        VERCommand verCommand = new VERCommand();
        String input = "Additional Input";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();

        //Act
        verCommand.execute(input, testOutPutWriter);

        //Assert
        assertEquals(System.getProperty("os.name") + " Version: " + System.getProperty("os.version"), testOutPutWriter.getOutput());
    }
}