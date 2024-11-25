package com.service.plants;

import org.springframework.stereotype.Service;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public Plant getPlantById(int id) {
        return plantRepository.findById(id);  // Call the repository to fetch the plant by ID
    }

    public int createPlant(String name) {
        return plantRepository.savePlant(name);
    }

}
