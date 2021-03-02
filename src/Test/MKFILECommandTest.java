package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MKFILECommandTest {

    @Test
    void MKFILE() {
        // Arrange
        Console testConsole = new Console();
        String newFileName = "newFile";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("mkfile " + newFileName + " blablabla blabla");
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        testConsole.setUserInput("exit");

        // Assert
        assertEquals("File newFile has been created.", consoleOutput);

    }
}