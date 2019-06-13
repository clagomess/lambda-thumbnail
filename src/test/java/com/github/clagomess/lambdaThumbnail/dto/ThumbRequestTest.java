package com.github.clagomess.lambdaThumbnail.dto;

import org.junit.Assert;
import org.junit.Test;

public class ThumbRequestTest {
    @Test
    public void isEmpty() {
        Assert.assertTrue(new ThumbRequestDto().isEmpty());
    }
}
