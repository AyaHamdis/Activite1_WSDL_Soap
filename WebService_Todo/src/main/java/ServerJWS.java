import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new ws.BanqueService());
        System.out.println("Web service déployé sur http://0.0.0.0:9191/");
    }
}
