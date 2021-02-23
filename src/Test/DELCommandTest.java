package Test;

import Console.Console;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DELCommandTest {
    @Test
    void noDirectoryFound() {
        // Arrange
        Console testConsole = new Console();

        String newDirName = "dirToDelete";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + newDirName);
        testConsole.runCommand();
        testConsole.setUserInput("del " + newDirName);
        testConsole.runCommand();
        String removedConsoleOutput = testOutPutWriter.getOutput();
        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String afterRemoveConsoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Item has been removed", removedConsoleOutput);
        assertEquals("There are no files to see here!", afterRemoveConsoleOutput);
    }
}