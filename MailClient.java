
/**
 * Es el usuario de los servidores de correos.
 * Puede mandar y recibir correos. 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // El servidor de correos que va a utilizar.
    private MailServer server;
    // El usuario que va a usar el servidor de correos.
    private String user;

    /**
     * Permite crear un usuario de servidor de correos inicializando sus atributos por medio de parámetros.
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }
    
    /**
     * Muestra por pantalla cuántos correos tenemos en el servidor para nosotros.
     */
    public void numeroCorreos()
    {
        System.out.println("Hay " + server.howManyMailItems(user) + " correos en el servidor");        
    }

    /**
     * Recupera del servidor el siguiente correo que tenga el usuario y devuelva dicho objeto.
     * Si no hay devuelve null.    
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * Enseña por pantalla el siguiente correo. 
     * Si no hay te avisa de ello.
     */
    public void printNextMailItem()
    {
        MailItem correo = getNextMailItem();
        if(correo == null) {
            System.out.println("No hay correo nuevo.");
        }
        else {
            correo.print();
        }
    }
    
    /**
     * Envía el correo al servidor asociado a ese cliente.
     */
    public void sendMailItem(String to, String subject, String message)
    {
        MailItem correo = new MailItem(user, to, subject, message);
        server.post(correo);
    }     
}
