package Test;

import Console.Console;
import Console.TestOutPutWriter;
import org.junit.jupiter.api.Test;

class ExitCommandTest {

    @Test
    void execute() {
        // Arrange
        Console testConsole = new Console();

        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();
        testConsole.setOutputWriter(testOutPutWriter);

        // Act
        testConsole.setToProcess(false);
        testConsole.start();
        testConsole.setUserInput("exit");

        // Assert

    }
}