package com.example.tddexemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public abstract class AbstractUnitTest {

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
}
