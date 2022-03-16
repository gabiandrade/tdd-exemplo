package com.example.tddexemplo.repository;

import com.example.tddexemplo.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, String> {

    Reserva findByReservaNome(String nome);
}
