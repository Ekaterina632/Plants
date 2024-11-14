package com.service.plants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController // default return data in JSON
@RequestMapping("/api") // initial path for the methods inside this controller
public class PlantsController {

    public PlantService plantService;

    public PlantsController() {
        PlantRepository plantRepository = new PlantRepository();  // Make sure this is properly implemented
        // Pass the plantRepository to the PlantService constructor
        this.plantService = new PlantService(plantRepository);
    }

    @GetMapping("/getById") // to handle GET requests (should it be POST here because we use body?)
    public Plant getById(@RequestBody GetByIdRequest request) { // GetByIdRequest class describes the body structure
        return plantService.getPlantById(request.Id); // use plantService to get Plant object using getPlantById method
    }

}

// To handle HTTP requests and return data in JSON format

