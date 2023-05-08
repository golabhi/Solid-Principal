/* The principle states that the larger interfaces split into smaller ones.
Because the implementation classes use only the methods that are required.
We should not force the client to use the methods that they do not want to use. 
Interface should be such, that client should implement unnecessary function they do not need*/

interface WaiterInterface {
    void serveCustomers();

    void takeOrders();
}

interface ChefInterface {
    void cookFood();

    void decideMenu();
}

class Waiter implements WaiterInterface {
    public void serveCustomers() {
        System.out.println("Serving the customers.");
    }

    public void takeOrders() {
        System.out.println("Taking Orders.");
    }
}

class Chef implements ChefInterface {
    public void cookFood() {
        System.out.println("Cooking Food.");
    }

    public void decideMenu() {
        System.out.println("Deciding Menu.");
    }
}

class ISP {
    public static void main(String[] args) {

        Waiter w = new Waiter();
        w.serveCustomers();
        w.takeOrders();

        Chef c = new Chef();
        c.cookFood();
        c.decideMenu();
    }
}