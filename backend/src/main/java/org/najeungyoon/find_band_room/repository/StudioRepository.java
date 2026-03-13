package org.najeungyoon.find_band_room.repository;

import org.najeungyoon.find_band_room.domain.Studio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudioRepository extends JpaRepository<Studio,Long> {
}
