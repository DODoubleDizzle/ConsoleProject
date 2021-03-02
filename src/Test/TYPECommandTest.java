package Test;

import Console.Console;
import org.junit.jupiter.api.Test;
import Console.TestOutPutWriter;

import static org.junit.jupiter.api.Assertions.*;

class TYPECommandTest {

    @Test
    void fewWords() {
        // Arrange
        Console testConsole = new Console();
        String newFileName = "newFile";
        String testContent = "just a few words. ";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();


        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("mkfile " + newFileName + " " + testContent);
        testConsole.runCommand();
        testConsole.setUserInput("type " + newFileName);
        testConsole.setOutputWriter(testOutPutWriter);
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        testConsole.setUserInput("exit");

        // Assert
        assertEquals(testContent, consoleOutput);
    }

    @Test
    void longText() {
        // Arrange
        Console testConsole = new Console();
        String newFileName = "newFile";
        String testContent = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. ";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();


        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("mkfile " + newFileName + " " + testContent);
        testConsole.runCommand();
        testConsole.setUserInput("type " + newFileName);
        testConsole.setOutputWriter(testOutPutWriter);
        testConsole.runCommand();
        String consoleOutput = testOutPutWriter.getOutput();

        testConsole.setUserInput("exit");

        // Assert
        assertEquals(testContent, consoleOutput);
    }
}