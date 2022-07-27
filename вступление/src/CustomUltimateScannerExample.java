import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CustomUltimateScannerExample {

    public static void main(String[] args) throws IOException {
        // создание сканера
        CustomUltimateScanner scanner
                = new CustomUltimateScanner("aplusb.in", "aplusb.out");

        // пример считывания int, String, Double
        int intExample = scanner.nextInt();
        String stringExample = scanner.nextString();
        Double doubleExample = scanner.nextDouble();

        // пример вывода
        scanner.output().println(intExample);
        scanner.output().println(stringExample);
        scanner.output().println(doubleExample);

        // не забудьте закрыть, иначе в выходном файле ничего не появится
        scanner.close();
    }

}

/**
 * Утилита для ввода/вывода
 */
class CustomUltimateScanner {
    /**
     * Чтение через буффер (вспомогательный массив).
     * Более оптимально использует поток ввода
     */
    BufferedReader bufferedReader;
    /**
     * Нужен, чтобы разбить полученные данные из bufferReader
     */
    StringTokenizer inputTokenizer;
    /**
     * Вывод в файл
     */
    PrintWriter printWriter;

    /**
     * Считывание и вывод в файл
     */
    public CustomUltimateScanner(String inputFileName, String outputFileName) {
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFileName));
            printWriter = new PrintWriter(outputFileName);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Считывание и вывод в консоль
     */
    public CustomUltimateScanner() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printWriter = new PrintWriter(System.out);
    }

    public PrintWriter output(){
        return printWriter;
    }

    public void close() throws IOException {
        printWriter.close();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextString());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(nextString());
    }

    public float nextFloat() throws IOException {
        return Float.parseFloat(nextString());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(nextString());
    }


    public String nextLine() throws IOException {
        return bufferedReader.readLine();
    }

    public String nextString() throws IOException {
        while (inputTokenizer == null || !inputTokenizer.hasMoreTokens()) {
            inputTokenizer = new StringTokenizer(bufferedReader.readLine());
        }
        return inputTokenizer.nextToken();
    }
}
