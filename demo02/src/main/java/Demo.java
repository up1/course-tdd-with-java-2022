interface IDatabase {
    void create();
    void update();
    void delete();
}

interface IDatabaseForCreate {
    void create();
}

interface IDatabaseForUpdate{
    void update();
}

class Client implements IDatabaseForCreate, IDatabaseForUpdate {

    @Override
    public void create() {
        // TODO
    }

    @Override
    public void update() {

    }
}

public class Demo {
}
