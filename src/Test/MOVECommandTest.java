package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MOVECommandTest {

    @Test
    void MoveWithTwoParameters() {
        // Arrange
        Console testConsole = new Console();

        String dirName = "newDir";
        String dirName2 = "newDir2";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("mkdir " + dirName);
        testConsole.runCommand();
        testConsole.setUserInput("cd " + dirName);
        testConsole.runCommand();
        testConsole.setUserInput("mkdir " + dirName2);
        testConsole.runCommand();
        testConsole.setUserInput("move " + dirName2 + " ..");
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("File has been moved", consoleOutput);
    }

}