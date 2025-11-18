
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<DatabaseService> databaseServices = new ArrayList<>();
        MySQLDatabaseService mySQL = new MySQLDatabaseService();
        SQLiteDatabaseService sqlite = new SQLiteDatabaseService();
        FakeDatabaseService fake = new FakeDatabaseService();

        databaseServices.add(mySQL);
        databaseServices.add(sqlite);
        databaseServices.add(fake);

        for(DatabaseService databaseServices : databaseServices){

        }
    }
}
