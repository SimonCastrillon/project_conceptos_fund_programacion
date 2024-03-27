import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {
    private static final String[] FIRST_NAMES = {"John", "Jane", "Alice", "Bob", "Michael", "Emily", "David", "Sarah"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson"};
    private static final String[] PRODUCTS = {"Laptop", "Smartphone", "Tablet", "Headphones", "Speaker", "Camera", "Smartwatch", "Router"};

    public static void main(String[] args) {
        GenerateInfoFiles generateInfoFiles = new GenerateInfoFiles();

        // Generate files
        generateInfoFiles.createSalesMenFile(5, "Salesmen", 1000);
        generateInfoFiles.createProductsFile(10);
        generateInfoFiles.createSalesManInfoFile(3);
    }

    public void createSalesMenFile(int randomSalesCount, String name, long id) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name + ".txt"))) {
            Random random = new Random();

            for (int i = 0; i < randomSalesCount; i++) {
                String line = "ID: " + (id + i) + ", Name: " + getRandomName() + ", Sales: " + random.nextInt(100);
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Salesmen file created successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while creating salesmen file: " + e.getMessage());
        }
    }

    public void createProductsFile(int productsCount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Products.txt"))) {
            Random random = new Random();

            for (int i = 0; i < productsCount; i++) {
                String line = "Product: " + PRODUCTS[random.nextInt(PRODUCTS.length)] + ", Price: $" + (random.nextInt(1000) + 100);
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Products file created successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while creating products file: " + e.getMessage());
        }
    }

    public void createSalesManInfoFile(int salesmanCount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SalesmanInfo.txt"))) {
            Random random = new Random();

            for (int i = 0; i < salesmanCount; i++) {
                String line = "Name: " + getRandomName() + ", ID: " + (1000 + i) + ", Sales: " + random.nextInt(100);
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Salesman info file created successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while creating salesman info file: " + e.getMessage());
        }
    }

    private String getRandomName() {
        Random random = new Random();
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        return firstName + " " + lastName;
    }
}

