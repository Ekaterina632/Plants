package com.service.plants;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class PlantsController {
    @GetMapping("/getById")
    public Plant getById(@RequestBody GetByIdRequest request) {
        var rose = new Plant();
        rose.Id = request.Id;
        rose.Name = "Red rose";
        rose.Captions = new ArrayList<String>();
        rose.Captions.add("caption1");
        rose.Captions.add("caption2");
        return rose;
    }
}
