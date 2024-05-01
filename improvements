import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {
    private static final String[] FIRST_NAMES = {"John", "Jane", "Alice", "Bob", "Michael", "Emily", "David", "Sarah"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson"};
    private static final String[] COUNTRIES = {"USA", "Canada", "UK", "Australia", "Germany", "France", "Japan", "Brazil"};
    private static final String[] PRODUCTS = {"Laptop", "Smartphone", "Tablet", "Headphones", "Speaker", "Camera", "Smartwatch", "Router"};

    public static void main(String[] args) {
        GenerateInfoFiles generateInfoFiles = new GenerateInfoFiles();

        // Generate files
        generateInfoFiles.createSalesMenFile(5, "Salesmen");
        generateInfoFiles.createProductsFile(10);
        generateInfoFiles.createSalesManInfoFile(3);
        generateInfoFiles.createSortedSalesmenFile(5, "SortedSalesmen");
    }

    public void createSalesMenFile(int randomSalesCount, String name) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name + ".txt"))) {
            Random random = new Random();

            for (int i = 0; i < randomSalesCount; i++) {
                String line = "Name: " + FIRST_NAMES[random.nextInt(FIRST_NAMES.length)] + " " + LAST_NAMES[random.nextInt(LAST_NAMES.length)] +
                        ", Country: " + COUNTRIES[random.nextInt(COUNTRIES.length)];
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
                String line = "Name: " + FIRST_NAMES[random.nextInt(FIRST_NAMES.length)] + " " + LAST_NAMES[random.nextInt(LAST_NAMES.length)] +
                        ", Sales: " + random.nextInt(100);
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Salesman info file created successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while creating salesman info file: " + e.getMessage());
        }
    }

    public void createSortedSalesmenFile(int randomSalesCount, String name) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name + ".txt"))) {
            Random random = new Random();

            // Create an array to store the sales data
            String[] salesData = new String[randomSalesCount];
            for (int i = 0; i < randomSalesCount; i++) {
                salesData[i] = "Name: " + FIRST_NAMES[random.nextInt(FIRST_NAMES.length)] + " " + LAST_NAMES[random.nextInt(LAST_NAMES.length)] +
                        ", Sales: " + random.nextInt(100);
            }

            // Sort the sales data based on sales (for simplicity, using bubble sort)
            for (int i = 0; i < randomSalesCount - 1; i++) {
                for (int j = 0; j < randomSalesCount - i - 1; j++) {
                    int sales1 = Integer.parseInt(salesData[j].split(": ")[2]);
                    int sales2 = Integer.parseInt(salesData[j + 1].split(": ")[2]);
                    if (sales1 < sales2) {
                        String temp = salesData[j];
                        salesData[j] = salesData[j + 1];
                        salesData[j + 1] = temp;
                    }
                }
            }

            // Write sorted sales data to file
            for (int i = 0; i < randomSalesCount; i++) {
                writer.write(salesData[i]);
                writer.newLine();
            }

            System.out.println("Sorted salesmen file created successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while creating sorted salesmen file: " + e.getMessage());
        }
    }
}
