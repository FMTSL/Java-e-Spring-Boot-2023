package med.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;
import med.voll.api.endereco.EnderecoPaciente;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private int cpf;
    @Embedded
    private EnderecoPaciente enderecoPaciente;

    public Paciente(DadosCadastroPaciente dadosPaciente) {
        this.nome = dadosPaciente.nome();
        this.email = dadosPaciente.email();
        this.cpf = dadosPaciente.cpf();
        this.enderecoPaciente = new EnderecoPaciente(dadosPaciente.enderecoPaciente());
    }
}