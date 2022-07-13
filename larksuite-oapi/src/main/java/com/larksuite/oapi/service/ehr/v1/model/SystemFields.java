// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.ehr.v1.model;
import com.larksuite.oapi.service.ehr.v1.enums.*;
import com.google.gson.annotations.SerializedName;
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
public class SystemFields {
    @SerializedName("name")
    private String name;
    @SerializedName("en_name")
    private String enName;
    @SerializedName("email")
    private String email;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("manager")
    private Manager manager;
    @SerializedName("job")
    private Job job;
    @SerializedName("job_level")
    private JobLevel jobLevel;
    @SerializedName("work_location")
    private WorkLocation workLocation;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName("birthday")
    private String birthday;
    @SerializedName("native_region")
    private NativeRegion nativeRegion;
    @SerializedName("ethnicity")
    private Integer ethnicity;
    @SerializedName("marital_status")
    private Integer maritalStatus;
    @SerializedName("political_status")
    private Integer politicalStatus;
    @SerializedName("entered_workforce_date")
    private String enteredWorkforceDate;
    @SerializedName("id_type")
    private Integer idType;
    @SerializedName("id_number")
    private String idNumber;
    @SerializedName("hukou_type")
    private Integer hukouType;
    @SerializedName("hukou_location")
    private String hukouLocation;
    @SerializedName("bank_account_number")
    private String bankAccountNumber;
    @SerializedName("bank_name")
    private String bankName;
    @SerializedName("social_security_account")
    private String socialSecurityAccount;
    @SerializedName("provident_fund_account")
    private String providentFundAccount;
    @SerializedName("employee_no")
    private String employeeNo;
    @SerializedName("employee_type")
    private Integer employeeType;
    @SerializedName("status")
    private Integer status;
    @SerializedName("hire_date")
    private String hireDate;
    @SerializedName("probation_months")
    private Double probationMonths;
    @SerializedName("conversion_date")
    private String conversionDate;
    @SerializedName("application")
    private Integer application;
    @SerializedName("application_status")
    private Integer applicationStatus;
    @SerializedName("last_day")
    private String lastDay;
    @SerializedName("departure_type")
    private Integer departureType;
    @SerializedName("departure_reason")
    private Integer departureReason;
    @SerializedName("departure_notes")
    private String departureNotes;
    @SerializedName("contract_company")
    private ContractCompany contractCompany;
    @SerializedName("contract_type")
    private Integer contractType;
    @SerializedName("contract_start_date")
    private String contractStartDate;
    @SerializedName("contract_expiration_date")
    private String contractExpirationDate;
    @SerializedName("contract_sign_times")
    private Integer contractSignTimes;
    @SerializedName("personal_email")
    private String personalEmail;
    @SerializedName("family_address")
    private String familyAddress;
    @SerializedName("primary_emergency_contact")
    private EmergencyContact primaryEmergencyContact;
    @SerializedName("emergency_contact")
    private EmergencyContact[] emergencyContact;
    @SerializedName("highest_level_of_edu")
    private Education highestLevelOfEdu;
    @SerializedName("education")
    private Education[] education;
    @SerializedName("former_work_exp")
    private WorkExperience formerWorkExp;
    @SerializedName("work_exp")
    private WorkExperience[] workExp;
    @SerializedName("id_photo_po_side")
    private Attachment[] idPhotoPoSide;
    @SerializedName("id_photo_em_side")
    private Attachment[] idPhotoEmSide;
    @SerializedName("id_photo")
    private Attachment[] idPhoto;
    @SerializedName("diploma_photo")
    private Attachment[] diplomaPhoto;
    @SerializedName("graduation_cert")
    private Attachment[] graduationCert;
    @SerializedName("cert_of_merit")
    private Attachment[] certOfMerit;
    @SerializedName("offboarding_file")
    private Attachment[] offboardingFile;
    @SerializedName("cancel_onboarding_reason")
    private Integer cancelOnboardingReason;
    @SerializedName("cancel_onboarding_notes")
    private String cancelOnboardingNotes;
    @SerializedName("employee_form_status")
    private Integer employeeFormStatus;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("update_time")
    private Long updateTime;
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Manager getManager() {
        return this.manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Job getJob() {
        return this.job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public JobLevel getJobLevel() {
        return this.jobLevel;
    }

    public void setJobLevel(JobLevel jobLevel) {
        this.jobLevel = jobLevel;
    }

    public WorkLocation getWorkLocation() {
        return this.workLocation;
    }

    public void setWorkLocation(WorkLocation workLocation) {
        this.workLocation = workLocation;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public NativeRegion getNativeRegion() {
        return this.nativeRegion;
    }

    public void setNativeRegion(NativeRegion nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

    public Integer getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(Integer ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getPoliticalStatus() {
        return this.politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getEnteredWorkforceDate() {
        return this.enteredWorkforceDate;
    }

    public void setEnteredWorkforceDate(String enteredWorkforceDate) {
        this.enteredWorkforceDate = enteredWorkforceDate;
    }

    public Integer getIdType() {
        return this.idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getHukouType() {
        return this.hukouType;
    }

    public void setHukouType(Integer hukouType) {
        this.hukouType = hukouType;
    }

    public String getHukouLocation() {
        return this.hukouLocation;
    }

    public void setHukouLocation(String hukouLocation) {
        this.hukouLocation = hukouLocation;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSocialSecurityAccount() {
        return this.socialSecurityAccount;
    }

    public void setSocialSecurityAccount(String socialSecurityAccount) {
        this.socialSecurityAccount = socialSecurityAccount;
    }

    public String getProvidentFundAccount() {
        return this.providentFundAccount;
    }

    public void setProvidentFundAccount(String providentFundAccount) {
        this.providentFundAccount = providentFundAccount;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Integer getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Double getProbationMonths() {
        return this.probationMonths;
    }

    public void setProbationMonths(Double probationMonths) {
        this.probationMonths = probationMonths;
    }

    public String getConversionDate() {
        return this.conversionDate;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }

    public Integer getApplication() {
        return this.application;
    }

    public void setApplication(Integer application) {
        this.application = application;
    }

    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    public void setApplicationStatus(Integer applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getLastDay() {
        return this.lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public Integer getDepartureType() {
        return this.departureType;
    }

    public void setDepartureType(Integer departureType) {
        this.departureType = departureType;
    }

    public Integer getDepartureReason() {
        return this.departureReason;
    }

    public void setDepartureReason(Integer departureReason) {
        this.departureReason = departureReason;
    }

    public String getDepartureNotes() {
        return this.departureNotes;
    }

    public void setDepartureNotes(String departureNotes) {
        this.departureNotes = departureNotes;
    }

    public ContractCompany getContractCompany() {
        return this.contractCompany;
    }

    public void setContractCompany(ContractCompany contractCompany) {
        this.contractCompany = contractCompany;
    }

    public Integer getContractType() {
        return this.contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public String getContractStartDate() {
        return this.contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractExpirationDate() {
        return this.contractExpirationDate;
    }

    public void setContractExpirationDate(String contractExpirationDate) {
        this.contractExpirationDate = contractExpirationDate;
    }

    public Integer getContractSignTimes() {
        return this.contractSignTimes;
    }

    public void setContractSignTimes(Integer contractSignTimes) {
        this.contractSignTimes = contractSignTimes;
    }

    public String getPersonalEmail() {
        return this.personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getFamilyAddress() {
        return this.familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public EmergencyContact getPrimaryEmergencyContact() {
        return this.primaryEmergencyContact;
    }

    public void setPrimaryEmergencyContact(EmergencyContact primaryEmergencyContact) {
        this.primaryEmergencyContact = primaryEmergencyContact;
    }

    public EmergencyContact[] getEmergencyContact() {
        return this.emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact[] emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Education getHighestLevelOfEdu() {
        return this.highestLevelOfEdu;
    }

    public void setHighestLevelOfEdu(Education highestLevelOfEdu) {
        this.highestLevelOfEdu = highestLevelOfEdu;
    }

    public Education[] getEducation() {
        return this.education;
    }

    public void setEducation(Education[] education) {
        this.education = education;
    }

    public WorkExperience getFormerWorkExp() {
        return this.formerWorkExp;
    }

    public void setFormerWorkExp(WorkExperience formerWorkExp) {
        this.formerWorkExp = formerWorkExp;
    }

    public WorkExperience[] getWorkExp() {
        return this.workExp;
    }

    public void setWorkExp(WorkExperience[] workExp) {
        this.workExp = workExp;
    }

    public Attachment[] getIdPhotoPoSide() {
        return this.idPhotoPoSide;
    }

    public void setIdPhotoPoSide(Attachment[] idPhotoPoSide) {
        this.idPhotoPoSide = idPhotoPoSide;
    }

    public Attachment[] getIdPhotoEmSide() {
        return this.idPhotoEmSide;
    }

    public void setIdPhotoEmSide(Attachment[] idPhotoEmSide) {
        this.idPhotoEmSide = idPhotoEmSide;
    }

    public Attachment[] getIdPhoto() {
        return this.idPhoto;
    }

    public void setIdPhoto(Attachment[] idPhoto) {
        this.idPhoto = idPhoto;
    }

    public Attachment[] getDiplomaPhoto() {
        return this.diplomaPhoto;
    }

    public void setDiplomaPhoto(Attachment[] diplomaPhoto) {
        this.diplomaPhoto = diplomaPhoto;
    }

    public Attachment[] getGraduationCert() {
        return this.graduationCert;
    }

    public void setGraduationCert(Attachment[] graduationCert) {
        this.graduationCert = graduationCert;
    }

    public Attachment[] getCertOfMerit() {
        return this.certOfMerit;
    }

    public void setCertOfMerit(Attachment[] certOfMerit) {
        this.certOfMerit = certOfMerit;
    }

    public Attachment[] getOffboardingFile() {
        return this.offboardingFile;
    }

    public void setOffboardingFile(Attachment[] offboardingFile) {
        this.offboardingFile = offboardingFile;
    }

    public Integer getCancelOnboardingReason() {
        return this.cancelOnboardingReason;
    }

    public void setCancelOnboardingReason(Integer cancelOnboardingReason) {
        this.cancelOnboardingReason = cancelOnboardingReason;
    }

    public String getCancelOnboardingNotes() {
        return this.cancelOnboardingNotes;
    }

    public void setCancelOnboardingNotes(String cancelOnboardingNotes) {
        this.cancelOnboardingNotes = cancelOnboardingNotes;
    }

    public Integer getEmployeeFormStatus() {
        return this.employeeFormStatus;
    }

    public void setEmployeeFormStatus(Integer employeeFormStatus) {
        this.employeeFormStatus = employeeFormStatus;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }


// builder 开始
  public SystemFields(){}

  public SystemFields(Builder builder){
      this.name = builder.name;
      this.enName = builder.enName;
      this.email = builder.email;
      this.mobile = builder.mobile;
      this.departmentId = builder.departmentId;
      this.manager = builder.manager;
      this.job = builder.job;
      this.jobLevel = builder.jobLevel;
      this.workLocation = builder.workLocation;
      this.gender = builder.gender;
      this.birthday = builder.birthday;
      this.nativeRegion = builder.nativeRegion;
      this.ethnicity = builder.ethnicity;
      this.maritalStatus = builder.maritalStatus;
      this.politicalStatus = builder.politicalStatus;
      this.enteredWorkforceDate = builder.enteredWorkforceDate;
      this.idType = builder.idType;
      this.idNumber = builder.idNumber;
      this.hukouType = builder.hukouType;
      this.hukouLocation = builder.hukouLocation;
      this.bankAccountNumber = builder.bankAccountNumber;
      this.bankName = builder.bankName;
      this.socialSecurityAccount = builder.socialSecurityAccount;
      this.providentFundAccount = builder.providentFundAccount;
      this.employeeNo = builder.employeeNo;
      this.employeeType = builder.employeeType;
      this.status = builder.status;
      this.hireDate = builder.hireDate;
      this.probationMonths = builder.probationMonths;
      this.conversionDate = builder.conversionDate;
      this.application = builder.application;
      this.applicationStatus = builder.applicationStatus;
      this.lastDay = builder.lastDay;
      this.departureType = builder.departureType;
      this.departureReason = builder.departureReason;
      this.departureNotes = builder.departureNotes;
      this.contractCompany = builder.contractCompany;
      this.contractType = builder.contractType;
      this.contractStartDate = builder.contractStartDate;
      this.contractExpirationDate = builder.contractExpirationDate;
      this.contractSignTimes = builder.contractSignTimes;
      this.personalEmail = builder.personalEmail;
      this.familyAddress = builder.familyAddress;
      this.primaryEmergencyContact = builder.primaryEmergencyContact;
      this.emergencyContact = builder.emergencyContact;
      this.highestLevelOfEdu = builder.highestLevelOfEdu;
      this.education = builder.education;
      this.formerWorkExp = builder.formerWorkExp;
      this.workExp = builder.workExp;
      this.idPhotoPoSide = builder.idPhotoPoSide;
      this.idPhotoEmSide = builder.idPhotoEmSide;
      this.idPhoto = builder.idPhoto;
      this.diplomaPhoto = builder.diplomaPhoto;
      this.graduationCert = builder.graduationCert;
      this.certOfMerit = builder.certOfMerit;
      this.offboardingFile = builder.offboardingFile;
      this.cancelOnboardingReason = builder.cancelOnboardingReason;
      this.cancelOnboardingNotes = builder.cancelOnboardingNotes;
      this.employeeFormStatus = builder.employeeFormStatus;
      this.createTime = builder.createTime;
      this.updateTime = builder.updateTime;
  }

    public static class Builder {
        private String name;
        private String enName;
        private String email;
        private String mobile;
        private String departmentId;
        private Manager manager;
        private Job job;
        private JobLevel jobLevel;
        private WorkLocation workLocation;
        private Integer gender;
        private String birthday;
        private NativeRegion nativeRegion;
        private Integer ethnicity;
        private Integer maritalStatus;
        private Integer politicalStatus;
        private String enteredWorkforceDate;
        private Integer idType;
        private String idNumber;
        private Integer hukouType;
        private String hukouLocation;
        private String bankAccountNumber;
        private String bankName;
        private String socialSecurityAccount;
        private String providentFundAccount;
        private String employeeNo;
        private Integer employeeType;
        private Integer status;
        private String hireDate;
        private Double probationMonths;
        private String conversionDate;
        private Integer application;
        private Integer applicationStatus;
        private String lastDay;
        private Integer departureType;
        private Integer departureReason;
        private String departureNotes;
        private ContractCompany contractCompany;
        private Integer contractType;
        private String contractStartDate;
        private String contractExpirationDate;
        private Integer contractSignTimes;
        private String personalEmail;
        private String familyAddress;
        private EmergencyContact primaryEmergencyContact;
        private EmergencyContact[] emergencyContact;
        private Education highestLevelOfEdu;
        private Education[] education;
        private WorkExperience formerWorkExp;
        private WorkExperience[] workExp;
        private Attachment[] idPhotoPoSide;
        private Attachment[] idPhotoEmSide;
        private Attachment[] idPhoto;
        private Attachment[] diplomaPhoto;
        private Attachment[] graduationCert;
        private Attachment[] certOfMerit;
        private Attachment[] offboardingFile;
        private Integer cancelOnboardingReason;
        private String cancelOnboardingNotes;
        private Integer employeeFormStatus;
        private Long createTime;
        private Long updateTime;
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
        public Builder enName(String enName) {
             this.enName = enName;
             return this;
        }
    
        public Builder email(String email) {
             this.email = email;
             return this;
        }
    
        public Builder mobile(String mobile) {
             this.mobile = mobile;
             return this;
        }
    
        public Builder departmentId(String departmentId) {
             this.departmentId = departmentId;
             return this;
        }
    
        public Builder manager(Manager manager) {
             this.manager = manager;
             return this;
        }
    
        public Builder job(Job job) {
             this.job = job;
             return this;
        }
    
        public Builder jobLevel(JobLevel jobLevel) {
             this.jobLevel = jobLevel;
             return this;
        }
    
        public Builder workLocation(WorkLocation workLocation) {
             this.workLocation = workLocation;
             return this;
        }
    
        public Builder gender(Integer gender) {
             this.gender = gender;
             return this;
        }
        public Builder gender(com.larksuite.oapi.service.ehr.v1.enums.GenderEnum gender) {
             this.gender = gender.getValue();
             return this;
        }
    
        public Builder birthday(String birthday) {
             this.birthday = birthday;
             return this;
        }
    
        public Builder nativeRegion(NativeRegion nativeRegion) {
             this.nativeRegion = nativeRegion;
             return this;
        }
    
        public Builder ethnicity(Integer ethnicity) {
             this.ethnicity = ethnicity;
             return this;
        }
        public Builder ethnicity(com.larksuite.oapi.service.ehr.v1.enums.EthnicityEnum ethnicity) {
             this.ethnicity = ethnicity.getValue();
             return this;
        }
    
        public Builder maritalStatus(Integer maritalStatus) {
             this.maritalStatus = maritalStatus;
             return this;
        }
        public Builder maritalStatus(com.larksuite.oapi.service.ehr.v1.enums.MaritalStatusEnum maritalStatus) {
             this.maritalStatus = maritalStatus.getValue();
             return this;
        }
    
        public Builder politicalStatus(Integer politicalStatus) {
             this.politicalStatus = politicalStatus;
             return this;
        }
        public Builder politicalStatus(com.larksuite.oapi.service.ehr.v1.enums.PoliticalStatusEnum politicalStatus) {
             this.politicalStatus = politicalStatus.getValue();
             return this;
        }
    
        public Builder enteredWorkforceDate(String enteredWorkforceDate) {
             this.enteredWorkforceDate = enteredWorkforceDate;
             return this;
        }
    
        public Builder idType(Integer idType) {
             this.idType = idType;
             return this;
        }
        public Builder idType(com.larksuite.oapi.service.ehr.v1.enums.IdTypeEnum idType) {
             this.idType = idType.getValue();
             return this;
        }
    
        public Builder idNumber(String idNumber) {
             this.idNumber = idNumber;
             return this;
        }
    
        public Builder hukouType(Integer hukouType) {
             this.hukouType = hukouType;
             return this;
        }
        public Builder hukouType(com.larksuite.oapi.service.ehr.v1.enums.HukouTypeEnum hukouType) {
             this.hukouType = hukouType.getValue();
             return this;
        }
    
        public Builder hukouLocation(String hukouLocation) {
             this.hukouLocation = hukouLocation;
             return this;
        }
    
        public Builder bankAccountNumber(String bankAccountNumber) {
             this.bankAccountNumber = bankAccountNumber;
             return this;
        }
    
        public Builder bankName(String bankName) {
             this.bankName = bankName;
             return this;
        }
    
        public Builder socialSecurityAccount(String socialSecurityAccount) {
             this.socialSecurityAccount = socialSecurityAccount;
             return this;
        }
    
        public Builder providentFundAccount(String providentFundAccount) {
             this.providentFundAccount = providentFundAccount;
             return this;
        }
    
        public Builder employeeNo(String employeeNo) {
             this.employeeNo = employeeNo;
             return this;
        }
    
        public Builder employeeType(Integer employeeType) {
             this.employeeType = employeeType;
             return this;
        }
        public Builder employeeType(com.larksuite.oapi.service.ehr.v1.enums.EmployeeTypeEnum employeeType) {
             this.employeeType = employeeType.getValue();
             return this;
        }
    
        public Builder status(Integer status) {
             this.status = status;
             return this;
        }
        public Builder status(com.larksuite.oapi.service.ehr.v1.enums.StatusEnum status) {
             this.status = status.getValue();
             return this;
        }
    
        public Builder hireDate(String hireDate) {
             this.hireDate = hireDate;
             return this;
        }
    
        public Builder probationMonths(Double probationMonths) {
             this.probationMonths = probationMonths;
             return this;
        }
    
        public Builder conversionDate(String conversionDate) {
             this.conversionDate = conversionDate;
             return this;
        }
    
        public Builder application(Integer application) {
             this.application = application;
             return this;
        }
        public Builder application(com.larksuite.oapi.service.ehr.v1.enums.ApplicationEnum application) {
             this.application = application.getValue();
             return this;
        }
    
        public Builder applicationStatus(Integer applicationStatus) {
             this.applicationStatus = applicationStatus;
             return this;
        }
        public Builder applicationStatus(com.larksuite.oapi.service.ehr.v1.enums.ApplicationStatusEnum applicationStatus) {
             this.applicationStatus = applicationStatus.getValue();
             return this;
        }
    
        public Builder lastDay(String lastDay) {
             this.lastDay = lastDay;
             return this;
        }
    
        public Builder departureType(Integer departureType) {
             this.departureType = departureType;
             return this;
        }
        public Builder departureType(com.larksuite.oapi.service.ehr.v1.enums.DepartureTypeEnum departureType) {
             this.departureType = departureType.getValue();
             return this;
        }
    
        public Builder departureReason(Integer departureReason) {
             this.departureReason = departureReason;
             return this;
        }
        public Builder departureReason(com.larksuite.oapi.service.ehr.v1.enums.DepartureReasonEnum departureReason) {
             this.departureReason = departureReason.getValue();
             return this;
        }
    
        public Builder departureNotes(String departureNotes) {
             this.departureNotes = departureNotes;
             return this;
        }
    
        public Builder contractCompany(ContractCompany contractCompany) {
             this.contractCompany = contractCompany;
             return this;
        }
    
        public Builder contractType(Integer contractType) {
             this.contractType = contractType;
             return this;
        }
        public Builder contractType(com.larksuite.oapi.service.ehr.v1.enums.ContractTypeEnum contractType) {
             this.contractType = contractType.getValue();
             return this;
        }
    
        public Builder contractStartDate(String contractStartDate) {
             this.contractStartDate = contractStartDate;
             return this;
        }
    
        public Builder contractExpirationDate(String contractExpirationDate) {
             this.contractExpirationDate = contractExpirationDate;
             return this;
        }
    
        public Builder contractSignTimes(Integer contractSignTimes) {
             this.contractSignTimes = contractSignTimes;
             return this;
        }
    
        public Builder personalEmail(String personalEmail) {
             this.personalEmail = personalEmail;
             return this;
        }
    
        public Builder familyAddress(String familyAddress) {
             this.familyAddress = familyAddress;
             return this;
        }
    
        public Builder primaryEmergencyContact(EmergencyContact primaryEmergencyContact) {
             this.primaryEmergencyContact = primaryEmergencyContact;
             return this;
        }
    
        public Builder emergencyContact(EmergencyContact[] emergencyContact) {
             this.emergencyContact = emergencyContact;
             return this;
        }
    
        public Builder highestLevelOfEdu(Education highestLevelOfEdu) {
             this.highestLevelOfEdu = highestLevelOfEdu;
             return this;
        }
    
        public Builder education(Education[] education) {
             this.education = education;
             return this;
        }
    
        public Builder formerWorkExp(WorkExperience formerWorkExp) {
             this.formerWorkExp = formerWorkExp;
             return this;
        }
    
        public Builder workExp(WorkExperience[] workExp) {
             this.workExp = workExp;
             return this;
        }
    
        public Builder idPhotoPoSide(Attachment[] idPhotoPoSide) {
             this.idPhotoPoSide = idPhotoPoSide;
             return this;
        }
    
        public Builder idPhotoEmSide(Attachment[] idPhotoEmSide) {
             this.idPhotoEmSide = idPhotoEmSide;
             return this;
        }
    
        public Builder idPhoto(Attachment[] idPhoto) {
             this.idPhoto = idPhoto;
             return this;
        }
    
        public Builder diplomaPhoto(Attachment[] diplomaPhoto) {
             this.diplomaPhoto = diplomaPhoto;
             return this;
        }
    
        public Builder graduationCert(Attachment[] graduationCert) {
             this.graduationCert = graduationCert;
             return this;
        }
    
        public Builder certOfMerit(Attachment[] certOfMerit) {
             this.certOfMerit = certOfMerit;
             return this;
        }
    
        public Builder offboardingFile(Attachment[] offboardingFile) {
             this.offboardingFile = offboardingFile;
             return this;
        }
    
        public Builder cancelOnboardingReason(Integer cancelOnboardingReason) {
             this.cancelOnboardingReason = cancelOnboardingReason;
             return this;
        }
        public Builder cancelOnboardingReason(com.larksuite.oapi.service.ehr.v1.enums.CancelOnboardingReasonEnum cancelOnboardingReason) {
             this.cancelOnboardingReason = cancelOnboardingReason.getValue();
             return this;
        }
    
        public Builder cancelOnboardingNotes(String cancelOnboardingNotes) {
             this.cancelOnboardingNotes = cancelOnboardingNotes;
             return this;
        }
    
        public Builder employeeFormStatus(Integer employeeFormStatus) {
             this.employeeFormStatus = employeeFormStatus;
             return this;
        }
        public Builder employeeFormStatus(com.larksuite.oapi.service.ehr.v1.enums.EmployeeFormStatusEnum employeeFormStatus) {
             this.employeeFormStatus = employeeFormStatus.getValue();
             return this;
        }
    
        public Builder createTime(Long createTime) {
             this.createTime = createTime;
             return this;
        }
    
        public Builder updateTime(Long updateTime) {
             this.updateTime = updateTime;
             return this;
        }
    
    
    public SystemFields build(){
        return new SystemFields(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
