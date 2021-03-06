package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CLRCommandTest {
    @Test
    void changeColor() {
        // Arrange
        Console testConsole = new Console();
        String color = "blue";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("clr " + color);
        testConsole.runCommand();

        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("\u001B[34mText color changed.", consoleOutput);
    }

    @Test
    void wrongColorInput() {
        // Arrange
        Console testConsole = new Console();
        String color = "noColor";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("clr " + color);
        testConsole.runCommand();

        String consoleOutput = testOutPutWriter.getOutput();

        // Assert
        assertEquals("Something went wrong!", consoleOutput);
    }
}