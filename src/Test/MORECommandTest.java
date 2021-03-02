package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MORECommandTest {
    @Test
    void MOREWithOneParameter() {
        // Arrange
        Console testConsole = new Console();
        String fileName = "newFile";
        String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("mkfile " + fileName + " "+ content);
        testConsole.runCommand();
        testConsole.setOutputWriter(testOutPutWriter);
        testConsole.setUserInput("more " + fileName);
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();
        testConsole.setUserInput("exit");

        // Assert
        assertEquals( " officia deserunt mollit anim id est laborum. ", consoleOutput);

    }
}

