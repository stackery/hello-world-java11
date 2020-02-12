import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.net.URISyntaxException;

public class Handler {
    public Map handler(Map message) throws IOException, URISyntaxException {
        System.out.println(message);
        String responseBody = new String(Files.readAllBytes(Paths.get(getClass().getResource("welcome.html").toURI())));

        HashMap response = new HashMap();
        HashMap headers = new HashMap();

        response.put("statusCode", "200");
        headers.put("Content-Type", "text/html");
        response.put("headers", headers);
        response.put("body", responseBody);
        return response;
    }
}
