package io.qase.testngtest;

import io.qase.testng.CaseId;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    @CaseId(58)
    public void success() {
    }

    @Test
    @CaseId(59)
    public void failure() {
        throw new AssertionError();
    }
}
