package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CDCommandTest {

    @Test
    void changeOneDirectory() {
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
        testConsole.setUserInput("cd " + newDirName);
        testConsole.runCommand();
        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("There are no files to see here!", consoleOutput);

    }

    @Test
    void noDirectoryFound() {
        // Arrange
        Console testConsole = new Console();

        String newDirName = "newDir";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("cd " + newDirName);
        testConsole.runCommand();

        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Directory not found!", consoleOutput);
    }

    @Test
    void cdToRoot() {
        // Arrange
        Console testConsole = new Console();

        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("cd ..");
        testConsole.runCommand();

        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Root Directory already reached", consoleOutput);
    }
}