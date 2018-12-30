package org.list;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath(args[0]);
        FileWalker.list(path);
    }
}
