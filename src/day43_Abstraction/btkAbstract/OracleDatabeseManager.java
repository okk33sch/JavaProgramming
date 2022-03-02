package day43_Abstraction.btkAbstract;

public class OracleDatabeseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Data called: Oracle");
    }
}
