package com.example.library.author;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//special mvc
@SpringBootTest
@AutoConfigureMockMvc //make a call for http configuration
public class ControllerMockTest {
    @Autowired
    private MockMvc mockMvc; //to test the controller layer
    @MockitoBean
    private AuthorService authorService;

    @Test
    void addNewAuthor() throws Exception {
        Author saveAuthor = new Author(1, "Ak", "Tn");
        Mockito.when(authorService.addNewAuthor(new Author(1, "Ak", "TN"))).thenReturn(saveAuthor);
        mockMvc.perform(post("/athor/author"))
                .andExpect(status().isOk());
    }
}

