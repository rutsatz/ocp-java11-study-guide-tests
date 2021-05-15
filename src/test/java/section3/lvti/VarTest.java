package section3.lvti;

public class VarTest {

    public static void main(String[] args) {
        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("Testing");
        System.out.println(aClassWithAVeryLongName);

        // Adding some other var declarations:
        // i is inferred to be an int, since it's assigned a literal int
        var i = 1;

        // An array can be assigned to an LVTI variable
        var aVarArray = new int[3];

        // Valid to assign a method return value to an LVTI variable
        var methodVal = aClassWithAVeryLongName.getName();

        // OK to assign a null object to LVTI variable but not literal null
        Object nullObject = null;
        // Posso atribuir um objeto que está null, mas não posso atribuir o literal null.
        var var = nullObject;

        // Invalid var declarations:

//        // cannot use var declaration in a compound statement
//        var j = 0, k = 0;
//
//        // again, cannot use var declaration in a compound statement
//        var m, n = 0;
//
//        // Cannot declare a var variable without also initializing it
//        var someObject;
//
//        // Cannot assign null to var variable, type cannot be inferred
//        var newvar = null;
//
//        // Cannot use array initializer in var declaration/initialization
        // Acredito que não seja permitido por estar usando um literal, e não especificar o tipo array;
//        var myArray = {"A", "B"};

        // Se você especificar o tipo do array, ai é válido.
        var myArray2 = new String[] {"A", "B"}; // full array initializer is allowed

//        // Cannot have an array of var
//        var[]newarray = new int[2];
    }

}
