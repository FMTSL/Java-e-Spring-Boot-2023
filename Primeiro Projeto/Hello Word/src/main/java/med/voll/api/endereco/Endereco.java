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
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade ;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public Endereco(DadosEnderecoPaciente dadosPaciente) {
        this.logradouro = dadosPaciente.logradouro();
        this.bairro = dadosPaciente.bairro();
        this.cep = dadosPaciente.cep();
        this.uf = dadosPaciente.uf();
        this.cidade = dadosPaciente.cidade();
        this.numero = dadosPaciente.numero();
        this.complemento = dadosPaciente.complemento();
    }
}