package com.github.clagomess.lambdaThumbnail.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Calendar;

@Data
public class SystemStatusDto {
    private String deployTag = getClass().getPackage().getImplementationVersion();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss z", timezone = "America/Sao_Paulo")
    private Timestamp aplicacaoData = new Timestamp(Calendar.getInstance().getTime().getTime());
}
