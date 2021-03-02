package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MKDIRCommandTest {

    @Test
    void MKDIRWithParameter() {
        // Arrange
        Console testConsole = new Console();
        String newDirName = "newDir";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + newDirName);
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();
        testConsole.setUserInput("exit");

        // Assert
        assertEquals("", consoleOutput);
    }
    @Test
    void MKDIRWithoutParameter() {
        // Arrange
        Console testConsole = new Console();
        String newDirName = "newDir";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir");
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();
        testConsole.setUserInput("exit");

        // Assert
        assertEquals("Wrong Input", consoleOutput);
    }
}