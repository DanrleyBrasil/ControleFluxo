package exceptions;

/**
 * Exceção lançada quando os parâmetros fornecidos são inválidos.
 * Esta exceção é usada para indicar que o segundo parâmetro deve ser maior que
 * o primeiro.
 */
public class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Construtor padrão para a exceção.
     */
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}
