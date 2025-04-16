package archiver.command;


import archiver.ConsoleHelper;
import archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Removing a file from an archive.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Enter the full path to the file in the archive:");
        Path sourcePath = Paths.get(ConsoleHelper.readString());
        zipFileManager.removeFile(sourcePath);

        ConsoleHelper.writeMessage("File removed from archive.");
    }
}