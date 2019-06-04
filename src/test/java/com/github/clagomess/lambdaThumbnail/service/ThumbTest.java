package com.github.clagomess.lambdaThumbnail.service;

import com.github.clagomess.lambdaThumbnail.dto.ThumbRequestDto;
import com.github.clagomess.lambdaThumbnail.dto.ThumbResponseDto;
import com.github.clagomess.lambdaThumbnail.exception.LambdaThumbnailException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

@Slf4j
public class ThumbTest {
    @Test
    public void build() throws IOException, LambdaThumbnailException {
        URL image = Thread.currentThread().getContextClassLoader().getResource("teste.png");
        File f = new File(image.getPath());

        ThumbRequestDto dto = new ThumbRequestDto();
        dto.setCrop(true);
        dto.setWidth(100);
        dto.setHeight(100);
        dto.setDesHashPai("123");
        dto.setDesArquivo(Files.readAllBytes(f.toPath()));

        ThumbResponseDto result = Thumb.build(dto);

        log.info("{}", result);
    }
}
