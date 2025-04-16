package archiver;

import archiver.command.*;
import archiver.command.ZipExtractCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private final static Map<Operation, Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operation.EXTRACT, new ZipExtractCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
        allKnownCommandsMap.put(Operation.ADD, new ZipAddCommand());
        allKnownCommandsMap.put(Operation.CREATE, new ZipCreateCommand());
        allKnownCommandsMap.put(Operation.REMOVE, new ZipRemoveCommand());
        allKnownCommandsMap.put(Operation.CONTENT, new ZipContentCommand());
    }

    private CommandExecutor() {

    }

    public static void execute(Operation operation) throws Exception {
        allKnownCommandsMap.get(operation).execute();
    }

}
