package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{5}-\\d{3}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        @Pattern(regexp = "[A-Z]{2}")
        String uf,
        @NotBlank
        String complemento,
        @NotBlank
        String numero) {
}