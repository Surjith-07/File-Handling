package file;

import java.io.*;

public class FileUtil {
    public static void createFolder(String folderPath, String folder) {
        File file = new File("/home/surjith-pt7589/Documents/" + folder);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Folder :" + folder + " Created....!!!");
        } else {
            System.out.println("Folder :" + folder + " already in this location");
        }
        System.out.println(new File("/home/surjith-pt7589/Documents/" + folder).exists());
        System.out.println("\n");
    }

    public static void createSubFolder(String folderPath, String subFolder) {
        File file = new File(folderPath + subFolder);
        if (!file.exists()) {
            file.mkdirs();
            System.out.println("SubFolder :" + subFolder + " Created....!!!");
        } else {
            System.out.println("Folder :" + subFolder + " already in this location");
        }
        System.out.println("\n");
    }

    public static void createFile(String folderPath, String fileName) throws IOException {
        File file = new File(folderPath + fileName);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File :" + fileName + " Created....!!!");
        } else {
            System.out.println("File :" + fileName + " already in this location");
        }
        System.out.println("\n");
    }

    public static void deleteFile(String filePath, String fileName) {
        File file = new File(filePath + fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("File :" + fileName + " Deleted....!!!");
        } else {
            System.out.println("Entered File Not in the Folder.....");
        }
        System.out.println("\n");
    }

    public static void renameFile(String filePath, String fileName, String newFileName) {
        File exisFile = new File(filePath + fileName);
        if (exisFile.exists()) {
            File file = new File(filePath + newFileName);
            boolean exist = exisFile.renameTo(file);
            System.out.println(exist ? "File :" + file.getName() + " Renamed....!!!" : "Renaming Error....!!!");
        } else {
            System.out.println("Entered File Not in the Folder.....");
        }
        System.out.println("\n");
    }

    public static void printAll(String directory) {
        File file = new File(directory);
        for (String ele : file.list()) {
            System.out.println(ele);
        }
        System.out.println("\n");
    }

    public static void printAllFiles(String directory) {
        File file = new File(directory);
        for (File ele : file.listFiles()) {
            if (ele.isFile()) {
                System.out.println(ele);
            }
        }
        System.out.println("\n");
    }


    public static void printAllFolders(String directory) {
        File file = new File(directory);
        for (File ele : file.listFiles()) {
            if (ele.isDirectory()) {
                System.out.println(ele);
            }
        }
        System.out.println("\n");
    }

    public static void printByExtension(String directory, String extension) {
        File file = new File(directory);
        for (File ele : file.listFiles()) {
            if (ele.isFile()) {
                String fileName = ele.getName();
                int index = fileName.indexOf(".");
                if (fileName.substring(index + 1).equals(extension)) {
                    System.out.println(ele);
                }
            }
        }//file.length>5000[above 5000bytes only printed]
        System.out.println("\n");
    }

    public static void writeFile(File file, String data) throws IOException {
//        try (FileWriter fileWriter = new FileWriter(file,true)) {
//            fileWriter.write(data);
//            fileWriter.flush();
//        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        }


        System.out.println("\n");
    }

    public static void readFile(File file) throws IOException {
//        try(FileReader fileReader=new FileReader(file)){
//            int value=fileReader.read();
//            while(value>-1){
//                System.out.print((char)(value));
//                value=fileReader.read();
//            }
//        }
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }


        System.out.println("\n");
    }

}
