package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackUser;
import lombok.Data;

@Data
public class SlackChannelArchived implements SlackEvent {
    private final SlackChannel slackChannel;
    private final SlackUser slackuser;

    public SlackUser getUser() {
        return slackuser;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CHANNEL_ARCHIVED;
    }

}
