package Factory;

import Command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    public static Map<String, Command> getCommands(){
        Map<String, Command> commandList = new HashMap<>();
        commandList.put("exit", new ExitCommand());
        commandList.put("cd", new CDCommand());
        commandList.put("dir", new DIRCommand());
        commandList.put("mkdir", new MKDIRCommand());
        commandList.put("del", new DELCommand());
        commandList.put("ver", new VERCommand());
        commandList.put("ren", new RENCommand());
        commandList.put("cls", new CLSCommand());
        commandList.put("clr", new CLRCommand());
        commandList.put("move", new MOVECommand());
        commandList.put("mkfile", new MKFILECommand());
        commandList.put("more", new MORECommand());
        commandList.put("type", new TYPECommand());
        return commandList;
    }
}
