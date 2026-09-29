package com.aziz.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testMessage() {
        assertEquals(
            "Hello World from DevOps Lab!",
            HelloWorld.message()
        );
    }
}