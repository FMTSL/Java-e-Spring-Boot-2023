package med.voll.api.paciente;

import med.voll.api.endereco.DadosEnderecoPaciente;

public record DadosCadastroPaciente(String nome, String email, int cpf, DadosEnderecoPaciente enderecoPaciente ) {
}
