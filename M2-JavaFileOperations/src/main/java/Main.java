import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/resul/IdeaProjects/CoreJavaOtherTopics/M2-JavaFileOperations/src/main/java/students.txt";
        String data = toWrite();

        System.out.println("<!-------------------------------------------------!>");
        System.out.println("<!-------------createFile(path)--------------------!>");
        System.out.println("<!-------------------------------------------------!>");
        createFile(path);
        System.out.println();

        System.out.println("<!-------------------------------------------------!>");
        System.out.println("<!-------------getFileInfo(path)-------------------!>");
        System.out.println("<!-------------------------------------------------!>");
        getFileInfo(path);
        System.out.println();

        System.out.println("<!-------------------------------------------------!>");
        System.out.println("<!-------------writeFile(path,data)----------------!>");
        System.out.println("<!-------------------------------------------------!>");
        writeFile(path, data);
        System.out.println();

        System.out.println("<!-------------------------------------------------!>");
        System.out.println("<!-------------readFile(path)----------------------!>");
        System.out.println("<!-------------------------------------------------!>");
        readFile(path);
        System.out.println();

        System.out.println("<!-------------------------------------------------!>");
        System.out.println("<!--------------getFileInfo(path)------------------!>");
        System.out.println("<!-------------------------------------------------!>");
        getFileInfo(path);
        System.out.println();


    }

    private static void writeFile(String path, String data) {
        try {
            /*

            with append parameter true:
            BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));

            FileWriter file = new FileWriter(path);

             */
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (String s : data.split("\n"))
                bufferedWriter.write(s + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String toWrite() {
        return """
                import java.io.*;import java.util.Scanner;
                public class Main {
                    public static void main(String[] args) {
                        String path = "/Users/resul/IdeaProjects/CoreJavaOtherTopics/M2-JavaFileOperations/src/main/java/students.txt";
                        String data = toWrite();

                        System.out.println("<!-------------------------------------------------!>");
                        System.out.println("<!-------------createFile(path)--------------------!>");
                        System.out.println("<!-------------------------------------------------!>");
                        createFile(path);
                        System.out.println();

                        System.out.println("<!-------------------------------------------------!>");
                        System.out.println("<!-------------getFileInfo(path)-------------------!>");
                        System.out.println("<!-------------------------------------------------!>");
                        getFileInfo(path);
                        System.out.println();

                        System.out.println("<!-------------------------------------------------!>");
                        System.out.println("<!-------------writeFile(path,data)----------------!>");
                        System.out.println("<!-------------------------------------------------!>");
                        writeFile(path,data);
                        System.out.println();

                        System.out.println("<!-------------------------------------------------!>");
                        System.out.println("<!-------------readFile(path)----------------------!>");
                        System.out.println("<!-------------------------------------------------!>");
                        readFile(path);
                        System.out.println();

                        System.out.println("<!-------------------------------------------------!>");
                        System.out.println("<!--------------getFileInfo(path)------------------!>");
                        System.out.println("<!-------------------------------------------------!>");
                        getFileInfo(path);
                        System.out.println();



                    }

                    private static void writeFile(String path, String data) {
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
                            //FileWriter file = new FileWriter(path);
                            for (String s: data.split("\\n"))
                                bufferedWriter.write(s + "\\n");
                            bufferedWriter.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }

                    private static String toWrite() {
                        return\s
                    }

                    private static void readFile(String path) {
                        File file = new File(path);
                        try {
                            Scanner scanner = new Scanner(file);
                            while (scanner.hasNextLine()){
                                System.out.println(scanner.nextLine());
                            }
                            scanner.close();
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }finally {

                        }


                    }

                    public static void createFile(String path) {
                        File file = new File(path);
                        try {
                            if (file.createNewFile())
                                System.out.println("File Created");
                            else
                                System.out.println("File Already Exist");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }

                    public static void getFileInfo(String path) {
                        File file = new File(path);
                        if (file.exists()) {
                            System.out.println("File Name: " + file.getName());
                            System.out.println("File Path: " + file.getPath());
                            System.out.println("Writable: " + file.canWrite());
                            System.out.println("Readable: " + file.canRead());
                            System.out.println("Size:" + file.length());
                        }
                    }
                }
                """;
    }

    private static void readFile(String path) {
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static void createFile(String path) {
        File file = new File(path);
        try {
            if (file.createNewFile())
                System.out.println("File Created");
            else
                System.out.println("File Already Exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void getFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getPath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size:" + file.length());
        }
    }
}
