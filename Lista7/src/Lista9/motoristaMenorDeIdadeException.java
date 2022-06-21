package Lista9;

public class motoristaMenorDeIdadeException extends Exception{
    public motoristaMenorDeIdadeException(){
        super("A idade cadastrada para o motorista e inferior a 18");
    }
}