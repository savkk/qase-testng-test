package io.qase.testngtest;

import io.qase.testng.CaseId;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class TestClass {
    @Test
    @CaseId(1)
    public void success() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(new Random().nextInt(10)).toMillis());
    }

    @Test
    @CaseId(2)
    public void failure() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(new Random().nextInt(10)).toMillis());
        throw new AssertionError();
    }
}
