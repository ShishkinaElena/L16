package p1;

import java.io.File;

public class Main {
    public static void main(String[] args) {

      /*  File file = new File("D:\\test");
        if (file.isDirectory()){    // проверка файла
            for (File item: file.listFiles()){  // получить файл, который находится в этой директории
                if (item.isDirectory()){
                    System.out.println(item.getName() + " is folder");  // распечатать из директории//программа, которая показывает, что лежит в файле

                }else {
                    System.out.println((item.getName() + " is file"));
                }
            }
        }*/
        File newDir = new File("D:\\test\\temp"); // создание новой папки
        boolean c = newDir.mkdir();
        if (c){
            System.out.println("Folder is created");
        }
        File newNameDir = new File("D:\\test\\newDir"); //переименование
        newDir.renameTo(newNameDir);

        // удаление
        boolean del = newNameDir.delete();
        if (del){
            System.out.println("Folder is deleted");
        }
    }
}
