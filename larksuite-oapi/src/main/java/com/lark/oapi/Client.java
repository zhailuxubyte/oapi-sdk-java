//  code generated by oapi sdk gen
package com.lark.oapi;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.cache.ICache;
import com.lark.oapi.core.cache.LocalCache;
import com.lark.oapi.core.enums.AppType;
import com.lark.oapi.core.enums.BaseUrlEnum;
import com.lark.oapi.core.httpclient.IHttpTransport;
import com.lark.oapi.core.httpclient.OkHttpTransport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.token.AppTicketManager;
import com.lark.oapi.core.token.GlobalAppTicketManager;
import com.lark.oapi.core.token.GlobalTokenManager;
import com.lark.oapi.core.token.TokenManager;
import com.lark.oapi.core.utils.OKHttps;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.service.acs.v1.AcsService;
import com.lark.oapi.service.admin.v1.AdminService;
import com.lark.oapi.service.application.v6.ApplicationService;
import com.lark.oapi.service.approval.v4.ApprovalService;
import com.lark.oapi.service.attendance.v1.AttendanceService;
import com.lark.oapi.service.baike.v1.BaikeService;
import com.lark.oapi.service.bitable.v1.BitableService;
import com.lark.oapi.service.block.v2.BlockService;
import com.lark.oapi.service.calendar.v4.CalendarService;
import com.lark.oapi.service.contact.v3.ContactService;
import com.lark.oapi.service.docx.v1.DocxService;
import com.lark.oapi.service.drive.v1.DriveService;
import com.lark.oapi.service.ehr.v1.EhrService;
import com.lark.oapi.service.event.v1.EventService;
import com.lark.oapi.service.gray_test_open_sg.v1.GrayTestOpenSgService;
import com.lark.oapi.service.human_authentication.v1.HumanAuthenticationService;
import com.lark.oapi.service.im.v1.ImService;
import com.lark.oapi.service.mail.v1.MailService;
import com.lark.oapi.service.optical_char_recognition.v1.OpticalCharRecognitionService;
import com.lark.oapi.service.passport.v1.PassportService;
import com.lark.oapi.service.search.v2.SearchService;
import com.lark.oapi.service.sheets.v3.SheetsService;
import com.lark.oapi.service.speech_to_text.v1.SpeechToTextService;
import com.lark.oapi.service.task.v1.TaskService;
import com.lark.oapi.service.tenant.v2.TenantService;
import com.lark.oapi.service.translation.v1.TranslationService;
import com.lark.oapi.service.vc.v1.VcService;
import com.lark.oapi.service.wiki.v2.WikiService;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class Client {

  private Config config;
  private AcsService acs;
  private AdminService admin;
  private ApplicationService application;
  private ApprovalService approval;
  private AttendanceService attendance;
  private BaikeService baike;
  private BitableService bitable;
  private BlockService block;
  private CalendarService calendar;
  private ContactService contact;
  private DocxService docx;
  private DriveService drive;
  private EhrService ehr;
  private EventService event;
  private GrayTestOpenSgService grayTestOpenSg;
  private HumanAuthenticationService humanAuthentication;
  private ImService im;
  private MailService mail;
  private OpticalCharRecognitionService opticalCharRecognition;
  private PassportService passport;
  private SearchService search;
  private SheetsService sheets;
  private SpeechToTextService speechToText;
  private TaskService task;
  private TenantService tenant;
  private TranslationService translation;
  private VcService vc;
  private WikiService wiki;

  public static Builder newBuilder(String appId, String appSecret) {
    return new Builder(appId, appSecret);
  }

  public void setConfig(Config config) {
    this.config = config;
  }

  public AcsService acs() {
    return acs;
  }

  public AdminService admin() {
    return admin;
  }

  public ApplicationService application() {
    return application;
  }

  public ApprovalService approval() {
    return approval;
  }

  public AttendanceService attendance() {
    return attendance;
  }

  public BaikeService baike() {
    return baike;
  }

  public BitableService bitable() {
    return bitable;
  }

  public BlockService block() {
    return block;
  }

  public CalendarService calendar() {
    return calendar;
  }

  public ContactService contact() {
    return contact;
  }

  public DocxService docx() {
    return docx;
  }

  public DriveService drive() {
    return drive;
  }

  public EhrService ehr() {
    return ehr;
  }

  public EventService event() {
    return event;
  }

  public GrayTestOpenSgService grayTestOpenSg() {
    return grayTestOpenSg;
  }

  public HumanAuthenticationService humanAuthentication() {
    return humanAuthentication;
  }

  public ImService im() {
    return im;
  }

  public MailService mail() {
    return mail;
  }

  public OpticalCharRecognitionService opticalCharRecognition() {
    return opticalCharRecognition;
  }

  public PassportService passport() {
    return passport;
  }

  public SearchService search() {
    return search;
  }

  public SheetsService sheets() {
    return sheets;
  }

  public SpeechToTextService speechToText() {
    return speechToText;
  }

  public TaskService task() {
    return task;
  }

  public TenantService tenant() {
    return tenant;
  }

  public TranslationService translation() {
    return translation;
  }

  public VcService vc() {
    return vc;
  }

  public WikiService wiki() {
    return wiki;
  }

  public RawResponse post(String httpPath
      , Object body
      , AccessTokenType accessTokenType
      , RequestOptions requestOptions) throws Exception {
    return Transport.send(config, requestOptions, "POST", httpPath,
        Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse post(String httpPath
      , Object body
      , AccessTokenType accessTokenType
  ) throws Exception {
    return Transport.send(config, null, "POST", httpPath, Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse get(String httpPath
      , Object body
      , AccessTokenType accessTokenType
      , RequestOptions requestOptions) throws Exception {
    return Transport.send(config, requestOptions, "GET", httpPath, Sets.newHashSet(accessTokenType),
        body);
  }

  public RawResponse get(String httpPath
      , Object body
      , AccessTokenType accessTokenType) throws Exception {
    return Transport.send(config, null, "GET", httpPath, Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse delete(String httpPath
      , Object body
      , AccessTokenType accessTokenType
      , RequestOptions requestOptions) throws Exception {
    return Transport.send(config, requestOptions, "DELETE", httpPath,
        Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse delete(String httpPath
      , Object body
      , AccessTokenType accessTokenType) throws Exception {
    return Transport.send(config, null, "DELETE", httpPath, Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse put(String httpPath
      , Object body
      , AccessTokenType accessTokenType
      , RequestOptions requestOptions) throws Exception {
    return Transport.send(config, requestOptions, "PUT", httpPath, Sets.newHashSet(accessTokenType),
        body);
  }

  public RawResponse put(String httpPath
      , Object body
      , AccessTokenType accessTokenType) throws Exception {
    return Transport.send(config, null, "PUT", httpPath, Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse patch(String httpPath
      , Object body
      , AccessTokenType accessTokenType
      , RequestOptions requestOptions) throws Exception {
    return Transport.send(config, requestOptions, "PATCH", httpPath,
        Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse patch(String httpPath
      , Object body
      , AccessTokenType accessTokenType) throws Exception {
    return Transport.send(config, null, "PATCH", httpPath, Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse options(String httpPath
      , Object body
      , AccessTokenType accessTokenType
      , RequestOptions requestOptions) throws Exception {
    return Transport.send(config, requestOptions, "OPTIONS", httpPath,
        Sets.newHashSet(accessTokenType), body);
  }

  public RawResponse options(String httpPath
      , Object body, AccessTokenType accessTokenType) throws Exception {
    return Transport.send(config, null, "OPTIONS", httpPath, Sets.newHashSet(accessTokenType),
        body);
  }

  public static final class Builder {

    private Config config = new Config();

    public Builder(String appId, String appSecret) {
      config.setAppId(appId);
      config.setAppSecret(appSecret);
      config.setBaseUrl(BaseUrlEnum.FeiShu.getUrl());
      config.setAppType(AppType.SELF_BUILT);
      config.setDisableTokenCache(false);
    }

    public Builder helpDeskCredential(String helpDeskId, String helpDeskToken) {
      config.setHelpDeskToken(helpDeskToken);
      config.setHelpDeskID(helpDeskId);
      if (Strings.isNotEmpty(helpDeskId) && Strings.isNotEmpty(helpDeskToken)) {
        config.setHelpDeskAuthToken(Base64.encode(
            String.format("%s:%s", helpDeskId, helpDeskToken).getBytes(StandardCharsets.UTF_8)));
      }
      return this;
    }

    public Builder appType(AppType appType) {
      config.setAppType(appType);
      return this;
    }

    public Builder disableTokenCache() {
      config.setDisableTokenCache(true);
      return this;
    }

    public Builder logReqRespInfoAtDebugLevel(boolean logReqRespInfoAtDebugLevel) {
      config.setLogReqRespInfoAtDebugLevel(logReqRespInfoAtDebugLevel);
      return this;
    }

    public Builder openBaseUrl(String baseUrl) {
      config.setBaseUrl(baseUrl);
      return this;
    }

    public Builder openBaseUrl(BaseUrlEnum baseUrl) {
      config.setBaseUrl(baseUrl.getUrl());
      return this;
    }

    public Builder tokenCache(ICache cache) {
      config.setCache(cache);
      return this;
    }

    public Builder requestTimeout(long timeout, TimeUnit timeUnit) {
      config.setRequestTimeOut(timeout);
      config.setTimeOutTimeUnit(timeUnit);
      return this;
    }

    public Builder httpTransport(IHttpTransport httpTransport) {
      config.setHttpTransport(httpTransport);
      return this;
    }

    private void initCache(Config config) {
      if (config.getCache() != null) {
        GlobalAppTicketManager.setAppTicketManager(new AppTicketManager(config.getCache()));
        GlobalTokenManager.setTokenManager(new TokenManager(config.getCache()));
      } else {
        ICache cache = LocalCache.getInstance();
        GlobalAppTicketManager.setAppTicketManager(new AppTicketManager(cache));
        GlobalTokenManager.setTokenManager(new TokenManager(cache));
      }
    }

    private void initHttpTransport(Config config) {
      if (config.getHttpTransport() == null) {
        if (config.getRequestTimeOut() > 0) {
          config.setHttpTransport(new OkHttpTransport(
              OKHttps.create(config.getRequestTimeOut(), config.getTimeOutTimeUnit())));
        } else {
          config.setHttpTransport(new OkHttpTransport(OKHttps.defaultClient));
        }
      }
    }

    public Client build() {
      Client client = new Client();
      client.setConfig(config);
      initCache(config);
      initHttpTransport(config);
      client.acs = new AcsService(config);
      client.admin = new AdminService(config);
      client.application = new ApplicationService(config);
      client.approval = new ApprovalService(config);
      client.attendance = new AttendanceService(config);
      client.baike = new BaikeService(config);
      client.bitable = new BitableService(config);
      client.block = new BlockService(config);
      client.calendar = new CalendarService(config);
      client.contact = new ContactService(config);
      client.docx = new DocxService(config);
      client.drive = new DriveService(config);
      client.ehr = new EhrService(config);
      client.event = new EventService(config);
      client.grayTestOpenSg = new GrayTestOpenSgService(config);
      client.humanAuthentication = new HumanAuthenticationService(config);
      client.im = new ImService(config);
      client.mail = new MailService(config);
      client.opticalCharRecognition = new OpticalCharRecognitionService(config);
      client.passport = new PassportService(config);
      client.search = new SearchService(config);
      client.sheets = new SheetsService(config);
      client.speechToText = new SpeechToTextService(config);
      client.task = new TaskService(config);
      client.tenant = new TenantService(config);
      client.translation = new TranslationService(config);
      client.vc = new VcService(config);
      client.wiki = new WikiService(config);

      return client;
    }
  }
}

