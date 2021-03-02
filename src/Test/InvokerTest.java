package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvokerTest {

    @Test
    void executeCommand() {
        // Arrange
        Console testConsole = new Console();
        String newDirName = "newDir";
        String newFileName = "newFile";
        String newColor = "red";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.Start();
        testConsole.setUserInput("mkdir " + newDirName);
        testConsole.runCommand();
        String consoleOutput1 = testOutPutWriter.getOutput();

        testConsole.setUserInput("cd " + newDirName);
        testConsole.runCommand();
        String consoleOutput2 = testOutPutWriter.getOutput();

        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String consoleOutput3 = testOutPutWriter.getOutput();

        testConsole.setUserInput("mkfile " + newFileName + " this is a test text.");
        testConsole.runCommand();
        String consoleOutput4 = testOutPutWriter.getOutput();

        testConsole.setUserInput("dir");
        testConsole.runCommand();
        String consoleOutput5 = testOutPutWriter.getOutput();

        testConsole.setUserInput("type " + newFileName);
        testConsole.runCommand();
        String consoleOutput6 = testOutPutWriter.getOutput();

        testConsole.setUserInput("clr " + newColor);
        testConsole.runCommand();
        String consoleOutput7 = testOutPutWriter.getOutput();

        testConsole.setUserInput("cls");
        testConsole.runCommand();
        String consoleOutput8 = testOutPutWriter.getOutput();

        testConsole.setUserInput("abc");
        testConsole.runCommand();
        String consoleOutput9 = testOutPutWriter.getOutput();

        testConsole.setUserInput("mkfile");
        testConsole.runCommand();
        String consoleOutput10 = testOutPutWriter.getOutput();

        testConsole.setUserInput("exit");

        // Assert
        assertEquals("", consoleOutput1);
        assertEquals("", consoleOutput2);
        assertEquals("There are no files to see here!", consoleOutput3);
        assertEquals("File newFile has been created.", consoleOutput4);
        assertEquals("newFile", consoleOutput5);
        assertEquals("this is a test text. ", consoleOutput6);
        assertEquals("\u001B[31mText color changed.", consoleOutput7);
        assertEquals("Coming soon!", consoleOutput8);
        assertEquals("Command not found", consoleOutput9);
        assertEquals("Wrong Input", consoleOutput10);
    }
}