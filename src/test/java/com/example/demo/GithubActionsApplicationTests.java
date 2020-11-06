package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class GithubActionsApplicationTests {

    @Test
    void TestGithubActions(){
        GithubActions githubActions = new GithubActionsImpl();
        String actual = githubActions.test("Test");
        String expected = "Test";
        assertEquals(expected, actual);

    }

}
