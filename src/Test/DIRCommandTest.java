package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DIRCommandTest {

    @Test
    void DirTestWithDirectory() {
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
        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();
        testConsole.setUserInput("exit");

        // Assert
        assertEquals(newDirName, consoleOutput);
    }

    @Test
    void DirTestWithoutDirectory() {
        // Arrange
        Console testConsole = new Console();
        String newDirName = "newDir";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();
        testConsole.setUserInput("exit");

        // Assert
        assertEquals("There are no files to see here!", consoleOutput);
    }

    @Test
    void DirTestWithsTwoDirectory() {
        // Arrange
        Console testConsole = new Console();
        String newDirName1 = "newDir";
        String newDirName2 = "newDirTheSecond";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + newDirName1);
        testConsole.runCommand();
        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String consoleOutput1 = testOutPutWriter.getOutput();
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + newDirName2);
        testConsole.runCommand();
        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String consoleOutput2 = testOutPutWriter.getOutput();

        testConsole.setUserInput("exit");

        // Assert
        assertEquals(newDirName1, consoleOutput1);
        assertEquals(newDirName2, consoleOutput2);
    }
}