package org.najeungyoon.find_band_room.service;


import org.najeungyoon.find_band_room.model.StudioDTO;
import org.najeungyoon.find_band_room.repository.StudioDAO;
import org.najeungyoon.find_band_room.repository.StudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioService {

    // mybatis를 이용한 복잡한 쿼리때 쓸 DAO
    private final StudioDAO studioDAO;
    // JPA를 사용하기 위한 인터페이스: 간단한 쿼리때 사용할거임
    private final StudioRepository studioRepository;

    // 생성자
    public StudioService(StudioDAO studioDAO, StudioRepository studioRepository) {
        this.studioDAO = studioDAO;
        this.studioRepository = studioRepository;
    }


    // 모든 합주실 리스트 출력
    public List<StudioDTO> allStudioLists(){

        List<StudioDTO> studioList = studioRepository.findAll().stream().map(studio -> {
            StudioDTO studioDTO = new StudioDTO();
            studioDTO.setId(studio.getId());
            studioDTO.setName(studio.getName());
            studioDTO.setPlace_key(studio.getPlace_key());
            return studioDTO;
        }).toList();

        return studioList;
    }
}
