// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class CalendarEventResp {

  @SerializedName("event_id")
  private String eventId;
  @SerializedName("organizer_calendar_id")
  private String organizerCalendarId;
  @SerializedName("summary")
  private String summary;
  @SerializedName("description")
  private String description;
  @SerializedName("need_notification")
  private Boolean needNotification;
  @SerializedName("start_time")
  private TimeInfo startTime;
  @SerializedName("end_time")
  private TimeInfo endTime;
  @SerializedName("vchat")
  private Vchat vchat;
  @SerializedName("visibility")
  private String visibility;
  @SerializedName("attendee_ability")
  private String attendeeAbility;
  @SerializedName("free_busy_status")
  private String freeBusyStatus;
  @SerializedName("location")
  private EventLocation location;
  @SerializedName("color")
  private Integer color;
  @SerializedName("reminders")
  private Reminder[] reminders;
  @SerializedName("recurrence")
  private String recurrence;
  @SerializedName("status")
  private String status;
  @SerializedName("is_exception")
  private Boolean isException;
  @SerializedName("recurring_event_id")
  private String recurringEventId;
  @SerializedName("schemas")
  private Schema[] schemas;

  // builder 开始
  public CalendarEventResp() {
  }

  public CalendarEventResp(Builder builder) {
    this.eventId = builder.eventId;
    this.organizerCalendarId = builder.organizerCalendarId;
    this.summary = builder.summary;
    this.description = builder.description;
    this.needNotification = builder.needNotification;
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.vchat = builder.vchat;
    this.visibility = builder.visibility;
    this.attendeeAbility = builder.attendeeAbility;
    this.freeBusyStatus = builder.freeBusyStatus;
    this.location = builder.location;
    this.color = builder.color;
    this.reminders = builder.reminders;
    this.recurrence = builder.recurrence;
    this.status = builder.status;
    this.isException = builder.isException;
    this.recurringEventId = builder.recurringEventId;
    this.schemas = builder.schemas;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEventId() {
    return this.eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getOrganizerCalendarId() {
    return this.organizerCalendarId;
  }

  public void setOrganizerCalendarId(String organizerCalendarId) {
    this.organizerCalendarId = organizerCalendarId;
  }

  public String getSummary() {
    return this.summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getNeedNotification() {
    return this.needNotification;
  }

  public void setNeedNotification(Boolean needNotification) {
    this.needNotification = needNotification;
  }

  public TimeInfo getStartTime() {
    return this.startTime;
  }

  public void setStartTime(TimeInfo startTime) {
    this.startTime = startTime;
  }

  public TimeInfo getEndTime() {
    return this.endTime;
  }

  public void setEndTime(TimeInfo endTime) {
    this.endTime = endTime;
  }

  public Vchat getVchat() {
    return this.vchat;
  }

  public void setVchat(Vchat vchat) {
    this.vchat = vchat;
  }

  public String getVisibility() {
    return this.visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public String getAttendeeAbility() {
    return this.attendeeAbility;
  }

  public void setAttendeeAbility(String attendeeAbility) {
    this.attendeeAbility = attendeeAbility;
  }

  public String getFreeBusyStatus() {
    return this.freeBusyStatus;
  }

  public void setFreeBusyStatus(String freeBusyStatus) {
    this.freeBusyStatus = freeBusyStatus;
  }

  public EventLocation getLocation() {
    return this.location;
  }

  public void setLocation(EventLocation location) {
    this.location = location;
  }

  public Integer getColor() {
    return this.color;
  }

  public void setColor(Integer color) {
    this.color = color;
  }

  public Reminder[] getReminders() {
    return this.reminders;
  }

  public void setReminders(Reminder[] reminders) {
    this.reminders = reminders;
  }

  public String getRecurrence() {
    return this.recurrence;
  }

  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Boolean getIsException() {
    return this.isException;
  }

  public void setIsException(Boolean isException) {
    this.isException = isException;
  }

  public String getRecurringEventId() {
    return this.recurringEventId;
  }

  public void setRecurringEventId(String recurringEventId) {
    this.recurringEventId = recurringEventId;
  }

  public Schema[] getSchemas() {
    return this.schemas;
  }

  public void setSchemas(Schema[] schemas) {
    this.schemas = schemas;
  }

  public static class Builder {

    private String eventId;
    private String organizerCalendarId;
    private String summary;
    private String description;
    private Boolean needNotification;
    private TimeInfo startTime;
    private TimeInfo endTime;
    private Vchat vchat;
    private String visibility;
    private String attendeeAbility;
    private String freeBusyStatus;
    private EventLocation location;
    private Integer color;
    private Reminder[] reminders;
    private String recurrence;
    private String status;
    private Boolean isException;
    private String recurringEventId;
    private Schema[] schemas;

    public Builder eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }

    public Builder organizerCalendarId(String organizerCalendarId) {
      this.organizerCalendarId = organizerCalendarId;
      return this;
    }

    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder needNotification(Boolean needNotification) {
      this.needNotification = needNotification;
      return this;
    }

    public Builder startTime(TimeInfo startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(TimeInfo endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder vchat(Vchat vchat) {
      this.vchat = vchat;
      return this;
    }

    public Builder visibility(String visibility) {
      this.visibility = visibility;
      return this;
    }

    public Builder visibility(
        com.lark.oapi.service.calendar.v4.enums.EventVisibilityEnum visibility) {
      this.visibility = visibility.getValue();
      return this;
    }

    public Builder attendeeAbility(String attendeeAbility) {
      this.attendeeAbility = attendeeAbility;
      return this;
    }

    public Builder attendeeAbility(
        com.lark.oapi.service.calendar.v4.enums.EventAttendeeAbilityEnum attendeeAbility) {
      this.attendeeAbility = attendeeAbility.getValue();
      return this;
    }

    public Builder freeBusyStatus(String freeBusyStatus) {
      this.freeBusyStatus = freeBusyStatus;
      return this;
    }

    public Builder freeBusyStatus(
        com.lark.oapi.service.calendar.v4.enums.EventFreeBusyStatusEnum freeBusyStatus) {
      this.freeBusyStatus = freeBusyStatus.getValue();
      return this;
    }

    public Builder location(EventLocation location) {
      this.location = location;
      return this;
    }

    public Builder color(Integer color) {
      this.color = color;
      return this;
    }

    public Builder reminders(Reminder[] reminders) {
      this.reminders = reminders;
      return this;
    }

    public Builder recurrence(String recurrence) {
      this.recurrence = recurrence;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public Builder status(com.lark.oapi.service.calendar.v4.enums.EventStatusEnum status) {
      this.status = status.getValue();
      return this;
    }

    public Builder isException(Boolean isException) {
      this.isException = isException;
      return this;
    }

    public Builder recurringEventId(String recurringEventId) {
      this.recurringEventId = recurringEventId;
      return this;
    }

    public Builder schemas(Schema[] schemas) {
      this.schemas = schemas;
      return this;
    }


    public CalendarEventResp build() {
      return new CalendarEventResp(this);
    }
  }
}
