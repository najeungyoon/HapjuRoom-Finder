package org.najeungyoon.find_band_room.service;


import org.najeungyoon.find_band_room.model.StudioDTO;
import org.najeungyoon.find_band_room.repository.StudioDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioService {

    private final StudioDAO studioDAO;

    public StudioService(StudioDAO studioDAO) {
        this.studioDAO = studioDAO;
    }

    public List<StudioDTO> allStudioLists(){
        return studioDAO.findAll();
    }
}
