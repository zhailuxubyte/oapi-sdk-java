// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.helpdesk.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.helpdesk.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;
public class Ticket {
    @SerializedName("ticket_id")
    private String ticketId;
    @SerializedName("helpdesk_id")
    private String helpdeskId;
    @SerializedName("guest")
    private TicketUser guest;
    @SerializedName("comments")
    private Comments comments;
    @SerializedName("ticket_type")
    private Integer ticketType;
    @SerializedName("status")
    private Integer status;
    @SerializedName("score")
    private Integer score;
    @SerializedName("created_at")
    private Integer createdAt;
    @SerializedName("updated_at")
    private Integer updatedAt;
    @SerializedName("closed_at")
    private Integer closedAt;
    @SerializedName("dissatisfaction_reason")
    private String[] dissatisfactionReason;
    @SerializedName("agents")
    private TicketUser[] agents;
    @SerializedName("channel")
    private Integer channel;
    @SerializedName("solve")
    private Integer solve;
    @SerializedName("closed_by")
    private TicketUser closedBy;
    @SerializedName("collaborators")
    private TicketUser[] collaborators;
    @SerializedName("customized_fields")
    private CustomizedFieldDisplayItem[] customizedFields;
    @SerializedName("agent_service_duration")
    private Double agentServiceDuration;
    @SerializedName("agent_first_response_duration")
    private Integer agentFirstResponseDuration;
    @SerializedName("bot_service_duration")
    private Integer botServiceDuration;
    @SerializedName("agent_resolution_time")
    private Integer agentResolutionTime;
    @SerializedName("actual_processing_time")
    private Integer actualProcessingTime;
    @SerializedName("agent_entry_time")
    private Integer agentEntryTime;
    @SerializedName("agent_first_response_time")
    private Integer agentFirstResponseTime;
    @SerializedName("agent_last_response_time")
    private Integer agentLastResponseTime;
    @SerializedName("agent_owner")
    private TicketUser agentOwner;
    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getHelpdeskId() {
        return this.helpdeskId;
    }

    public void setHelpdeskId(String helpdeskId) {
        this.helpdeskId = helpdeskId;
    }

    public TicketUser getGuest() {
        return this.guest;
    }

    public void setGuest(TicketUser guest) {
        this.guest = guest;
    }

    public Comments getComments() {
        return this.comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Integer getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getClosedAt() {
        return this.closedAt;
    }

    public void setClosedAt(Integer closedAt) {
        this.closedAt = closedAt;
    }

    public String[] getDissatisfactionReason() {
        return this.dissatisfactionReason;
    }

    public void setDissatisfactionReason(String[] dissatisfactionReason) {
        this.dissatisfactionReason = dissatisfactionReason;
    }

    public TicketUser[] getAgents() {
        return this.agents;
    }

    public void setAgents(TicketUser[] agents) {
        this.agents = agents;
    }

    public Integer getChannel() {
        return this.channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getSolve() {
        return this.solve;
    }

    public void setSolve(Integer solve) {
        this.solve = solve;
    }

    public TicketUser getClosedBy() {
        return this.closedBy;
    }

    public void setClosedBy(TicketUser closedBy) {
        this.closedBy = closedBy;
    }

    public TicketUser[] getCollaborators() {
        return this.collaborators;
    }

    public void setCollaborators(TicketUser[] collaborators) {
        this.collaborators = collaborators;
    }

    public CustomizedFieldDisplayItem[] getCustomizedFields() {
        return this.customizedFields;
    }

    public void setCustomizedFields(CustomizedFieldDisplayItem[] customizedFields) {
        this.customizedFields = customizedFields;
    }

    public Double getAgentServiceDuration() {
        return this.agentServiceDuration;
    }

    public void setAgentServiceDuration(Double agentServiceDuration) {
        this.agentServiceDuration = agentServiceDuration;
    }

    public Integer getAgentFirstResponseDuration() {
        return this.agentFirstResponseDuration;
    }

    public void setAgentFirstResponseDuration(Integer agentFirstResponseDuration) {
        this.agentFirstResponseDuration = agentFirstResponseDuration;
    }

    public Integer getBotServiceDuration() {
        return this.botServiceDuration;
    }

    public void setBotServiceDuration(Integer botServiceDuration) {
        this.botServiceDuration = botServiceDuration;
    }

    public Integer getAgentResolutionTime() {
        return this.agentResolutionTime;
    }

    public void setAgentResolutionTime(Integer agentResolutionTime) {
        this.agentResolutionTime = agentResolutionTime;
    }

    public Integer getActualProcessingTime() {
        return this.actualProcessingTime;
    }

    public void setActualProcessingTime(Integer actualProcessingTime) {
        this.actualProcessingTime = actualProcessingTime;
    }

    public Integer getAgentEntryTime() {
        return this.agentEntryTime;
    }

    public void setAgentEntryTime(Integer agentEntryTime) {
        this.agentEntryTime = agentEntryTime;
    }

    public Integer getAgentFirstResponseTime() {
        return this.agentFirstResponseTime;
    }

    public void setAgentFirstResponseTime(Integer agentFirstResponseTime) {
        this.agentFirstResponseTime = agentFirstResponseTime;
    }

    public Integer getAgentLastResponseTime() {
        return this.agentLastResponseTime;
    }

    public void setAgentLastResponseTime(Integer agentLastResponseTime) {
        this.agentLastResponseTime = agentLastResponseTime;
    }

    public TicketUser getAgentOwner() {
        return this.agentOwner;
    }

    public void setAgentOwner(TicketUser agentOwner) {
        this.agentOwner = agentOwner;
    }


// builder 开始
  public Ticket(){}

  public Ticket(Builder builder){
      this.ticketId = builder.ticketId;
      this.helpdeskId = builder.helpdeskId;
      this.guest = builder.guest;
      this.comments = builder.comments;
      this.ticketType = builder.ticketType;
      this.status = builder.status;
      this.score = builder.score;
      this.createdAt = builder.createdAt;
      this.updatedAt = builder.updatedAt;
      this.closedAt = builder.closedAt;
      this.dissatisfactionReason = builder.dissatisfactionReason;
      this.agents = builder.agents;
      this.channel = builder.channel;
      this.solve = builder.solve;
      this.closedBy = builder.closedBy;
      this.collaborators = builder.collaborators;
      this.customizedFields = builder.customizedFields;
      this.agentServiceDuration = builder.agentServiceDuration;
      this.agentFirstResponseDuration = builder.agentFirstResponseDuration;
      this.botServiceDuration = builder.botServiceDuration;
      this.agentResolutionTime = builder.agentResolutionTime;
      this.actualProcessingTime = builder.actualProcessingTime;
      this.agentEntryTime = builder.agentEntryTime;
      this.agentFirstResponseTime = builder.agentFirstResponseTime;
      this.agentLastResponseTime = builder.agentLastResponseTime;
      this.agentOwner = builder.agentOwner;
  }

    public static class Builder {
        private String ticketId;
        private String helpdeskId;
        private TicketUser guest;
        private Comments comments;
        private Integer ticketType;
        private Integer status;
        private Integer score;
        private Integer createdAt;
        private Integer updatedAt;
        private Integer closedAt;
        private String[] dissatisfactionReason;
        private TicketUser[] agents;
        private Integer channel;
        private Integer solve;
        private TicketUser closedBy;
        private TicketUser[] collaborators;
        private CustomizedFieldDisplayItem[] customizedFields;
        private Double agentServiceDuration;
        private Integer agentFirstResponseDuration;
        private Integer botServiceDuration;
        private Integer agentResolutionTime;
        private Integer actualProcessingTime;
        private Integer agentEntryTime;
        private Integer agentFirstResponseTime;
        private Integer agentLastResponseTime;
        private TicketUser agentOwner;
        public Builder ticketId(String ticketId) {
             this.ticketId = ticketId;
             return this;
        }
    
        public Builder helpdeskId(String helpdeskId) {
             this.helpdeskId = helpdeskId;
             return this;
        }
    
        public Builder guest(TicketUser guest) {
             this.guest = guest;
             return this;
        }
    
        public Builder comments(Comments comments) {
             this.comments = comments;
             return this;
        }
    
        public Builder ticketType(Integer ticketType) {
             this.ticketType = ticketType;
             return this;
        }
    
        public Builder status(Integer status) {
             this.status = status;
             return this;
        }
    
        public Builder score(Integer score) {
             this.score = score;
             return this;
        }
    
        public Builder createdAt(Integer createdAt) {
             this.createdAt = createdAt;
             return this;
        }
    
        public Builder updatedAt(Integer updatedAt) {
             this.updatedAt = updatedAt;
             return this;
        }
    
        public Builder closedAt(Integer closedAt) {
             this.closedAt = closedAt;
             return this;
        }
    
        public Builder dissatisfactionReason(String[] dissatisfactionReason) {
             this.dissatisfactionReason = dissatisfactionReason;
             return this;
        }
    
        public Builder agents(TicketUser[] agents) {
             this.agents = agents;
             return this;
        }
    
        public Builder channel(Integer channel) {
             this.channel = channel;
             return this;
        }
    
        public Builder solve(Integer solve) {
             this.solve = solve;
             return this;
        }
    
        public Builder closedBy(TicketUser closedBy) {
             this.closedBy = closedBy;
             return this;
        }
    
        public Builder collaborators(TicketUser[] collaborators) {
             this.collaborators = collaborators;
             return this;
        }
    
        public Builder customizedFields(CustomizedFieldDisplayItem[] customizedFields) {
             this.customizedFields = customizedFields;
             return this;
        }
    
        public Builder agentServiceDuration(Double agentServiceDuration) {
             this.agentServiceDuration = agentServiceDuration;
             return this;
        }
    
        public Builder agentFirstResponseDuration(Integer agentFirstResponseDuration) {
             this.agentFirstResponseDuration = agentFirstResponseDuration;
             return this;
        }
    
        public Builder botServiceDuration(Integer botServiceDuration) {
             this.botServiceDuration = botServiceDuration;
             return this;
        }
    
        public Builder agentResolutionTime(Integer agentResolutionTime) {
             this.agentResolutionTime = agentResolutionTime;
             return this;
        }
    
        public Builder actualProcessingTime(Integer actualProcessingTime) {
             this.actualProcessingTime = actualProcessingTime;
             return this;
        }
    
        public Builder agentEntryTime(Integer agentEntryTime) {
             this.agentEntryTime = agentEntryTime;
             return this;
        }
    
        public Builder agentFirstResponseTime(Integer agentFirstResponseTime) {
             this.agentFirstResponseTime = agentFirstResponseTime;
             return this;
        }
    
        public Builder agentLastResponseTime(Integer agentLastResponseTime) {
             this.agentLastResponseTime = agentLastResponseTime;
             return this;
        }
    
        public Builder agentOwner(TicketUser agentOwner) {
             this.agentOwner = agentOwner;
             return this;
        }
    
    
    public Ticket build(){
        return new Ticket(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
