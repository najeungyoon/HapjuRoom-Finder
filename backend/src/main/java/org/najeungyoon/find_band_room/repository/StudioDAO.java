package org.najeungyoon.find_band_room.repository;

import org.apache.ibatis.annotations.Mapper;
import org.najeungyoon.find_band_room.model.StudioDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface StudioDAO {
    public List<StudioDTO> findAll();
}
