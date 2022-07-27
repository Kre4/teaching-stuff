import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class DefaultScannerExample {
    public static void main(String[] args) throws IOException {
        // файловый ввод
        Scanner inputScanner = new Scanner(new FileReader("aplusb.in"));
        // файловый вывод
        PrintStream printStream = new PrintStream(new File("aplusb.out"));

        // пример чтения из файла
        int intExample = inputScanner.nextInt();
        String stringExample = inputScanner.next();
        double doubleExample = inputScanner.nextDouble();

        // пример вывода в файл
        printStream.println(intExample);
        printStream.println(stringExample);
        printStream.println(doubleExample);

        // не забудьте закрыть, иначе в выходном файле ничего не появится
        printStream.close();
        inputScanner.close();
    }
}
