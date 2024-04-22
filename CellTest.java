import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.regex.Pattern;


public class CellTest {
    private static HashMap<Integer, Cell> cellMap;

    @BeforeAll
    public static void setup() {
        String filename = "cells_test.csv";
        cellMap = Cell.readCSV("cells.csv");
    }

    // Test that the file being read is not empty
    @Test
    public void testFileNotEmpty() throws IOException {
        String filename = "cells_test.csv";
        Assertions.assertTrue(Files.exists(Paths.get(filename)), "File should exist");
        Assertions.assertTrue(Files.size(Paths.get(filename)) > 0, "File should not be empty");
    }

}
