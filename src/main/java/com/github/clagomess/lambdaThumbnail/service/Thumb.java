package com.github.clagomess.lambdaThumbnail.service;

import com.github.clagomess.lambdaThumbnail.dto.ThumbRequestDto;
import com.github.clagomess.lambdaThumbnail.dto.ThumbResponseDto;
import com.github.clagomess.lambdaThumbnail.exception.LambdaThumbnailException;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Thumb {
    public static ThumbResponseDto build(ThumbRequestDto dto) throws LambdaThumbnailException, IOException {
        if(dto.getCrop() && !dto.getWidth().equals(dto.getHeight())){
            throw new LambdaThumbnailException("Para crop, width e height tem que ser iguais!");
        }

        if(dto.getWidth() == 0 && dto.getHeight() == 0){
            throw new LambdaThumbnailException("width e height não pode ser 0");
        }

        ByteArrayInputStream inputStream = new ByteArrayInputStream(dto.getDesArquivo());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        if (dto.getCrop()) {
            Thumbnails.of(inputStream)
                    .size(dto.getWidth(), dto.getHeight())
                    .crop(Positions.CENTER)
                    .keepAspectRatio(true)
                    .outputFormat("jpg")
                    .toOutputStream(outputStream);
        } else {
            if(dto.getHeight() == 0){
                Thumbnails.of(inputStream)
                        .width(dto.getWidth())
                        .outputFormat("jpg")
                        .toOutputStream(outputStream);
            } else if (dto.getWidth() == 0) {
                Thumbnails.of(inputStream)
                        .height(dto.getHeight())
                        .outputFormat("jpg")
                        .toOutputStream(outputStream);
            } else {
                Thumbnails.of(inputStream)
                        .size(dto.getWidth(), dto.getHeight())
                        .outputFormat("jpg")
                        .toOutputStream(outputStream);
            }
        }

        final String nomArquivo = String.format("thumb_%s_%s_%s", dto.getCrop(), dto.getWidth(), dto.getHeight());

        return new ThumbResponseDto(dto.getDesHashThumb(), nomArquivo, outputStream.toByteArray());
    }
}
