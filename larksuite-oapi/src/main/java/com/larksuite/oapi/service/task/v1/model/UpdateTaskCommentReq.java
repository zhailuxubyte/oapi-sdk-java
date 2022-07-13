// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.task.v1.model;
import com.larksuite.oapi.service.task.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class UpdateTaskCommentReq {
    @Path
    @SerializedName("task_id")
    private String taskId;
    @Path
    @SerializedName("comment_id")
    private Long commentId;
    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Long getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    @Body
    private UpdateTaskCommentReqBody body;

    public UpdateTaskCommentReqBody getUpdateTaskCommentReqBody() {
        return this.body;
    }

    public void setUpdateTaskCommentReqBody(UpdateTaskCommentReqBody body) {
        this.body = body;
    }

// builder 开始
  public UpdateTaskCommentReq(){}

  public UpdateTaskCommentReq(Builder builder){
       this.taskId = builder.taskId;
       this.commentId = builder.commentId;
        this.body = builder.body;
  }

    public static class Builder {
    
        private String taskId;
        private Long commentId;
          public Builder taskId(String taskId) {
               this.taskId = taskId;
               return this;
          }
    
          public Builder commentId(Long commentId) {
               this.commentId = commentId;
               return this;
          }
    
        private UpdateTaskCommentReqBody body;
    
        public UpdateTaskCommentReqBody getUpdateTaskCommentReqBody() {
            return this.body;
        }
        public Builder updateTaskCommentReqBody(UpdateTaskCommentReqBody body) {
             this.body = body;
             return this;
        }
    public UpdateTaskCommentReq build(){
        return new UpdateTaskCommentReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
