package org.list;

import java.nio.file.Path;

public class Console {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printFolder(Path path, String space, int folderLevel, int folderFileCount){
        //System.out.printf("%s %d:",path.getFileName(), folderFileCount);
        if(folderFileCount <= 0){
            System.out.format("%s%s%s%s %s %n",
                    ANSI_YELLOW,
                    space.repeat(folderLevel),
                    "\u2514\u2500\u2500",
                    ANSI_RESET,
                    path.getFileName());
        }else
            System.out.format("%s%s%s%s %s %n",
                ANSI_YELLOW,
                space.repeat(folderLevel),
                "\u251c\u2500\u2500",
                ANSI_RESET,
                path.getFileName());
    }

    public static void printFile(Path path, String space, int folderLevel, int folderFileCount){
        if(folderFileCount <= 0){
            System.out.format("%s%s%s%s %s %n",
                    ANSI_YELLOW,
                    space.repeat(folderLevel),
                    "\u2514\u2500\u2500",
                    ANSI_RESET,
                    path.getFileName());
        }else
        System.out.format("%s%s%s%s %s %n",
                ANSI_YELLOW,
                space.repeat(folderLevel),
                "\u251c\u2500\u2500",
                ANSI_RESET,
                path.getFileName());
    }
}
