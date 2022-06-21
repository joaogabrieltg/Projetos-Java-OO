package Lista5;

public class Vinganca {

    public static boolean verified(String parameter, char test) {
        int counter=0;
        if(parameter.length() > 100) {
            System.out.println("passou de 100");
            parameter = parameter.substring(0, 100);
            return true;
        }
        for (int i = 0; i < parameter.length(); i++) {
            if (((int)parameter.charAt(i)<65 || (int)parameter.charAt(i)>90 && (int) parameter.charAt(i)<97 || (int)parameter.charAt(i)> 122)) {
                System.out.println("String possui caracter inválido");
                return true;
            }
            if (parameter.charAt(i)== test) {
                counter ++;
            }
        }
        if (counter==0) {
            System.out.println("String não possui caracter buscado");
            return true;
        }
        return false;
    }

    public static int countSubstringsChar(String parameter, char test) {
        String aux = "";
        if (verified(parameter,test)) return -1;
        int counter = -1;
        parameter = parameter + test;//gambiarra mas funciona
        for (int i = 0; i < parameter.length(); i++) {
            if(parameter.charAt(i)== test) {
                counter++;
                if(!aux.equals("")) {
                    System.out.println(aux);
                    aux ="";
                }
                aux = aux+parameter.charAt(i);
            }
            else if (!aux.equals("")) {
                aux = aux + parameter.charAt(i);
                if (i + 1 == parameter.length())
                    System.out.println(aux);
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        String s= "arara";
        char c = 'a';

        System.out.println(countSubstringsChar(s,c));

    }
}