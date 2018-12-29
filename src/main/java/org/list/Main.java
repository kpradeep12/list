package org.list;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("/Users/pradeep/code/algorithms/src/main/java/org/algo");
        FileWalker.list(path);
    }
}
