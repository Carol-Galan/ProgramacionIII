public class FakeDatabaseService extends DatabaseService{
    public FakeDatabaseService(){


    }

    @Override
    public void connect(){
        super.connect();
        System.out.println("Base de datos de prueba");
    }
}
