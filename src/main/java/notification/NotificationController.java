package notification;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class NotificationController {

    NotificationModel notificationModel;

    @RequestMapping(value = "/", method = RequestMethod.POST, headers = {"content-type=application/json"} )
    public String process(@RequestBody NotificationModel notificationBody) {
        notificationModel = notificationBody;
        return notificationModel.getType() + " " + notificationModel.getPayload().isEmpty() + notificationModel.getPayload();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showPayload(){
        return notificationModel.getType() + " " + notificationModel.getPayload();
    }

    public String displayParams(Map<String, String> params) {
        String msg = "";
        for(Map.Entry entry : params.entrySet()) {
            msg.concat(entry.getKey() + "  " + entry.getValue() + "  ");
        }
        return msg;
    }

}
