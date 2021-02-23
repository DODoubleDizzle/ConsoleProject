package Test;

import Console.Console;
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
        testConsole.setUserInput("exit");


        // Assert
        assertEquals(newDirName, consoleOutput);

    }
}