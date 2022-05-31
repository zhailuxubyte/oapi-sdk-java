// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class Callout {
    @SerializedName("background_color")
    private Integer backgroundColor;
    @SerializedName("border_color")
    private Integer borderColor;
    @SerializedName("text_color")
    private Integer textColor;
    @SerializedName("emoji_id")
    private String emojiId;

    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Integer getBorderColor() {
        return this.borderColor;
    }

    public void setBorderColor(Integer borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getTextColor() {
        return this.textColor;
    }

    public void setTextColor(Integer textColor) {
        this.textColor = textColor;
    }

    public String getEmojiId() {
        return this.emojiId;
    }

    public void setEmojiId(String emojiId) {
        this.emojiId = emojiId;
    }

}
