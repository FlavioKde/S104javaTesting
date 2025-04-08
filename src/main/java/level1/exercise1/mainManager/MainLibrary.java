package level1.exercise1.mainManager;

import level1.exercise1.logic.ManagementLibrary;

public class MainLibrary {
    public static void main(String[] args) {

        ManagementLibrary managementLibrary = new ManagementLibrary();

        managementLibrary.listBook();
        managementLibrary.addBookAtPosition(3,"Pitufos");
        managementLibrary.getBookByPosition(3);
        managementLibrary.listBook();
        managementLibrary.removeBook("Pitufos");
        managementLibrary.listBook();
    }
}
