package main;

import file.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;
        String folder;
        String path;
        String fileName;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 For to Create Folder");
            System.out.println("2 For to Create SubFolder");
            System.out.println("3 For Create File");
            System.out.println("4 For Delete File");
            System.out.println("5 For Rename the File");
            System.out.println("6 For Print All files and folders in the Directory");
            System.out.println("7 For Print All files in the Directory");
            System.out.println("8 For Print All folders in the Directory");
            System.out.println("9 For Print files Based on extension");
            System.out.println("10 For Wirte File");
            System.out.println("11 For Read File");
            value = scanner.nextInt();
            try {
                switch (value) {
                    case 1:
                        System.out.println("Enter the Path to Create Folder :");
                        path = scanner.next();
                        System.out.println("Enter the folder name :");
                        folder = scanner.next();
                        FileUtil.createFolder("/home/surjith-pt7589/Documents/", folder);
                        break;
                    case 2:
                        System.out.println("Enter the Path to Create SubFolder :");
                        path = scanner.next();
                        System.out.println("Enter the SubFolder name :");
                        folder = scanner.next();
                        FileUtil.createSubFolder("/home/surjith-pt7589/Documents/FileFolder/", folder);
                        break;
                    case 3:
                        System.out.println("Enter the Path to Create the File :");
                        path = scanner.next();
                        System.out.println("Enter the fileName :");
                        fileName = scanner.next();
                        FileUtil.createFile("/home/surjith-pt7589/Documents/FileFolder/", fileName);
                        break;
                    case 4:
                        System.out.println("Enter the Path to Delete the File :");
                        path = scanner.next();
                        System.out.println("Enter the fileName :");
                        fileName = scanner.next();
                        FileUtil.deleteFile("/home/surjith-pt7589/Documents/FileFolder/", fileName);
                        break;
                    case 5:
                        System.out.println("Enter the Path of Existing File :");
                        path = scanner.next();
                        System.out.println("Enter the fileName :");
                        fileName = scanner.next();
                        System.out.println("Enter the new fileName :");
                        String newFileName = scanner.next();
                        FileUtil.renameFile("/home/surjith-pt7589/Documents/FileFolder/", fileName, newFileName);
                        break;
                    case 6:
                        System.out.println("Enter the Directory Path :");
                        folder = scanner.next();
                        FileUtil.printAll("/home/surjith-pt7589/Documents/");
                        break;
                    case 7:
                        System.out.println("Enter the Directory Path :");
                        folder = scanner.next();
                        FileUtil.printAllFiles("/home/surjith-pt7589/Documents/");
                        break;
                    case 8:
                        System.out.println("Enter the Directory Path :");
                        folder = scanner.next();
                        FileUtil.printAllFolders("/home/surjith-pt7589/Documents/");
                        break;
                    case 9:
                        System.out.println("Enter the Directory Path :");
                        folder = scanner.next();
                        System.out.println("Enter the file Extension");
                        String extension = scanner.next();
                        FileUtil.printByExtension("/home/surjith-pt7589/Documents/", extension);
                        break;

                    case 10:
                        System.out.println("Enter the File Path :");
                        folder = scanner.next();
                        System.out.println("Write Data :");
                        String data = scanner.next();
                        FileUtil.writeFile(new File("/home/surjith-pt7589/Documents/FileFolder/student.txt"), data);
                        break;
                    case 11:
                        System.out.println("Enter the File Path :");
                        folder = scanner.next();
                        System.out.println("Data inside the File :");
                        FileUtil.readFile(new File("/home/surjith-pt7589/Documents/FileFolder/student.txt"));
                        break;
                    default:
                        System.out.println("Enter the Correct Option......!!!!!");
                        break;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
