import java.sql.*;

public class ExcelDBConnection {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Register JDBC driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Open a connection
            String url = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/Anukriti new.xlsx;";
            conn = DriverManager.getConnection(url);

            // Execute a query
            stmt = conn.createStatement();
            String sql = "SELECT * FROM [Sheet1$]";
            rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                // Retrieve by column name
                String districtName = rs.getString("DISTRICT_NAME");
                String areaName = rs.getString("AREA_NAME");
                String pinCode = rs.getString("PIN_CODE");
                String nearbyPoliceStations = rs.getString("NEARBY_POLICE_STATIONS");
                String policeStationNumber = rs.getString("POLICE_STATION_NUMBER");
                String nearbyHospitals = rs.getString("NEARBY_HOSPITALS");
                String crimes = rs.getString("CRIMES");

                // Display values
                System.out.println("District Name: " + districtName);
                System.out.println("Area Name: " + areaName);
                System.out.println("Pin Code: " + pinCode);
                System.out.println("Nearby Police Stations: " + nearbyPoliceStations);
                System.out.println("Police Station Number: " + policeStationNumber);
                System.out.println("Nearby Hospitals: " + nearbyHospitals);
                System.out.println("Crimes: " + crimes);
            }
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            System.err.println("JDBC driver not found.");
        } catch (SQLException se) {
            se.printStackTrace();
            System.err.println("SQL error occurred.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("An error occurred.");
        } finally {
            try {
                // Close resources
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
