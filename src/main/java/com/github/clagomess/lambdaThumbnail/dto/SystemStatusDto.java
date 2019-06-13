package com.github.clagomess.lambdaThumbnail.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Calendar;

@Data
public class SystemStatusDto {
    private Timestamp aplicacaoData = new Timestamp(Calendar.getInstance().getTime().getTime());
}
