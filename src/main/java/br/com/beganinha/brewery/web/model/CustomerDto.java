package br.com.beganinha.brewery.web.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    @NotNull
    private UUID id;

    @NotBlank
    @Size(min =3, max = 100) //@Min e @Max are for Numbers
    private String name;
}
