package Test;

import Command.CDCommand;
import Command.DIRCommand;
import Command.MKDIRCommand;
import Command.VERCommand;
import Console.Console;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CDCommandTest {

    @Test
    void changeOneDirectory() {
        // Arrange
        Console testConsole = new Console();
        DIRCommand dirCommand = new DIRCommand();

        String newDirName = "newDir";
        TestOutPutWriter testOutPutWriter = new TestOutPutWriter();

        // Act
        testConsole.setUserInput("mkdir " + newDirName);
        testConsole.setUserInput("cd " + newDirName);

        // Assert
        assertEquals(newDirName, testOutPutWriter.getOutput());

    }
}