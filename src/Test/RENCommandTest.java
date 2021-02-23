package Test;

import Console.Console;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RENCommandTest {

    @Test
    void RENWithTwoParameters() {
        // Arrange
        Console testConsole = new Console();

        String dirName = "newDir";
        String newDirName = "dirRename";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + dirName);
        testConsole.runCommand();
        testConsole.setUserInput("ren " + dirName + " " + newDirName);
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals(dirName + " has been renamed to " + newDirName, consoleOutput);
    }

    @Test
    void RENWithDirectoryParameter() {
        // Arrange
        Console testConsole = new Console();

        String dirName = "newDir";
        String newDirName = "dirRename";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + dirName);
        testConsole.runCommand();
        testConsole.setUserInput("ren " + dirName);
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Wrong Input", consoleOutput);
    }

    @Test
    void RENWithNameParameter() {
        // Arrange
        Console testConsole = new Console();

        String newDirName = "dirRename";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir directoryName");
        testConsole.runCommand();
        testConsole.setUserInput("ren " + newDirName);
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Wrong Input", consoleOutput);
    }

    @Test
    void RENWithoutParameter() {
        // Arrange
        Console testConsole = new Console();

        String dirName = "newDir";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + dirName);
        testConsole.runCommand();
        testConsole.setUserInput("ren ");
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Wrong Input", consoleOutput);
    }
}