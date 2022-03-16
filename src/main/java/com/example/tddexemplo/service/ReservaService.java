package com.example.tddexemplo.service;

import com.example.tddexemplo.model.Reserva;
import com.example.tddexemplo.repository.ReservaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Period;

@AllArgsConstructor
@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public int calcularDiasReserva(String nome) {
        Reserva reserva = reservaRepository.findByReservaNome(nome);
        return Period.between(reserva.getCheckIn(), reserva.getCheckOut()).getDays();
    }
}
