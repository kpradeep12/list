package org.list;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TreeFileVisitorNew extends SimpleFileVisitor<Path> {
    private int folderLevel = 0;
    private String space = "\u2502   ";
    private Path initialPath;
    private int folderFileCount = 0;

    TreeFileVisitorNew(Path initialPath){
        this.initialPath = initialPath;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {

        /*if(initialPath.equals(path)){
            System.out.format(".%n");
        }else {
            if(folderFileCount <= 0){
                System.out.format("%s%s%s%s %s %n",
                        Console.ANSI_YELLOW,
                        space.repeat(folderLevel),
                        "\u2514\u2500\u2500",
                        Console.ANSI_RESET,
                        path.getFileName());
            }else*/

                System.out.format("%s%s%s%s %s %n",
                        Console.ANSI_YELLOW,
                        space.repeat(folderLevel),
                        "\u251c\u2500\u2500",
                        Console.ANSI_RESET,
                        path.getFileName());
            folderLevel++;
        //}

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
        if(!path.toFile().isHidden()){
            /*if(folderFileCount <= 0){
                System.out.format("%s%s%s%s %s %n",
                        Console.ANSI_YELLOW,
                        space.repeat(folderLevel),
                        "\u2514\u2500\u2500",
                        Console.ANSI_RESET,
                        path.getFileName());
            }else*/
                System.out.format("%s%s%s%s %s %n",
                        Console.ANSI_YELLOW,
                        space.repeat(folderLevel),
                        "\u251c\u2500\u2500",
                        Console.ANSI_RESET,
                        path.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

}