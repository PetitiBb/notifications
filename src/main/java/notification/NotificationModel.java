package notification;


import java.util.Map;

public class NotificationModel {
    String type;
    Map<String, Object> payload;


    public Map<String, Object> getPayload() {
        return payload;
    }

    public NotificationModel() {}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Action{");
        sb.append("type='").append(type).append('\'');
        sb.append(", payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }

    public void setPayload(Map<String, Object> payload) {
        this.payload = payload;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    }
