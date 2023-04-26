import java.sql.*;

public class Q37 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java";
        String user = "root";
        String password = "Clash@2215";

        String query = """
                CREATE TABLE Customer (
                  CustomerID INT NOT NULL PRIMARY KEY,
                  Email VARCHAR(100) NOT NULL UNIQUE,
                  PhoneNo VARCHAR(20) NOT NULL,
                  FName VARCHAR(50) NOT NULL,
                  LName VARCHAR(50),
                  PaymentID VARCHAR(50),
                  FoodID VARCHAR(75) NOT NULL,
                );
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table 'Customer' created successfully!");
        } catch (SQLException ex) {
            System.err.println("Error creating table: " + ex.getMessage());
        }

        String insertQuery = "INSERT INTO Customer (CustomerID, Email, PhoneNo, FName, LName, PaymentID, FoodID) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement(insertQuery)) {
            // insert 20 data entries
            statement.setInt(1, 1);
            statement.setString(2, "johndoe@example.com");
            statement.setString(3, "555-1234");
            statement.setString(4, "John");
            statement.setString(5, "Doe");
            statement.setString(6, "PMT001");
            statement.setString(7, "Pizza");
            statement.executeUpdate();

            statement.setInt(1, 2);
            statement.setString(2, "janedoe@example.com");
            statement.setString(3, "555-5678");
            statement.setString(4, "Jane");
            statement.setString(5, "Doe");
            statement.setString(6, "PMT002");
            statement.setString(7, "Burger");
            statement.executeUpdate();

            statement.setInt(1, 3);
            statement.setString(2, "bobsmith@example.com");
            statement.setString(3, "555-9876");
            statement.setString(4, "Bob");
            statement.setString(5, "Smith");
            statement.setString(6, "PMT003");
            statement.setString(7, "Sushi");
            statement.executeUpdate();

            statement.setInt(1, 4);
            statement.setString(2, "sarahjones@example.com");
            statement.setString(3, "555-5555");
            statement.setString(4, "Sarah");
            statement.setString(5, "Jones");
            statement.setString(6, "PMT004");
            statement.setString(7, "Tacos");
            statement.executeUpdate();

            statement.setInt(1, 5);
            statement.setString(2, "mikebrown@example.com");
            statement.setString(3, "555-1111");
            statement.setString(4, "Mike");
            statement.setString(5, "Brown");
            statement.setString(6, "PMT005");
            statement.setString(7, "Spaghetti");
            statement.executeUpdate();

            statement.setInt(1, 6);
            statement.setString(2, "emilywilson@example.com");
            statement.setString(3, "555-2222");
            statement.setString(4, "Emily");
            statement.setString(5, "Wilson");
            statement.setString(6, "PMT006");
            statement.setString(7, "Steak");
            statement.executeUpdate();

            statement.setInt(1, 7);
            statement.setString(2, "maxcooper@example.com");
            statement.setString(3, "555-3333");
            statement.setString(4, "Max");
            statement.setString(5, "Cooper");
            statement.setString(6, "PMT007");
            statement.setString(7, "Salad");
            statement.executeUpdate();

            statement.setInt(1, 9);
            statement.setString(2, "davidlee@example.com");
            statement.setString(3, "555-7777");
            statement.setString(4, "David");
            statement.setString(5, "Lee");
            statement.setString(6, "PMT009");
            statement.setString(7, "Sausage");
            statement.executeUpdate();

            statement.setInt(1, 10);
            statement.setString(2, "oliviaross@example.com");
            statement.setString(3, "555-8888");
            statement.setString(4, "Olivia");
            statement.setString(5, "Ross");
            statement.setString(6, "PMT010");
            statement.setString(7, "Pancakes");
            statement.executeUpdate();

            statement.setInt(1, 11);
            statement.setString(2, "peterjohnson@example.com");
            statement.setString(3, "555-9999");
            statement.setString(4, "Peter");
            statement.setString(5, "Johnson");
            statement.setString(6, "PMT011");
            statement.setString(7, "Fish and Chips");
            statement.executeUpdate();

            statement.setInt(1, 12);
            statement.setString(2, "hannahkim@example.com");
            statement.setString(3, "555-4444");
            statement.setString(4, "Hannah");
            statement.setString(5, "Kim");
            statement.setString(6, "PMT012");
            statement.setString(7, "Pad Thai");
            statement.executeUpdate();

            statement.setInt(1, 13);
            statement.setString(2, "georgebaker@example.com");
            statement.setString(3, "555-2222");
            statement.setString(4, "George");
            statement.setString(5, "Baker");
            statement.setString(6, "PMT013");
            statement.setString(7, "Wings");
            statement.executeUpdate();

            statement.setInt(1, 14);
            statement.setString(2, "samanthasmith@example.com");
            statement.setString(3, "555-1111");
            statement.setString(4, "Samantha");
            statement.setString(5, "Smith");
            statement.setString(6, "PMT014");
            statement.setString(7, "Pho");
            statement.executeUpdate();

            statement.setInt(1, 15);
            statement.setString(2, "robertjones@example.com");
            statement.setString(3, "555-3333");
            statement.setString(4, "Robert");
            statement.setString(5, "Jones");
            statement.setString(6, "PMT015");
            statement.setString(7, "Hot Dogs");
            statement.executeUpdate();

            statement.setInt(1, 16);
            statement.setString(2, "tiffanybrown@example.com");
            statement.setString(3, "555-5555");
            statement.setString(4, "Tiffany");
            statement.setString(5, "Brown");
            statement.setString(6, "PMT016");
            statement.setString(7, "Tamales");
            statement.executeUpdate();

            statement.setInt(1, 17);
            statement.setString(2, "jonathansmith@example.com");
            statement.setString(3, "555-7777");
            statement.setString(4, "Jonathan");
            statement.setString(5, "Smith");
            statement.setString(6, "PMT017");
            statement.setString(7, "Ribs");
            statement.executeUpdate();

            System.out.println("Rows inserted successfully!");
        } catch (SQLException ex) {
            System.err.println("Error inserting rows: " + ex.getMessage());
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Open a connection to the database
            conn = DriverManager.getConnection(url, user, password);

            // Execute a query to get the phone no and fname of all the customers who have ordered the food id "Pizza"
            stmt = conn.createStatement();
            String sql = "SELECT PhoneNo, FName FROM Customer WHERE foodID = 'Pizza'";
            rs = stmt.executeQuery(sql);

            // Iterate through the result set and display the phone no and fname of each customer
            while (rs.next()) {
                String phoneNo = rs.getString("PhoneNo");
                String fName = rs.getString("FName");
                System.out.println("Phone No: " + phoneNo + ", First Name: " + fName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the result set, statement, and connection
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
