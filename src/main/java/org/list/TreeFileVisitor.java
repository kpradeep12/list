package org.list;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public class TreeFileVisitor extends SimpleFileVisitor<Path> {
    private int folderLevel = 0;
    private String space = "\u2502   ";
    private Path initialPath;
    private int folderFileCount = 0;
    TreeFileVisitor(Path initialPath){
        this.initialPath = initialPath;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
        folderFileCount = path.toFile().listFiles().length;
        /*folderFileCount = 0;
        for(File file: path.toFile().listFiles()){
            if(file.isDirectory())
                folderFileCount++;
        }*/
        if(initialPath.equals(path)){
            System.out.format(".%n");
        }else {
            Console.printFolder(path, space, folderLevel,folderFileCount);
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
        folderFileCount--;
        if(!path.toFile().isHidden())
            Console.printFile(path, space, folderLevel, folderFileCount);
        return FileVisitResult.CONTINUE;
    }

}