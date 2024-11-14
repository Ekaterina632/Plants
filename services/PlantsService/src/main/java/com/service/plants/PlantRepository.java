package com.service.plants;

import org.springframework.stereotype.Repository;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public class PlantRepository {
    private final String url = "jdbc:sqlserver://172.17.0.1:1433;databaseName=Plants;encrypt=false;trustServerCertificate=true";
    private final String user = "sa";
    private final String SqlPasswordEnvVariable = "SqlPassword";
    private String password;

    public PlantRepository() {
        password = System.getenv(SqlPasswordEnvVariable);
    }

    public Plant findById(int id) {
        String sql = "SELECT PlantID, PlantName FROM Plants WHERE PlantID = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);  // Set the ID parameter in the query
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Plant plant = new Plant();
                plant.Id = resultSet.getInt("PlantID");
                plant.Name = resultSet.getString("PlantName");
                return plant;  // Return the plant with ID and Name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Return null if no plant found with the given ID
    }
}
