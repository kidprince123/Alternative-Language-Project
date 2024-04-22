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

    // Test each column's final transformation
    @Test
    public void testColumnsTransformation() {
        for (Cell cell : cellMap.values()) {
            // Check if displaySize is a Float
            Assertions.assertTrue(cell.getDisplaySize() == null || cell.getDisplaySize() instanceof Float, "Display size should be a Float or null");
            // Add other transformation assertions here, for example:

            // Check if launchAnnounced is an Integer and matches a year format
            if (cell.getLaunchAnnounced() != null) {
                Assertions.assertTrue(Pattern.matches("\\d{4}", cell.getLaunchAnnounced().toString()), "Launch announced should be a year");
            }
            
            // Check if bodyWeight is a Float
            Assertions.assertTrue(cell.getBodyWeight() == null || cell.getBodyWeight() instanceof Float, "Body weight should be a Float or null");
        }
    }

}
