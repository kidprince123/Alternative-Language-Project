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

    // Test for missing or "-" data replacement with a null value
    @Test
    public void testMissingDataReplacement() {
        for (Cell cell : cellMap.values()) {
            // Check if any of the String fields contain "-"
            Assertions.assertNotEquals("-", cell.getOem(), "OEM should not contain '-'");
            Assertions.assertNotEquals("-", cell.getModel(), "Model should not contain '-'");
            Assertions.assertNotEquals("-", cell.getLaunchAnnounced(), "LaunchAnnounced should not contain '-'");
            Assertions.assertNotEquals("-", cell.getLaunchStatus(), "LaunchStatus should not contain '-'");
            Assertions.assertNotEquals("-", cell.getBodyDimensions(), "BoydDimensions should not contain '-'");
            Assertions.assertNotEquals("-", cell.getBodyWeight(), "BodyWeight should not contain '-'");
            Assertions.assertNotEquals("-", cell.getBodySim(), "BodySim should not contain '-'");
            Assertions.assertNotEquals("-", cell.getDisplayType(), "DisplayType should not contain '-'");
            Assertions.assertNotEquals("-", cell.getDisplaySize(), "DisplaySize should not contain '-'");
            Assertions.assertNotEquals("-", cell.getDisplayResolution(), "DisplayResolution should not contain '-'");
            Assertions.assertNotEquals("-", cell.getFeaturesSensors(), "FeatureSensors should not contain '-'");
            Assertions.assertNotEquals("-", cell.getPlatformOs(), "PlatformOs should not contain '-'");
            

            // Check if fields are null when they should be
            Assertions.assertNotNull(cell.getOem(), "OEM should not be null");
            Assertions.assertNotNull(cell.getModel(), "Model should not be null");
            Assertions.assertNotNull(cell.getLaunchAnnounced(), "Launch announced should not be null");
            Assertions.assertNotNull(cell.getLaunchStatus(), "Launch status should not be null");
            Assertions.assertNotNull(cell.getBodyDimensions(), "Body dimensions should not be null");
            Assertions.assertNotNull(cell.getBodyWeight(), "Body weight should not be null");
            Assertions.assertNotNull(cell.getBodySim(), "Body sim should not be null");
            Assertions.assertNotNull(cell.getDisplayType(), "Display type should not be null");
            Assertions.assertNotNull(cell.getDisplayResolution(), "Display resolution should not be null");
            Assertions.assertNotNull(cell.getFeaturesSensors(), "Display Features Sensors should not be null");
            Assertions.assertNotNull(cell.getPlatformOs(), "PlatformOs Features Sensors should not be null");
        

            // Check if numerical fields are correctly parsed or null
            if (cell.getLaunchAnnounced() != null) {
                Assertions.assertTrue(cell.getLaunchAnnounced() >= 0, "Launch announced should be non-negative or null");
            }
            if (cell.getBodyWeight() != null) {
                Assertions.assertTrue(cell.getBodyWeight() >= 0, "Body weight should be non-negative or null");
            }
            if (cell.getDisplaySize() != null) {
                Assertions.assertTrue(cell.getDisplaySize() >= 0, "Display size should be non-negative or null");
            }
        }
    }

}
