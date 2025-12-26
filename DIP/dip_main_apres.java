package ict301.solid.dip;

public class MainDIP {
    public static void main(String[] args) {
        Database database;

        // Utilisation de MySQL
        database = new MySQLDatabaseDIP();
        OrderProcessorDIP order = new OrderProcessorDIP(database);
        order.processOrder("'Données à sauvegarder'");

        // Utilisation de MongoDB
        database = new MongoDBDatabase();
        OrderProcessorDIP order1 = new OrderProcessorDIP(database);
        order1.processOrder("'Données à sauvegarder'");
    }
}
