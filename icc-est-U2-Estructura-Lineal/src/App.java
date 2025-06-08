import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        SignValidator vali = new SignValidator();
        System.out.println(vali.isValido("([]){}"));
        System.out.println(vali.isValido("({)}"));
        System.out.println(vali.isValido(""));
        System.out.println(vali.isValido("{[()]}"));

        System.out.println("-----------------------------------");

        Stack stack = new Stack();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Antes de ordenar");
        stack.printSrack();
        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);

        System.out.println("Ordenado");
        stack.printSrack();

    }
}
