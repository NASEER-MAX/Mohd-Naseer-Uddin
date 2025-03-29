package authenticationExample.demo;

class DatabaseConnectionManager {
    // Private constructor to prevent instantiation
    private DatabaseConnectionManager() {
        System.out.println("Database Connection Manager Initialized");
    }

    // Static nested class responsible for holding the Singleton instance
    private static class ConnectionHolder {
        private static final DatabaseConnectionManager INSTANCE = new DatabaseConnectionManager();
    }

    // Public method to provide access to the instance
    public static DatabaseConnectionManager getInstance() {
        return ConnectionHolder.INSTANCE;
    }

    public void connect() {
        System.out.println("Connected to the Database");
    }
    public static void main(String[] args) {
        // Get the singleton instance
        DatabaseConnectionManager connection1 = DatabaseConnectionManager.getInstance();
        connection1.connect();

        // Another reference to the same instance
        DatabaseConnectionManager connection2 = DatabaseConnectionManager.getInstance();
        connection2.connect();

        // Both instances should be the same
        System.out.println(connection1 == connection2);  // Output: true
    }
}

