package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DELCommandTest {
    @Test
    void deleteFile() {
        // Arrange
        Console testConsole = new Console();

        String newDirName = "dirToDelete";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("mkdir " + newDirName);
        testConsole.runCommand();
        testConsole.setUserInput("del " + newDirName);
        testConsole.runCommand();
        String removedConsoleOutput = testOutPutWriter.getOutput();
        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String afterRemoveConsoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Item has been removed.", removedConsoleOutput);
        assertEquals("There are no files to see here!", afterRemoveConsoleOutput);
    }

    @Test
    void deleteNonExistingFile() {
        // Arrange
        Console testConsole = new Console();

        String newDirName = "dirToDelete";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("del " + newDirName);
        testConsole.runCommand();
        String removedConsoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Item has not been found.", removedConsoleOutput);

    }
}