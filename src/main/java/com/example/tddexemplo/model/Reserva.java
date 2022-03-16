package com.example.tddexemplo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
@Builder
public class Reserva {

    private String reservaNome;
    private LocalDate checkIn;
    private LocalDate checkOut;
}
