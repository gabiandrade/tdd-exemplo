package com.example.tddexemplo.model;

import com.example.tddexemplo.AbstractUnitTest;
import com.example.tddexemplo.repository.ReservaRepository;
import com.example.tddexemplo.service.ReservaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDate;

class ReservaTest extends AbstractUnitTest {

    @InjectMocks
    ReservaService reservaService;

    @Mock
    ReservaRepository reservaRepository;

    @BeforeEach
    void setUp() {

        Mockito.when(reservaRepository.findByReservaNome(createReservaModel().getReservaNome()))
                .thenReturn(createReservaModel());
    }


    @Test
    void deveCalcularDiasReserva() {
        String nome = "Gabriela";
        int dias = reservaService.calcularDiasReserva(nome);
        Assertions.assertEquals(dias, 10);
    }


    static Reserva createReservaModel() {
        return Reserva.builder().reservaNome("Gabriela")
                .checkIn(LocalDate.parse("2022-03-14"))
                .checkOut(LocalDate.parse("2022-03-24")).build();
    }

}