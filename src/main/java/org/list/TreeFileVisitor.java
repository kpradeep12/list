package org.list;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TreeFileVisitor extends SimpleFileVisitor<Path> {
    private int folderLevel = 0;
    private String space = "|   ";
    private Path initialPath;
    TreeFileVisitor(Path initialPath){
        this.initialPath = initialPath;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
        if(initialPath.equals(path)){
            System.out.format(".%n");
        }else {
            Console.printFolder(path, space, folderLevel);
            folderLevel++;
        }
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException{
        folderLevel--;
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException{
        /*System.out.format("%s%s %s %n",
                //space.repeat(folderLevel > 0 ? folderLevel+1: folderLevel),
                space.repeat(folderLevel),
                "\u251c\u2500\u2500",
                path.getFileName());*/
        Console.printFile(path, space, folderLevel);
        return FileVisitResult.CONTINUE;
    }

}