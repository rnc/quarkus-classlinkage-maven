package org.goots;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class MainTest
{
    @Test
    public void callTest()
    {
        new Main().call();
    }
}