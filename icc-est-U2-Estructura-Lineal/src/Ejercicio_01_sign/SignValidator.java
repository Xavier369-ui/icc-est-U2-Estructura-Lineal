package Ejercicio_01_sign;


import Materia.Controllers.Stacks;

public class SignValidator {
    public boolean isValido(String s){
        Stacks<Character> stacks = new Stacks<>();

        for(char c: s.toCharArray()){
            if(c=='(') stacks.push(')');
            else if (c== '{') stacks.push('}');
            else if (c== '[') stacks.push(']');
            else if (stacks.isEmpty() || !stacks.pop().equals(c)) return false;

        }
        return stacks.isEmpty();
    }

}
