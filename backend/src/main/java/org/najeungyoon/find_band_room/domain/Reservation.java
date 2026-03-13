package org.najeungyoon.find_band_room.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id") // 외래키(FK) 컬럼명 지정
    private Room room;


    @Column(nullable = false)
    private LocalDate date; // 예약 날짜 (예: 2026-03-14)

    @Column(nullable = false)
    private LocalTime time; // 예약 시간 (예: 14:00)

    @Column(nullable = false)
    private boolean isAvailable; // 예약 가능 여부 (True: 빈자리, False: 꽉참)



}
