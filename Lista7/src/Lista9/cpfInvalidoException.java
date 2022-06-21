package Lista9;

public class cpfInvalidoException extends Exception{
    public cpfInvalidoException(){
        super("CPF inserido não está de acordo com o formato");
    }
}
