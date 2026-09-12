package com.healtrack.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class StudentDto {
    private UUID id;
    private String name;
    private String email;
}
