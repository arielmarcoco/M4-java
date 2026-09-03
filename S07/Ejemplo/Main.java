package S07.Ejemplo;

public class Main {
    public static void main(String[] args) {
        Notificacion e = new NotiEmail();
        Notificacion s = new NotiSMS();
        e.enviar();
        e.enviar("--> Estimado usuario, tiene un email nuevo.");
        s.enviar();
        s.enviar("--> Estimado usuario, tienen un sms nuevo.");
    }
}
