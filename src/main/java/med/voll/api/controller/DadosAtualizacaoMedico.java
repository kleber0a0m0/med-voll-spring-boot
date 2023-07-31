package med.voll.api.controller;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.medico.Especialidade;

public record DadosAtualizacaoMedico(
        @NotNull Long id,
        String nome,
        String email,
        String telefone,
        DadosEndereco endereco){
}
