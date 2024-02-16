import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


    }

    // Задание 1: Работа с классом File

    /**
     * Написать метод, который создает файл с именем
     * "example.txt" в текущей директории, затем считывает
     * этот файл с использованием FileInputStream и записывает
     * его содержимое в новый файл "copy_example.txt" с использованием FileOutputStream.
     */
    public static void copyFileUsingFileStreams() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("example.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("copy_example.txt");
        while (fileInputStream.read() != -1){
            fileOutputStream.write(fileInputStream.read());
        }
    }

    // Задание 2: Работа с классом Path

    /**
     * Написать метод, который использует Path и Files
     * для копирования файла "example.txt" в новый файл "copy_example_path.txt".
     * Проверить, существует ли файл "example.txt" перед копированием.
     */
    public static void copyFileUsingPath() throws IOException {
        File file = new File("example.txt");
        Path path = Paths.get("example.txt");
        Path file1 = Paths.get("copy_example_path.txt");
        if (file.exists()){
            Path copy = Files.copy(path, file1);
        }
    }

    // Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, читает первые 20 байт и записывает
     * их в новый файл "random_access_copy.txt".
     */
    public static void copyFileUsingRandomAccessFile() throws IOException {
        RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
        byte[] buffer = new byte[20];

        String first20 = String.valueOf(file.read(buffer));
        file.writeBytes(first20);
    }

    // Усложненное Задание 1: Работа с классом File

    /**
     * Написать метод, который читает файл "example.txt",
     * подсчитывает количество слов в файле и записывает это количество
     * в новый файл "word_count.txt". Использовать BufferedReader и BufferedWriter
     * для эффективной работы с текстом.
     */
    public static void countWordsInFile() throws IOException {
        RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
        byte[] BufferedReader = new byte[(int) file.length()];
        String BufferedWriter = String.valueOf(file.read(BufferedReader));
        file.writeBytes(BufferedWriter);
    }

    // Усложненное Задание 2: Работа с классом Path

    /**
     * Написать метод, который ищет все файлы с расширением ".txt"
     * в текущей директории и её поддиректориях. Результаты поиска
     * (пути к файлам) записать в файл "found_files.txt".
     */
    public static void findTxtFilesInDirectory() throws IOException {

    }

    // Усложненное Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, переходит к последнему абзацу
     * в файле и копирует его содержимое в новый файл "last_paragraph.txt".
     */
    public static void copyLastParagraphUsingRandomAccess() throws IOException {

    }
}