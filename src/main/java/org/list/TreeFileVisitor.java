package org.list;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TreeFileVisitor extends SimpleFileVisitor<Path> {
    private int folderLevel = 0;
    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
        folderLevel++;
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException{
        folderLevel--;
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException{
        System.out.format("%s %s %n","\u251c\u2500", path.getFileName());
        return FileVisitResult.CONTINUE;
    }

}