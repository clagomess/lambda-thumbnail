package com.github.clagomess.lambdaThumbnail;

import com.amazonaws.services.lambda.runtime.Context;
import com.github.clagomess.lambdaThumbnail.dto.ThumbRequestDto;
import com.github.clagomess.lambdaThumbnail.dto.ThumbResponseDto;
import com.github.clagomess.lambdaThumbnail.exception.LambdaThumbnailException;
import com.github.clagomess.lambdaThumbnail.service.Thumb;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class MainHandler {
    public static ThumbResponseDto run(ThumbRequestDto dto, Context context) throws IOException, LambdaThumbnailException {
        return Thumb.build(dto);
    }
}
