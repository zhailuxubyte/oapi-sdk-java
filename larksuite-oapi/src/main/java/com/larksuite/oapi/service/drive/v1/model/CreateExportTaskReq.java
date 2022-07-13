// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.larksuite.oapi.core.annotation.Body;

public class CreateExportTaskReq {
    @Body
    private ExportTask body;

    // builder 开始
    public CreateExportTaskReq() {
    }

    public CreateExportTaskReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ExportTask getExportTask() {
        return this.body;
    }

    public void setExportTask(ExportTask body) {
        this.body = body;
    }

    public static class Builder {

        private ExportTask body;

        public ExportTask getExportTask() {
            return this.body;
        }

        public Builder exportTask(ExportTask body) {
            this.body = body;
            return this;
        }

        public CreateExportTaskReq build() {
            return new CreateExportTaskReq(this);
        }
    }
}
