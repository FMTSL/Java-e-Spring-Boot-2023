package med.voll.api.paciente;

import med.voll.api.endereco.EnderecoPaciente;
import med.voll.api.medico.Medico;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String cpf, String telefone, EnderecoPaciente enderecoPaciente) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEnderecoPaciente());
    }
}
