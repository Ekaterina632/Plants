package com.service.plants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    @Autowired
    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public Plant getPlantById(int id) {
        return plantRepository.findById(id);  // Call the repository to fetch the plant by ID
    }

    public int createPlant(String name) {
        try {
            return plantRepository.savePlant(name);
        } catch (FailedToConnectToDatabaseException e) {
            System.err.println("Database connection failed: " + e.getMessage());
            throw new RuntimeException("Database connection failed. Please try again later.", e);
        } catch (ItemAlreadyExistsException e) {
            System.err.println("Item already exists: " + e.getMessage());
            throw new RuntimeException("A plant with the same name already exists.", e);
        } catch (ItemIsInvalidException e) {
            System.err.println("Invalid plant name: " + e.getMessage());
            throw new RuntimeException("The plant name is invalid.", e);
        }
    }

}
