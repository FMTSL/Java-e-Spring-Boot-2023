package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EnderecoPaciente {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade ;
    private String uf;

    public EnderecoPaciente(DadosEnderecoPaciente dadosPaciente) {
        this.logradouro = dadosPaciente.logradouro();
        this.bairro = dadosPaciente.bairro();
        this.cep = dadosPaciente.cep();
        this.uf = dadosPaciente.uf();
        this.cidade = dadosPaciente.cidade();
        this.numero = dadosPaciente.numero();
        this.complemento = dadosPaciente.complemento();
    }

}
