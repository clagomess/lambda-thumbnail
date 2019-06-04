package com.github.clagomess.lambdaThumbnail.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.clagomess.lambdaThumbnail.util.FormatUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ThumbRequestDto {
    private Boolean crop;
    private Integer width;
    private Integer height;
    private String desHashPai;
    private byte[] desArquivo;

    @JsonProperty(value = "desHashThumb")
    public String getDesHashThumb(){
        return FormatUtil.formatMd5(String.format("%s%s%s%s", crop, width, height, desHashPai));
    }
}
