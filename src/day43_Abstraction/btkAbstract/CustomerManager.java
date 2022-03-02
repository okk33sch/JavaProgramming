package day43_Abstraction.btkAbstract;

public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();

    }
}
