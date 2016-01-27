import com.fasterxml.jackson.databind.ObjectMapper;
import notification.NotificationModel;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by tomcat on 1/27/16.
 */
public class NotificationTest {
    @Test
    public void testJsonToObject() throws IOException {

        String json = "{\"type\":\"type\"," +
                "\"payload\":" +
                "{\"key\":\"value\", " +
                "\"key2\":\"value2\"," +
                "\"result\":" +
                    "{\"code\":\"code\"," +
                    "\"description\":\"desc\"}" +
                "}" +
                "}";

        ObjectMapper mapper = new ObjectMapper();

        NotificationModel value = mapper.readValue(json, NotificationModel.class);
        System.out.println(value);
    }
}

