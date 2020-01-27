package io.qase.testngtest;

import io.qase.testng.CaseId;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    @CaseId(1)
    public void success() {
    }

    @Test
    @CaseId(2)
    public void failure() {
        throw new AssertionError();
    }
}
