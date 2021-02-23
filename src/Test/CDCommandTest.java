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

        // Act
        testConsole.setUserInput("mkdir " + newDirName);
        testConsole.runCommand();
        testConsole.setUserInput("cd " + newDirName);
        testConsole.runCommand();
        testConsole.setOutputWriter(testOutPutWriter);
        testConsole.setUserInput("dir");
        testConsole.runCommand();

        // Assert
        assertEquals(newDirName, testOutPutWriter.getOutput());

    }
}