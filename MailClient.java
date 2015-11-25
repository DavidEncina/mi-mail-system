
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
    public MailClient(String s, String u)
    {
        server = s;
        user = u;
    }

    /**
     * Recupera del servidor el siguiente correo que tenga el usuario y devuelva dicho objeto.     
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * Enseña por pantalla el siguiente correo.
     */
    public void printNextMailItem()
    {
        System.out.println();
    }
    
    /**
     * Envía el correo al servidor asociado a ese cliente.
     */
    public void sendMailItem(String para, String m)
    {
        to = para;
        message = m;
    }     
}
