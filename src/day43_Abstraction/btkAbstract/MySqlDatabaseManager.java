package day43_Abstraction.btkAbstract;

public class MySqlDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Data called: MySql");
    }
}
