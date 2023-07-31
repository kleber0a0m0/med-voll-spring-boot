package med.voll.api.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import med.voll.api.endereco.Endereco;

@Setter
@Getter
@Table(name = "pacientes")
@Entity(name = "Paciente")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;
    @Email
    private String email;
    @NotBlank
    private String cpf;
    @NotBlank
    private String rg;
    @NotBlank
    private String telefone;

    @Embedded
    @Valid
    private Endereco endereco;

    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.rg = dados.rg();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

}
