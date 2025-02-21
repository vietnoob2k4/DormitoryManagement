package com.example.DorminatoryManagement.entity;

import com.example.DorminatoryManagement.utils.enumClass.RoomStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.security.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 50)
    private String roomName;

    @Column(nullable = false, length = 50)
    private String department;

    @Column(nullable = false)
    private Integer maximumOccupancy;

    @Column(nullable = false)
    private Integer currentOccupancy;

    @Column(nullable = false, length = 50)
    private String roomType;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal roomPrice;

    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;

    private String notes;

    @Column(nullable = false)
    private Timestamp createdAt;

    @Column(nullable = false)
    private Timestamp updatedAt;
}
