package com.example.mp3_TheCursedCoin.mp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JackSparrowTest {
    @Autowired
    private JackSparrow jackSparrow;


    @org.junit.jupiter.api.Test
    void findCursedCoin() {

        assertEquals("coin",jackSparrow.findCursedCoin());


    }
}