package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackPersona;
import lombok.Data;

@Data
public class SlackConnected implements SlackEvent {
    private final SlackPersona slackConnectedPersona;

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CONNECTED;
    }
}
