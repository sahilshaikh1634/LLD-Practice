package org.sahil.LLD.Design_Patterns.Singleton;

public class DatabaseBillPugh {
    private DatabaseBillPugh(){

    }


    private static final class InstanceHolder {
        // local variable of class type
        //This is Lazy Initialization instance will be initialized when required
        private static final DatabaseBillPugh instance = new DatabaseBillPugh();
    }

    //Step 2: Create a static getInstance() method for return Database object
    public static DatabaseBillPugh getInstance(){
        //Double-checked locking used in multithreading environment
        return InstanceHolder.instance;
    }
}
