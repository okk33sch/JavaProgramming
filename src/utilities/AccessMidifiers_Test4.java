package utilities;

import day40_Final_Keyword.ProtectedAccesModifier;

public class AccessMidifiers_Test4 extends ProtectedAccesModifier {

    public static void main(String[] args) {

        //System.out.println(AccessMidifiers_Test4.name1); // default is not visible outside the package
        System.out.println(AccessMidifiers_Test4.name2); // protected is visible outside the package in subclass ONLY

        // AccessMidifiers_Test4.method1();
        AccessMidifiers_Test4.method2();



    }
}
