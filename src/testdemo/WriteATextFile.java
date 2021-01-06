////import java.io.File;
////import java.io.FileReader;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class WriteATextFile {
//    public static void main(String[] args) {
//
//        try {
//            FileWriter writer = new FileWriter("source.txt");
//            writer.write("Hi you");
//            writer.write("\nwhat's your name ?");
//            writer.close();
//            FileWriter writer1 = new FileWriter("destination.txt");
//            writer1.write("howw");
//            writer1.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}

//    public static void main(String[] args) throws IOException {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the file source: ");
//        String srcPath = scanner.nextLine();
//        System.out.print("Enter the file destination: ");
//        String desPath = scanner.nextLine();
//        Main.copyTextFile(srcPath, desPath);
//    }
