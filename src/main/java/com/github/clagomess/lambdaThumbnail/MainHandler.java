package com.github.clagomess.lambdaThumbnail;

import com.amazonaws.services.lambda.runtime.Context;
import com.github.clagomess.lambdaThumbnail.dto.SystemStatusDto;
import com.github.clagomess.lambdaThumbnail.dto.ThumbRequestDto;
import com.github.clagomess.lambdaThumbnail.exception.LambdaThumbnailException;
import com.github.clagomess.lambdaThumbnail.service.Thumb;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class MainHandler {
    public static Object run(ThumbRequestDto dto, Context context) throws IOException, LambdaThumbnailException {
        log.info("{}", new SystemStatusDto());

        if(dto == null || dto.isEmpty()){
            return new SystemStatusDto();
        }

        return Thumb.build(dto);
    }
}
