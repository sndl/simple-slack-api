package com.ullink.slack.simpleslackapi.replies;

import com.google.gson.annotations.SerializedName;

//TODO: figure out this hierarchy
public class SlackMessageReply extends SlackReplyImpl implements ParsedSlackReply {
    private long replyTo;
    @SerializedName("ts")
    private String timestamp;

    public SlackMessageReply(boolean ok, String error, long replyTo, String timestamp) {
        super(ok, error);
        this.replyTo = replyTo;
        this.timestamp = timestamp;
    }

    public long getReplyTo() {
        return replyTo;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
