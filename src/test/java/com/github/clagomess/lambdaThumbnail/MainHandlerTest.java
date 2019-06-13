package com.github.clagomess.lambdaThumbnail;

import com.github.clagomess.lambdaThumbnail.exception.LambdaThumbnailException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class MainHandlerTest {
    @Test
    public void runString() throws IOException, LambdaThumbnailException {
        log.info("{}", MainHandler.run(null, null));
    }
}
