package com.example.restservice.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {
    @Test
    public void sayHello(){
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("World", model);
        assertAll(
                () -> assertEquals("World", model.getAttribute("user")),
                () -> assertEquals("hello", result)
        );
    }
}
