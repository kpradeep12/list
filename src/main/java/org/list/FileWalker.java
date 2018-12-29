package org.list;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class FileWalker {
    public static void list(Path path) throws IOException {
        Set<FileVisitOption> options = new HashSet<>();
        options.add(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(path,
                options,
                Integer.MAX_VALUE,
                new TreeFileVisitor());
    }
}
