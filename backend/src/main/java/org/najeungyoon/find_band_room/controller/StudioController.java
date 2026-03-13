package org.najeungyoon.find_band_room.controller;

import org.najeungyoon.find_band_room.domain.Studio;
import org.najeungyoon.find_band_room.model.StudioDTO;
import org.najeungyoon.find_band_room.service.StudioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studio")
@CrossOrigin(origins = "http://localhost:5173")
public class StudioController {

    private final StudioService studioService;

    public StudioController(StudioService studioService) {
        this.studioService = studioService;
    }

    @GetMapping("/findAll")
    public List<StudioDTO> findAllStudios(){
        return studioService.allStudioLists();
    }

}
