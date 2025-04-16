package archiver.command;


import archiver.ConsoleHelper;
import archiver.ZipFileManager;
import archiver.exception.PathNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Unpacking archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the path where the archive will be unpacked:");
            Path destinationPath = Paths.get(ConsoleHelper.readString());
            zipFileManager.extractAll(destinationPath);

            ConsoleHelper.writeMessage("Archive unpacked.");

        } catch (PathNotFoundException e) {
            ConsoleHelper.writeMessage("Invalid path for unpacking.");
        }
    }
}