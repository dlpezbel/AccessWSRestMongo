package dao;

// Abstract class DAO Factory
public abstract class DAOFactory {

    // List of DAO types supported by the factory
    public static final int MONGODB = 1;
    public static final int ORACLE = 2;
    public static final int MYSQL = 3;

/*    // There will be a method for each DAO that can be
    // created. The concrete factories will have to
    // implement these methods.
    public abstract CustomerDAO getCustomerDAO();
    public abstract AccountDAO getAccountDAO();
    public abstract OrderDAO getOrderDAO();*/

    public static DAOFactory getDAOFactory(
            int whichFactory) {

        switch (whichFactory) {
            case MONGODB:
                return new MongoDAOFactory();
            default           :
                return null;
        }
    }
}
