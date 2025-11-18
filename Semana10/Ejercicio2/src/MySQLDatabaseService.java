public class MySQLDatabaseService extends DatabaseService{
    public MySQLDatabaseService(){


    }

    @Override
    public void connect(){
        super.connect();
        System.out.println("Base de datos de tipo MySQL");
    }
}
