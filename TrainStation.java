public class TrainStation
{
    private String ciudad;
    private TicketMachine maquina1;
    private TicketMachine maquina2;
    
    /**
     * Constructor de la estacion de tren
     */
    public TrainStation(String nombreCiudad, int precioMaquina1, int precioMaquina2)
    {
        ciudad = nombreCiudad;
        maquina1 = new TicketMachine(precioMaquina1);
        maquina2 = new TicketMachine(precioMaquina2);
    }
    
    /**
     * Simula la venta de un billete en la maquina 1
     */
    public void ventaBilleteMaquina1()
    {
        maquina1.insertMoney(500);
        maquina1.printTicket();
    }
    
    /**
     * Simula la venta de un billete en la maquina 2
     */
    public void ventaBilleteMaquina2()
    {
        maquina2.insertMoney(600);
        maquina2.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado por las maquinas de la estacion hasta el momento
     */
    public int totalMaquinas()
    {
        return maquina1.getTotal()+maquina2.getTotal();
    }
    
    /**
     * Devuelve el total de dinero recaudado por la maquina 1 hasta el momento
     */
    public int totalMaquina1()
    {
        return maquina1.getTotal();
    }
    
    /**
     * Imprimir por pantalla la cantidad recaudada por la maquina 1, por la maquina 2 y el total de ambas
     */
    public void printRecaudacion()
    {
        System.out.println("La maquina 1 lleva " + maquina1.getTotal() + " centimos reaudados.");
        System.out.println("La maquina 2 lleva " + maquina2.getTotal() + " centimos reaudados.");
        System.out.println("El total recaudado por ambas maquinas es de " + (maquina1.getTotal() + maquina2.getTotal()) + " centimos.");
    }
}