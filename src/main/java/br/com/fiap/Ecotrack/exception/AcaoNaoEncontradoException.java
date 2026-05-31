package br.com.fiap.Ecotrack.exception;

public class AcaoNaoEncontradoException extends RuntimeException {

    public AcaoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
