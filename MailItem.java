
/**
 * Permite crear objetos que son correos electronicos.
 * En estos se ve el mensaje escrito en el correo, quien lo ha escrito y a quien va dirigido.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    //Quien ha escrito el correo.
    private String from;
    //A quien se envia el correo.
    private String to;
    //El mensaje que se escribe dentro del correo.
    private String message;

    /**
     * Crear un correo inicializando sus atributos por medio de parámetros.
     */
    public MailItem(String de, String para, String m)
    {
        from = de;
        to = para;
        message = m;
    }

    /**
     * Devuelve quien ha escrito el correo.
     */
    public String getFrom()
    {
        return from;
    }
    
    /**
     * Devuelve a quien se envia el correo.
     */
    public String getTo()
    {
        return to;
    }
    
    /**
     * Devuelve el mensaje del correo.
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * Muestra por pantalla los atributos del correo.
     */
    public void print()
    {
        System.out.println ("De: " + from);
        System.out.println ("Para: " +  to);
        System.out.println ("Mensaje: " +  message);
    }
}
