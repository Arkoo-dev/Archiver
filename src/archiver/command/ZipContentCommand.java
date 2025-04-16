package archiver.command;


import archiver.ConsoleHelper;
import archiver.FileProperties;
import archiver.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Archive contents:");

        List<FileProperties> files = zipFileManager.getFileList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }

        ConsoleHelper.writeMessage("Archive contents viewed.");
    }
}
