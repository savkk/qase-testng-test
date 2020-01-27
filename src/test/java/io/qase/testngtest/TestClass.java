package io.qase.testngtest;

import io.qase.testng.CaseId;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

public class TestClass {
    @Test
    @CaseId(1)
    public void success() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(ThreadLocalRandom.current().nextInt(3, 10 + 1)).toMillis());
    }

    @Test
    @CaseId(2)
    public void failure() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(ThreadLocalRandom.current().nextInt(3, 10 + 1)).toMillis());
        throw new AssertionError();
    }
}
