package Ejercicio_02_sorting;

import Materia.Controllers.Stack;

public class StackSorter {

    public void sortStack(Stack stack){
        Stack temp = new Stack();

        while(!stack.isEmpty()){
            int current = stack.pop();

            while(!temp.isEmpty() && temp.peek() > current){
                stack.push(temp.pop());
            }
            temp.push(current);
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

}
