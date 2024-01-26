package DL;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataHandlerByStrings {
    private String path;
    private File file;

    public DataHandlerByStrings(String path) {
        this.path = path;
        this.file = new File(path);
    }

    private void printError(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    public ArrayList<String> read() {
        ArrayList<String> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(this.file)) {
            while (scanner.hasNextLine()) {
                result.add(scanner.nextLine());
            }
        } catch (Exception e) {
            printError(e);
        }
        return result;
    }

    public void write(String string) {
        try (FileWriter writer = new FileWriter(this.file)) {
            writer.write(string);
        } catch (IOException e) {
            printError(e);
        }
    }

    private void writeNewLine(String string) {
        try (FileWriter writer = new FileWriter(this.file, true)) {
            writer.append("\n" + string);
        } catch (IOException e) {
            printError(e);
        }
    }

    public void remove(int index) {
        try {
            ArrayList<String> rows = read();
            rows.remove(index);
            String content = String.join("\n", rows);
            write(content);
        } catch (IndexOutOfBoundsException e) {
            printError(e);
        }
    }

    public int search(String substring) {
        ArrayList<String> rows = read();
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i).contains(substring)) {
                return i;
            }
        }
        return -1;
    }
}
