
/**
 * Metodo que prueba la actividad 0170. * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables

    }

    /**
     * Prueba el 2º apartado 
     */
    public void test1()
    {
        MailServer gmail = new MailServer();
        MailClient cliente1 = new MailClient(gmail, "pepe@gmail.com");
        MailClient cliente2 = new MailClient(gmail, "maria@gmail.com");
        
        System.out.println("Probando que funciona el metodo getNextMailItemAndSendAutomaticRespond");
        System.out.println("##########################");
        cliente1.sendMailItem("maria@gmail.com","Hola","Hola Maria");
        cliente2.getNextMailItemAndSendAutomaticRespond();
        cliente1.printNextMailItem();
        
        System.out.println();
        System.out.println("Probando cuando no hemos mandando ningun correo");
        System.out.println("##########################");
        cliente2.getNextMailItemAndSendAutomaticRespond();
        cliente1.printNextMailItem();
    }
    
    /**
     * Prueba el 3º apartado
     */
    public void test2()
    {
		MailServer gmail = new MailServer();
		MailClient cliente1 = new MailClient(gmail, "pepe@gmail.com");
		MailClient cliente2 = new MailClient(gmail, "maria@gmail.com");
		
		System.out.println("Mostramos el ultimo email cuando NO se ha recibido aun ninguno");
		System.out.println("##########################");
		cliente2.muestraUltimoEmail();
		
		System.out.println("Mostramos el ultimo email cuando SI se ha recibido aun ninguno");
		System.out.println("##########################");		
		cliente1.sendMailItem("maria@gmail.com","Hola","Hola Maria");
		cliente2.printNextMailItem();
		cliente2.muestraUltimoEmail();
		cliente2.numeroCorreos();
		cliente2.printNextMailItem();
		cliente2.muestraUltimoEmail();
    }
    
        /**
     * Prueba el 2º apartado 
     */
    public void test1a()
    {
        MailServer gmail = new MailServer();
        MailClient cliente1 = new MailClient(gmail, "pepe@gmail.com");
        MailClient cliente2 = new MailClient(gmail, "maria@gmail.com");
        
        System.out.println("Probando que funciona el metodo getNextMailItemAndSendAutomaticRespond");
        System.out.println("##########################");
        cliente1.sendMailItem("maria@gmail.com","Hola","Hola Maria regalo");
        cliente2.getNextMailItemAndSendAutomaticRespond();
        cliente1.printNextMailItem();
        
        System.out.println();
        System.out.println("Probando cuando no hemos mandando ningun correo");
        System.out.println("##########################");
        cliente2.getNextMailItemAndSendAutomaticRespond();
        cliente1.printNextMailItem();
    }
}
