package med.voll.api.infra.exception;

import jakarta.persistence.EntityNotFoundException;
import med.voll.api.domain.ValidacaoException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//Anotação específica para tratar erros na API
public class TratadorDeErros {

    @ExceptionHandler(EntityNotFoundException.class)//Serve para informar quando a exceção deve ser chamado
    public ResponseEntity tratarErro404(){

        return ResponseEntity.notFound().build();//Retorna erro 404 not found
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException ex){

        var erros = ex.getFieldErrors();

        return ResponseEntity.badRequest().body(erros.stream().map(DadosErroValidacao::new).toList());//Retorna erro 400
    }

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity tratarErroRegradeNegocio(ValidacaoException ex){

        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    private record DadosErroValidacao(String campo, String mensagem){

        public DadosErroValidacao(FieldError erro){
            this(erro.getField(), erro.getDefaultMessage());
        }
    }
}
