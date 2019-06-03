package com.github.clagomess.lambdaThumbnail.dto;

import lombok.Data;

@Data
public class ThumbResponseDto {
    private String desHash;
    private String nomArquivo;
    private byte[] desArquivo;

    public ThumbResponseDto(String desHash, String nomArquivo, byte[] desArquivo){
        this.desHash = desHash;
        this.nomArquivo = nomArquivo;
        this.desArquivo = desArquivo;
    }
}
