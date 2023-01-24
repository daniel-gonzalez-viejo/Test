package daw.programacion.banco;

public class ClaseBanco {
    private String id = "123";
    private String name = "Sarandon Branderson";
    private int balance = 0;

    public ClaseBanco(String id, String name){};
    public ClaseBanco(String id, String name, int balance){}
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credito(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se ha podido conceder el crédito");
            return balance;
        }
        else {
            return cantidad + balance;
        }
    }

    public int debito(int cantidad) {
        if (cantidad <= balance) {
            balance = balance - cantidad;
        }
        else {
            System.out.println("No hay dinero suficiente para sacar");
        }
        return balance;
    }

    public int transferencia(int cantidadTransferir, int otraCuenta) {
        if (cantidadTransferir <= balance) {
            balance = balance - cantidadTransferir;
            otraCuenta += cantidadTransferir;
        }
        else {
            System.out.println("No hay dinero suficiente para transferir");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "ClaseBanco [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

    

        
    


    

}
