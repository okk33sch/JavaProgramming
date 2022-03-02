package utilities;


import day34_GarbageCollection_AccessModifiers.AccesModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccesModifiers.publicData);
        //System.out.println(AccesModifiers.defaultData); // default Access Modifier is not visible outside the package
        //System.out.println(AccesModifiers.privateData); // private access modifier is not visible outside class

        AccesModifiers.method1();
        //AccesModifiers.method2();
        //AccesModifiers.method3();




    }
}
