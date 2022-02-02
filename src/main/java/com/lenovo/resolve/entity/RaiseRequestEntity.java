// Generated with g9.

package com.lenovo.resolve.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "tbl_rsvl_casedetails")
public class RaiseRequestEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
	protected static final String PK = "csdtTicketNumber";

	@Id
	@Column(name = "csdt_ticket_number", unique = true, nullable = false, length = 225)
	private String csdtTicketNumber;
	@Column(name = "csdt_so_no", nullable = false, length = 25)
	private String csdtSoNo;
	@Column(name = "csdt_machine_serial_number", length = 45)
	private String csdtMachineSerialNumber;
	@Column(name = "csdt_machine_type", nullable = false, length = 225)
	private String csdtMachineType;
	@Column(name = "csdt_model", length = 225)
	private String csdtModel;
	@Column(name = "csdt_product_line", length = 225)
	private String csdtProductLine;
	@Column(name = "csdt_requested_by", length = 225)
	private String csdtRequestedBy;
	@Column(name = "csdt_request_date")
	private Date csdtRequestDate;
	@Column(name = "csdt_request_time")
	private Time csdtRequestTime;
	@Column(name = "csdt_region", length = 30)
	private String csdtRegion;
	@Column(name = "csdt_country_code", length = 10)
	private String csdtCountryCode;
	@Column(name = "csdt_city", length = 100)
	private String csdtCity;
	@Column(name = "csdt_diagnostic_log")
	private String csdtDiagnosticLog;
	@Column(name = "csdt_snapshots", length = 225)
	private String csdtSnapshots;
	@Column(name = "csdt_healhcheck_log")
	private String csdtHealhcheckLog;
	@Column(name = "csdt_Servicecompleted_by", length = 100)
	private String csdtServicecompletedBy;
	@Column(name = "csdt_status", nullable = false, length = 225)
	private String csdtStatus;
	@Column(name = "csdt_sync_count", length = 225)
	private String csdtSyncCount;
	@Column(name = "csdt_lob", length = 100)
	private String csdtLob;
	@Column(name = "csdt_system_type", length = 100)
	private String csdtSystemType;
	@Column(name = "csdt_flow_type", length = 45)
	private String csdtFlowType;
	@Column(name = "csdt_machine_no_sync_status", length = 100)
	private String csdtMachineNoSyncStatus;
	@Column(name = "csdt_last_updated")
	private Date csdtLastUpdated;
	@Column(name = "csdt_mtm_number", length = 255)
	private String csdtMtmNumber;
	@Column(name = "csdt_reason", length = 16777215)
	private String csdtReason;
	@Column(name = "csdt_trex_status", length = 45)
	private String csdtTrexStatus;
	@Column(name = "csdt_priority", length = 45)
	private String csdtPriority;
	@Column(name = "csdt_case_type", length = 225)
	private String csdtCaseType;
	@Column(name = "csdt_case_status", length = 225)
	private String csdtCaseStatus;
	@Column(name = "csdt_attachments_folder_id", length = 100)
	private String csdtAttachmentsFolderId;
	@Column(name = "csdt_request_confiramation", length = 100)
	private String csdtRequestConfiramation;
	@Column(name = "csdt_comments")
	private String csdtComments;
	@Column(name = "csdt_bar_code")
	private String csdtBarCode;
	@Column(name = "csdt_pp_id", length = 225)
	private String csdtPpId;
	@Column(name = "csdt_diagnostic_result", length = 225)
	private String csdtDiagnosticResult;
	@Column(name = "csdt_customer_mentioned_issue", length = 225)
	private String csdtCustomerMentionedIssue;
	@Column(name = "csdt_diag_problem", length = 225)
	private String csdtDiagProblem;
	@Column(name = "csdt_diag_category", length = 100)
	private String csdtDiagCategory;
	@Column(name = "csdt_commodity_type", length = 100)
	private String csdtCommodityType;
	@Column(name = "csdt_doa_failure_type", length = 100)
	private String csdtDoaFailureType;
	@Column(name = "csdt_actioned_date")
	private Date csdtActionedDate;
	@Column(name = "csdt_action_time")
	private Time csdtActionTime;
	@Column(name = "csdt_actioned_by", length = 225)
	private String csdtActionedBy;
	@Column(name = "csdt_cc_email_id", length = 225)
	private String csdtCcEmailId;
	@Column(name = "csdt_approval_confirmation", length = 100)
	private String csdtApprovalConfirmation;
	@Column(name = "csdt_uu_id", length = 225)
	private String csdtUuId;
	@Column(name = "csdt_engineer_attachment_folder_id", length = 225)
	private String csdtEngineerAttachmentFolderId;
	@Column(name = "csdt_approver_attachment_folder_id", length = 225)
	private String csdtApproverAttachmentFolderId;
	@Column(name = "csdt_approval_type", length = 100)
	private String csdtApprovalType;
	@Column(name = "csdt_barcode_reason", length = 45)
	private String csdtBarcodeReason;
	@Column(name = "csdt_service_delivery_type", length = 45)
	private String csdtServiceDeliveryType;
	@Column(name = "csdt_barcode_qr_code", length = 1000)
	private String csdtBarcodeQrCode;
	@Column(name = "csdt_required_part_fru", length = 225)
	private String csdtRequiredPartFru;
	@Column(name = "csdt_recived_part_fru", length = 225)
	private String csdtRecivedPartFru;
	@Column(name = "csdt_issue_before_replacing_part", length = 800)
	private String csdtIssueBeforeReplacingPart;
	@Column(name = "csdt_issue_after_replacing_part", length = 225)
	private String csdtIssueAfterReplacingPart;
	@Column(name = "csdt_swapabale_part_number", length = 225)
	private String csdtSwapabalePartNumber;
	@Column(name = "csdt_add_part_name_number", length = 225)
	private String csdtAddPartNameNumber;
	@Column(name = "csdt_trouble_shooting", length = 16777215)
	private String csdtTroubleShooting;
	@Column(name = "csdt_tool_used_to_identify_as_doa", length = 225)
	private String csdtToolUsedToIdentifyAsDoa;
	@Column(name = "csdt_check_point", length = 16777215)
	private String csdtCheckPoint;
	@Column(name = "csdt_engg_user_name", length = 225)
	private String csdtEnggUserName;
	@Column(name = "csdt_fs_tool_incident_number", length = 225)
	private String csdtFsToolIncidentNumber;
	@Column(name = "csdt_assign_to", length = 225)
	private String csdtAssignTo;
	@Column(name = "csdt_cc_comments", length = 16777215)
	private String csdtCcComments;
	@Column(name = "csdt_notification_status", length = 225)
	private String csdtNotificationStatus;
	@Column(name = "csdt_need_approval", length = 45)
	private String csdtNeedApproval;
	@Column(name = "csdt_reminder", precision = 10)
	private int csdtReminder;
	@Column(name = "csdt_doa_type", length = 225)
	private String csdtDoaType;
	@Column(name = "csdt_add_issue", length = 225)
	private String csdtAddIssue;
	@Column(name = "csdt_customer_name", length = 225)
	private String csdtCustomerName;
	@Column(name = "csdt_customer_contact", length = 225)
	private String csdtCustomerContact;
	@Column(name = "csdt_customer_email", length = 225)
	private String csdtCustomerEmail;
	@Column(name = "csdt_IWS", length = 45)
	private String csdtIws;

	/** Default constructor. */
	public RaiseRequestEntity() {
		super();
	}

	/**
	 * Access method for csdtTicketNumber.
	 *
	 * @return the current value of csdtTicketNumber
	 */
	public String getCsdtTicketNumber() {
		return csdtTicketNumber;
	}

	/**
	 * Setter method for csdtTicketNumber.
	 *
	 * @param aCsdtTicketNumber the new value for csdtTicketNumber
	 */
	public void setCsdtTicketNumber(String aCsdtTicketNumber) {
		csdtTicketNumber = aCsdtTicketNumber;
	}

	/**
	 * Access method for csdtSoNo.
	 *
	 * @return the current value of csdtSoNo
	 */
	public String getCsdtSoNo() {
		return csdtSoNo;
	}

	/**
	 * Setter method for csdtSoNo.
	 *
	 * @param aCsdtSoNo the new value for csdtSoNo
	 */
	public void setCsdtSoNo(String aCsdtSoNo) {
		csdtSoNo = aCsdtSoNo;
	}

	/**
	 * Access method for csdtMachineSerialNumber.
	 *
	 * @return the current value of csdtMachineSerialNumber
	 */
	public String getCsdtMachineSerialNumber() {
		return csdtMachineSerialNumber;
	}

	/**
	 * Setter method for csdtMachineSerialNumber.
	 *
	 * @param aCsdtMachineSerialNumber the new value for csdtMachineSerialNumber
	 */
	public void setCsdtMachineSerialNumber(String aCsdtMachineSerialNumber) {
		csdtMachineSerialNumber = aCsdtMachineSerialNumber;
	}

	/**
	 * Access method for csdtMachineType.
	 *
	 * @return the current value of csdtMachineType
	 */
	public String getCsdtMachineType() {
		return csdtMachineType;
	}

	/**
	 * Setter method for csdtMachineType.
	 *
	 * @param aCsdtMachineType the new value for csdtMachineType
	 */
	public void setCsdtMachineType(String aCsdtMachineType) {
		csdtMachineType = aCsdtMachineType;
	}

	/**
	 * Access method for csdtModel.
	 *
	 * @return the current value of csdtModel
	 */
	public String getCsdtModel() {
		return csdtModel;
	}

	/**
	 * Setter method for csdtModel.
	 *
	 * @param aCsdtModel the new value for csdtModel
	 */
	public void setCsdtModel(String aCsdtModel) {
		csdtModel = aCsdtModel;
	}

	/**
	 * Access method for csdtProductLine.
	 *
	 * @return the current value of csdtProductLine
	 */
	public String getCsdtProductLine() {
		return csdtProductLine;
	}

	/**
	 * Setter method for csdtProductLine.
	 *
	 * @param aCsdtProductLine the new value for csdtProductLine
	 */
	public void setCsdtProductLine(String aCsdtProductLine) {
		csdtProductLine = aCsdtProductLine;
	}

	/**
	 * Access method for csdtRequestedBy.
	 *
	 * @return the current value of csdtRequestedBy
	 */
	public String getCsdtRequestedBy() {
		return csdtRequestedBy;
	}

	/**
	 * Setter method for csdtRequestedBy.
	 *
	 * @param aCsdtRequestedBy the new value for csdtRequestedBy
	 */
	public void setCsdtRequestedBy(String aCsdtRequestedBy) {
		csdtRequestedBy = aCsdtRequestedBy;
	}

	/**
	 * Access method for csdtRequestDate.
	 *
	 * @return the current value of csdtRequestDate
	 */
	public Date getCsdtRequestDate() {
		return csdtRequestDate;
	}

	/**
	 * Setter method for csdtRequestDate.
	 *
	 * @param aCsdtRequestDate the new value for csdtRequestDate
	 */
	public void setCsdtRequestDate(Date aCsdtRequestDate) {
		csdtRequestDate = aCsdtRequestDate;
	}

	/**
	 * Access method for csdtRequestTime.
	 *
	 * @return the current value of csdtRequestTime
	 */
	public Time getCsdtRequestTime() {
		return csdtRequestTime;
	}

	/**
	 * Setter method for csdtRequestTime.
	 *
	 * @param aCsdtRequestTime the new value for csdtRequestTime
	 */
	public void setCsdtRequestTime(Time aCsdtRequestTime) {
		csdtRequestTime = aCsdtRequestTime;
	}

	/**
	 * Access method for csdtRegion.
	 *
	 * @return the current value of csdtRegion
	 */
	public String getCsdtRegion() {
		return csdtRegion;
	}

	/**
	 * Setter method for csdtRegion.
	 *
	 * @param aCsdtRegion the new value for csdtRegion
	 */
	public void setCsdtRegion(String aCsdtRegion) {
		csdtRegion = aCsdtRegion;
	}

	/**
	 * Access method for csdtCountryCode.
	 *
	 * @return the current value of csdtCountryCode
	 */
	public String getCsdtCountryCode() {
		return csdtCountryCode;
	}

	/**
	 * Setter method for csdtCountryCode.
	 *
	 * @param aCsdtCountryCode the new value for csdtCountryCode
	 */
	public void setCsdtCountryCode(String aCsdtCountryCode) {
		csdtCountryCode = aCsdtCountryCode;
	}

	/**
	 * Access method for csdtCity.
	 *
	 * @return the current value of csdtCity
	 */
	public String getCsdtCity() {
		return csdtCity;
	}

	/**
	 * Setter method for csdtCity.
	 *
	 * @param aCsdtCity the new value for csdtCity
	 */
	public void setCsdtCity(String aCsdtCity) {
		csdtCity = aCsdtCity;
	}

	/**
	 * Access method for csdtDiagnosticLog.
	 *
	 * @return the current value of csdtDiagnosticLog
	 */
	public String getCsdtDiagnosticLog() {
		return csdtDiagnosticLog;
	}

	/**
	 * Setter method for csdtDiagnosticLog.
	 *
	 * @param aCsdtDiagnosticLog the new value for csdtDiagnosticLog
	 */
	public void setCsdtDiagnosticLog(String aCsdtDiagnosticLog) {
		csdtDiagnosticLog = aCsdtDiagnosticLog;
	}

	/**
	 * Access method for csdtSnapshots.
	 *
	 * @return the current value of csdtSnapshots
	 */
	public String getCsdtSnapshots() {
		return csdtSnapshots;
	}

	/**
	 * Setter method for csdtSnapshots.
	 *
	 * @param aCsdtSnapshots the new value for csdtSnapshots
	 */
	public void setCsdtSnapshots(String aCsdtSnapshots) {
		csdtSnapshots = aCsdtSnapshots;
	}

	/**
	 * Access method for csdtHealhcheckLog.
	 *
	 * @return the current value of csdtHealhcheckLog
	 */
	public String getCsdtHealhcheckLog() {
		return csdtHealhcheckLog;
	}

	/**
	 * Setter method for csdtHealhcheckLog.
	 *
	 * @param aCsdtHealhcheckLog the new value for csdtHealhcheckLog
	 */
	public void setCsdtHealhcheckLog(String aCsdtHealhcheckLog) {
		csdtHealhcheckLog = aCsdtHealhcheckLog;
	}

	/**
	 * Access method for csdtServicecompletedBy.
	 *
	 * @return the current value of csdtServicecompletedBy
	 */
	public String getCsdtServicecompletedBy() {
		return csdtServicecompletedBy;
	}

	/**
	 * Setter method for csdtServicecompletedBy.
	 *
	 * @param aCsdtServicecompletedBy the new value for csdtServicecompletedBy
	 */
	public void setCsdtServicecompletedBy(String aCsdtServicecompletedBy) {
		csdtServicecompletedBy = aCsdtServicecompletedBy;
	}

	/**
	 * Access method for csdtStatus.
	 *
	 * @return the current value of csdtStatus
	 */
	public String getCsdtStatus() {
		return csdtStatus;
	}

	/**
	 * Setter method for csdtStatus.
	 *
	 * @param aCsdtStatus the new value for csdtStatus
	 */
	public void setCsdtStatus(String aCsdtStatus) {
		csdtStatus = aCsdtStatus;
	}

	/**
	 * Access method for csdtSyncCount.
	 *
	 * @return the current value of csdtSyncCount
	 */
	public String getCsdtSyncCount() {
		return csdtSyncCount;
	}

	/**
	 * Setter method for csdtSyncCount.
	 *
	 * @param aCsdtSyncCount the new value for csdtSyncCount
	 */
	public void setCsdtSyncCount(String aCsdtSyncCount) {
		csdtSyncCount = aCsdtSyncCount;
	}

	/**
	 * Access method for csdtLob.
	 *
	 * @return the current value of csdtLob
	 */
	public String getCsdtLob() {
		return csdtLob;
	}

	/**
	 * Setter method for csdtLob.
	 *
	 * @param aCsdtLob the new value for csdtLob
	 */
	public void setCsdtLob(String aCsdtLob) {
		csdtLob = aCsdtLob;
	}

	/**
	 * Access method for csdtSystemType.
	 *
	 * @return the current value of csdtSystemType
	 */
	public String getCsdtSystemType() {
		return csdtSystemType;
	}

	/**
	 * Setter method for csdtSystemType.
	 *
	 * @param aCsdtSystemType the new value for csdtSystemType
	 */
	public void setCsdtSystemType(String aCsdtSystemType) {
		csdtSystemType = aCsdtSystemType;
	}

	/**
	 * Access method for csdtFlowType.
	 *
	 * @return the current value of csdtFlowType
	 */
	public String getCsdtFlowType() {
		return csdtFlowType;
	}

	/**
	 * Setter method for csdtFlowType.
	 *
	 * @param aCsdtFlowType the new value for csdtFlowType
	 */
	public void setCsdtFlowType(String aCsdtFlowType) {
		csdtFlowType = aCsdtFlowType;
	}

	/**
	 * Access method for csdtMachineNoSyncStatus.
	 *
	 * @return the current value of csdtMachineNoSyncStatus
	 */
	public String getCsdtMachineNoSyncStatus() {
		return csdtMachineNoSyncStatus;
	}

	/**
	 * Setter method for csdtMachineNoSyncStatus.
	 *
	 * @param aCsdtMachineNoSyncStatus the new value for csdtMachineNoSyncStatus
	 */
	public void setCsdtMachineNoSyncStatus(String aCsdtMachineNoSyncStatus) {
		csdtMachineNoSyncStatus = aCsdtMachineNoSyncStatus;
	}

	/**
	 * Access method for csdtLastUpdated.
	 *
	 * @return the current value of csdtLastUpdated
	 */
	public Date getCsdtLastUpdated() {
		return csdtLastUpdated;
	}

	/**
	 * Setter method for csdtLastUpdated.
	 *
	 * @param aCsdtLastUpdated the new value for csdtLastUpdated
	 */
	public void setCsdtLastUpdated(Date aCsdtLastUpdated) {
		csdtLastUpdated = aCsdtLastUpdated;
	}

	/**
	 * Access method for csdtMtmNumber.
	 *
	 * @return the current value of csdtMtmNumber
	 */
	public String getCsdtMtmNumber() {
		return csdtMtmNumber;
	}

	/**
	 * Setter method for csdtMtmNumber.
	 *
	 * @param aCsdtMtmNumber the new value for csdtMtmNumber
	 */
	public void setCsdtMtmNumber(String aCsdtMtmNumber) {
		csdtMtmNumber = aCsdtMtmNumber;
	}

	/**
	 * Access method for csdtReason.
	 *
	 * @return the current value of csdtReason
	 */
	public String getCsdtReason() {
		return csdtReason;
	}

	/**
	 * Setter method for csdtReason.
	 *
	 * @param aCsdtReason the new value for csdtReason
	 */
	public void setCsdtReason(String aCsdtReason) {
		csdtReason = aCsdtReason;
	}

	/**
	 * Access method for csdtTrexStatus.
	 *
	 * @return the current value of csdtTrexStatus
	 */
	public String getCsdtTrexStatus() {
		return csdtTrexStatus;
	}

	/**
	 * Setter method for csdtTrexStatus.
	 *
	 * @param aCsdtTrexStatus the new value for csdtTrexStatus
	 */
	public void setCsdtTrexStatus(String aCsdtTrexStatus) {
		csdtTrexStatus = aCsdtTrexStatus;
	}

	/**
	 * Access method for csdtPriority.
	 *
	 * @return the current value of csdtPriority
	 */
	public String getCsdtPriority() {
		return csdtPriority;
	}

	/**
	 * Setter method for csdtPriority.
	 *
	 * @param aCsdtPriority the new value for csdtPriority
	 */
	public void setCsdtPriority(String aCsdtPriority) {
		csdtPriority = aCsdtPriority;
	}

	/**
	 * Access method for csdtCaseType.
	 *
	 * @return the current value of csdtCaseType
	 */
	public String getCsdtCaseType() {
		return csdtCaseType;
	}

	/**
	 * Setter method for csdtCaseType.
	 *
	 * @param aCsdtCaseType the new value for csdtCaseType
	 */
	public void setCsdtCaseType(String aCsdtCaseType) {
		csdtCaseType = aCsdtCaseType;
	}

	/**
	 * Access method for csdtCaseStatus.
	 *
	 * @return the current value of csdtCaseStatus
	 */
	public String getCsdtCaseStatus() {
		return csdtCaseStatus;
	}

	/**
	 * Setter method for csdtCaseStatus.
	 *
	 * @param aCsdtCaseStatus the new value for csdtCaseStatus
	 */
	public void setCsdtCaseStatus(String aCsdtCaseStatus) {
		csdtCaseStatus = aCsdtCaseStatus;
	}

	/**
	 * Access method for csdtAttachmentsFolderId.
	 *
	 * @return the current value of csdtAttachmentsFolderId
	 */
	public String getCsdtAttachmentsFolderId() {
		return csdtAttachmentsFolderId;
	}

	/**
	 * Setter method for csdtAttachmentsFolderId.
	 *
	 * @param aCsdtAttachmentsFolderId the new value for csdtAttachmentsFolderId
	 */
	public void setCsdtAttachmentsFolderId(String aCsdtAttachmentsFolderId) {
		csdtAttachmentsFolderId = aCsdtAttachmentsFolderId;
	}

	/**
	 * Access method for csdtRequestConfiramation.
	 *
	 * @return the current value of csdtRequestConfiramation
	 */
	public String getCsdtRequestConfiramation() {
		return csdtRequestConfiramation;
	}

	/**
	 * Setter method for csdtRequestConfiramation.
	 *
	 * @param aCsdtRequestConfiramation the new value for csdtRequestConfiramation
	 */
	public void setCsdtRequestConfiramation(String aCsdtRequestConfiramation) {
		csdtRequestConfiramation = aCsdtRequestConfiramation;
	}

	/**
	 * Access method for csdtComments.
	 *
	 * @return the current value of csdtComments
	 */
	public String getCsdtComments() {
		return csdtComments;
	}

	/**
	 * Setter method for csdtComments.
	 *
	 * @param aCsdtComments the new value for csdtComments
	 */
	public void setCsdtComments(String aCsdtComments) {
		csdtComments = aCsdtComments;
	}

	/**
	 * Access method for csdtBarCode.
	 *
	 * @return the current value of csdtBarCode
	 */
	public String getCsdtBarCode() {
		return csdtBarCode;
	}

	/**
	 * Setter method for csdtBarCode.
	 *
	 * @param aCsdtBarCode the new value for csdtBarCode
	 */
	public void setCsdtBarCode(String aCsdtBarCode) {
		csdtBarCode = aCsdtBarCode;
	}

	/**
	 * Access method for csdtPpId.
	 *
	 * @return the current value of csdtPpId
	 */
	public String getCsdtPpId() {
		return csdtPpId;
	}

	/**
	 * Setter method for csdtPpId.
	 *
	 * @param aCsdtPpId the new value for csdtPpId
	 */
	public void setCsdtPpId(String aCsdtPpId) {
		csdtPpId = aCsdtPpId;
	}

	/**
	 * Access method for csdtDiagnosticResult.
	 *
	 * @return the current value of csdtDiagnosticResult
	 */
	public String getCsdtDiagnosticResult() {
		return csdtDiagnosticResult;
	}

	/**
	 * Setter method for csdtDiagnosticResult.
	 *
	 * @param aCsdtDiagnosticResult the new value for csdtDiagnosticResult
	 */
	public void setCsdtDiagnosticResult(String aCsdtDiagnosticResult) {
		csdtDiagnosticResult = aCsdtDiagnosticResult;
	}

	/**
	 * Access method for csdtCustomerMentionedIssue.
	 *
	 * @return the current value of csdtCustomerMentionedIssue
	 */
	public String getCsdtCustomerMentionedIssue() {
		return csdtCustomerMentionedIssue;
	}

	/**
	 * Setter method for csdtCustomerMentionedIssue.
	 *
	 * @param aCsdtCustomerMentionedIssue the new value for
	 *                                    csdtCustomerMentionedIssue
	 */
	public void setCsdtCustomerMentionedIssue(String aCsdtCustomerMentionedIssue) {
		csdtCustomerMentionedIssue = aCsdtCustomerMentionedIssue;
	}

	/**
	 * Access method for csdtDiagProblem.
	 *
	 * @return the current value of csdtDiagProblem
	 */
	public String getCsdtDiagProblem() {
		return csdtDiagProblem;
	}

	/**
	 * Setter method for csdtDiagProblem.
	 *
	 * @param aCsdtDiagProblem the new value for csdtDiagProblem
	 */
	public void setCsdtDiagProblem(String aCsdtDiagProblem) {
		csdtDiagProblem = aCsdtDiagProblem;
	}

	/**
	 * Access method for csdtDiagCategory.
	 *
	 * @return the current value of csdtDiagCategory
	 */
	public String getCsdtDiagCategory() {
		return csdtDiagCategory;
	}

	/**
	 * Setter method for csdtDiagCategory.
	 *
	 * @param aCsdtDiagCategory the new value for csdtDiagCategory
	 */
	public void setCsdtDiagCategory(String aCsdtDiagCategory) {
		csdtDiagCategory = aCsdtDiagCategory;
	}

	/**
	 * Access method for csdtCommodityType.
	 *
	 * @return the current value of csdtCommodityType
	 */
	public String getCsdtCommodityType() {
		return csdtCommodityType;
	}

	/**
	 * Setter method for csdtCommodityType.
	 *
	 * @param aCsdtCommodityType the new value for csdtCommodityType
	 */
	public void setCsdtCommodityType(String aCsdtCommodityType) {
		csdtCommodityType = aCsdtCommodityType;
	}

	/**
	 * Access method for csdtDoaFailureType.
	 *
	 * @return the current value of csdtDoaFailureType
	 */
	public String getCsdtDoaFailureType() {
		return csdtDoaFailureType;
	}

	/**
	 * Setter method for csdtDoaFailureType.
	 *
	 * @param aCsdtDoaFailureType the new value for csdtDoaFailureType
	 */
	public void setCsdtDoaFailureType(String aCsdtDoaFailureType) {
		csdtDoaFailureType = aCsdtDoaFailureType;
	}

	/**
	 * Access method for csdtActionedDate.
	 *
	 * @return the current value of csdtActionedDate
	 */
	public Date getCsdtActionedDate() {
		return csdtActionedDate;
	}

	/**
	 * Setter method for csdtActionedDate.
	 *
	 * @param aCsdtActionedDate the new value for csdtActionedDate
	 */
	public void setCsdtActionedDate(Date aCsdtActionedDate) {
		csdtActionedDate = aCsdtActionedDate;
	}

	/**
	 * Access method for csdtActionTime.
	 *
	 * @return the current value of csdtActionTime
	 */
	public Time getCsdtActionTime() {
		return csdtActionTime;
	}

	/**
	 * Setter method for csdtActionTime.
	 *
	 * @param aCsdtActionTime the new value for csdtActionTime
	 */
	public void setCsdtActionTime(Time aCsdtActionTime) {
		csdtActionTime = aCsdtActionTime;
	}

	/**
	 * Access method for csdtActionedBy.
	 *
	 * @return the current value of csdtActionedBy
	 */
	public String getCsdtActionedBy() {
		return csdtActionedBy;
	}

	/**
	 * Setter method for csdtActionedBy.
	 *
	 * @param aCsdtActionedBy the new value for csdtActionedBy
	 */
	public void setCsdtActionedBy(String aCsdtActionedBy) {
		csdtActionedBy = aCsdtActionedBy;
	}

	/**
	 * Access method for csdtCcEmailId.
	 *
	 * @return the current value of csdtCcEmailId
	 */
	public String getCsdtCcEmailId() {
		return csdtCcEmailId;
	}

	/**
	 * Setter method for csdtCcEmailId.
	 *
	 * @param aCsdtCcEmailId the new value for csdtCcEmailId
	 */
	public void setCsdtCcEmailId(String aCsdtCcEmailId) {
		csdtCcEmailId = aCsdtCcEmailId;
	}

	/**
	 * Access method for csdtApprovalConfirmation.
	 *
	 * @return the current value of csdtApprovalConfirmation
	 */
	public String getCsdtApprovalConfirmation() {
		return csdtApprovalConfirmation;
	}

	/**
	 * Setter method for csdtApprovalConfirmation.
	 *
	 * @param aCsdtApprovalConfirmation the new value for csdtApprovalConfirmation
	 */
	public void setCsdtApprovalConfirmation(String aCsdtApprovalConfirmation) {
		csdtApprovalConfirmation = aCsdtApprovalConfirmation;
	}

	/**
	 * Access method for csdtUuId.
	 *
	 * @return the current value of csdtUuId
	 */
	public String getCsdtUuId() {
		return csdtUuId;
	}

	/**
	 * Setter method for csdtUuId.
	 *
	 * @param aCsdtUuId the new value for csdtUuId
	 */
	public void setCsdtUuId(String aCsdtUuId) {
		csdtUuId = aCsdtUuId;
	}

	/**
	 * Access method for csdtEngineerAttachmentFolderId.
	 *
	 * @return the current value of csdtEngineerAttachmentFolderId
	 */
	public String getCsdtEngineerAttachmentFolderId() {
		return csdtEngineerAttachmentFolderId;
	}

	/**
	 * Setter method for csdtEngineerAttachmentFolderId.
	 *
	 * @param aCsdtEngineerAttachmentFolderId the new value for
	 *                                        csdtEngineerAttachmentFolderId
	 */
	public void setCsdtEngineerAttachmentFolderId(String aCsdtEngineerAttachmentFolderId) {
		csdtEngineerAttachmentFolderId = aCsdtEngineerAttachmentFolderId;
	}

	/**
	 * Access method for csdtApproverAttachmentFolderId.
	 *
	 * @return the current value of csdtApproverAttachmentFolderId
	 */
	public String getCsdtApproverAttachmentFolderId() {
		return csdtApproverAttachmentFolderId;
	}

	/**
	 * Setter method for csdtApproverAttachmentFolderId.
	 *
	 * @param aCsdtApproverAttachmentFolderId the new value for
	 *                                        csdtApproverAttachmentFolderId
	 */
	public void setCsdtApproverAttachmentFolderId(String aCsdtApproverAttachmentFolderId) {
		csdtApproverAttachmentFolderId = aCsdtApproverAttachmentFolderId;
	}

	/**
	 * Access method for csdtApprovalType.
	 *
	 * @return the current value of csdtApprovalType
	 */
	public String getCsdtApprovalType() {
		return csdtApprovalType;
	}

	/**
	 * Setter method for csdtApprovalType.
	 *
	 * @param aCsdtApprovalType the new value for csdtApprovalType
	 */
	public void setCsdtApprovalType(String aCsdtApprovalType) {
		csdtApprovalType = aCsdtApprovalType;
	}

	/**
	 * Access method for csdtBarcodeReason.
	 *
	 * @return the current value of csdtBarcodeReason
	 */
	public String getCsdtBarcodeReason() {
		return csdtBarcodeReason;
	}

	/**
	 * Setter method for csdtBarcodeReason.
	 *
	 * @param aCsdtBarcodeReason the new value for csdtBarcodeReason
	 */
	public void setCsdtBarcodeReason(String aCsdtBarcodeReason) {
		csdtBarcodeReason = aCsdtBarcodeReason;
	}

	/**
	 * Access method for csdtServiceDeliveryType.
	 *
	 * @return the current value of csdtServiceDeliveryType
	 */
	public String getCsdtServiceDeliveryType() {
		return csdtServiceDeliveryType;
	}

	/**
	 * Setter method for csdtServiceDeliveryType.
	 *
	 * @param aCsdtServiceDeliveryType the new value for csdtServiceDeliveryType
	 */
	public void setCsdtServiceDeliveryType(String aCsdtServiceDeliveryType) {
		csdtServiceDeliveryType = aCsdtServiceDeliveryType;
	}

	/**
	 * Access method for csdtBarcodeQrCode.
	 *
	 * @return the current value of csdtBarcodeQrCode
	 */
	public String getCsdtBarcodeQrCode() {
		return csdtBarcodeQrCode;
	}

	/**
	 * Setter method for csdtBarcodeQrCode.
	 *
	 * @param aCsdtBarcodeQrCode the new value for csdtBarcodeQrCode
	 */
	public void setCsdtBarcodeQrCode(String aCsdtBarcodeQrCode) {
		csdtBarcodeQrCode = aCsdtBarcodeQrCode;
	}

	/**
	 * Access method for csdtRequiredPartFru.
	 *
	 * @return the current value of csdtRequiredPartFru
	 */
	public String getCsdtRequiredPartFru() {
		return csdtRequiredPartFru;
	}

	/**
	 * Setter method for csdtRequiredPartFru.
	 *
	 * @param aCsdtRequiredPartFru the new value for csdtRequiredPartFru
	 */
	public void setCsdtRequiredPartFru(String aCsdtRequiredPartFru) {
		csdtRequiredPartFru = aCsdtRequiredPartFru;
	}

	/**
	 * Access method for csdtRecivedPartFru.
	 *
	 * @return the current value of csdtRecivedPartFru
	 */
	public String getCsdtRecivedPartFru() {
		return csdtRecivedPartFru;
	}

	/**
	 * Setter method for csdtRecivedPartFru.
	 *
	 * @param aCsdtRecivedPartFru the new value for csdtRecivedPartFru
	 */
	public void setCsdtRecivedPartFru(String aCsdtRecivedPartFru) {
		csdtRecivedPartFru = aCsdtRecivedPartFru;
	}

	/**
	 * Access method for csdtIssueBeforeReplacingPart.
	 *
	 * @return the current value of csdtIssueBeforeReplacingPart
	 */
	public String getCsdtIssueBeforeReplacingPart() {
		return csdtIssueBeforeReplacingPart;
	}

	/**
	 * Setter method for csdtIssueBeforeReplacingPart.
	 *
	 * @param aCsdtIssueBeforeReplacingPart the new value for
	 *                                      csdtIssueBeforeReplacingPart
	 */
	public void setCsdtIssueBeforeReplacingPart(String aCsdtIssueBeforeReplacingPart) {
		csdtIssueBeforeReplacingPart = aCsdtIssueBeforeReplacingPart;
	}

	/**
	 * Access method for csdtIssueAfterReplacingPart.
	 *
	 * @return the current value of csdtIssueAfterReplacingPart
	 */
	public String getCsdtIssueAfterReplacingPart() {
		return csdtIssueAfterReplacingPart;
	}

	/**
	 * Setter method for csdtIssueAfterReplacingPart.
	 *
	 * @param aCsdtIssueAfterReplacingPart the new value for
	 *                                     csdtIssueAfterReplacingPart
	 */
	public void setCsdtIssueAfterReplacingPart(String aCsdtIssueAfterReplacingPart) {
		csdtIssueAfterReplacingPart = aCsdtIssueAfterReplacingPart;
	}

	/**
	 * Access method for csdtSwapabalePartNumber.
	 *
	 * @return the current value of csdtSwapabalePartNumber
	 */
	public String getCsdtSwapabalePartNumber() {
		return csdtSwapabalePartNumber;
	}

	/**
	 * Setter method for csdtSwapabalePartNumber.
	 *
	 * @param aCsdtSwapabalePartNumber the new value for csdtSwapabalePartNumber
	 */
	public void setCsdtSwapabalePartNumber(String aCsdtSwapabalePartNumber) {
		csdtSwapabalePartNumber = aCsdtSwapabalePartNumber;
	}

	/**
	 * Access method for csdtAddPartNameNumber.
	 *
	 * @return the current value of csdtAddPartNameNumber
	 */
	public String getCsdtAddPartNameNumber() {
		return csdtAddPartNameNumber;
	}

	/**
	 * Setter method for csdtAddPartNameNumber.
	 *
	 * @param aCsdtAddPartNameNumber the new value for csdtAddPartNameNumber
	 */
	public void setCsdtAddPartNameNumber(String aCsdtAddPartNameNumber) {
		csdtAddPartNameNumber = aCsdtAddPartNameNumber;
	}

	/**
	 * Access method for csdtTroubleShooting.
	 *
	 * @return the current value of csdtTroubleShooting
	 */
	public String getCsdtTroubleShooting() {
		return csdtTroubleShooting;
	}

	/**
	 * Setter method for csdtTroubleShooting.
	 *
	 * @param aCsdtTroubleShooting the new value for csdtTroubleShooting
	 */
	public void setCsdtTroubleShooting(String aCsdtTroubleShooting) {
		csdtTroubleShooting = aCsdtTroubleShooting;
	}

	/**
	 * Access method for csdtToolUsedToIdentifyAsDoa.
	 *
	 * @return the current value of csdtToolUsedToIdentifyAsDoa
	 */
	public String getCsdtToolUsedToIdentifyAsDoa() {
		return csdtToolUsedToIdentifyAsDoa;
	}

	/**
	 * Setter method for csdtToolUsedToIdentifyAsDoa.
	 *
	 * @param aCsdtToolUsedToIdentifyAsDoa the new value for
	 *                                     csdtToolUsedToIdentifyAsDoa
	 */
	public void setCsdtToolUsedToIdentifyAsDoa(String aCsdtToolUsedToIdentifyAsDoa) {
		csdtToolUsedToIdentifyAsDoa = aCsdtToolUsedToIdentifyAsDoa;
	}

	/**
	 * Access method for csdtCheckPoint.
	 *
	 * @return the current value of csdtCheckPoint
	 */
	public String getCsdtCheckPoint() {
		return csdtCheckPoint;
	}

	/**
	 * Setter method for csdtCheckPoint.
	 *
	 * @param aCsdtCheckPoint the new value for csdtCheckPoint
	 */
	public void setCsdtCheckPoint(String aCsdtCheckPoint) {
		csdtCheckPoint = aCsdtCheckPoint;
	}

	/**
	 * Access method for csdtEnggUserName.
	 *
	 * @return the current value of csdtEnggUserName
	 */
	public String getCsdtEnggUserName() {
		return csdtEnggUserName;
	}

	/**
	 * Setter method for csdtEnggUserName.
	 *
	 * @param aCsdtEnggUserName the new value for csdtEnggUserName
	 */
	public void setCsdtEnggUserName(String aCsdtEnggUserName) {
		csdtEnggUserName = aCsdtEnggUserName;
	}

	/**
	 * Access method for csdtFsToolIncidentNumber.
	 *
	 * @return the current value of csdtFsToolIncidentNumber
	 */
	public String getCsdtFsToolIncidentNumber() {
		return csdtFsToolIncidentNumber;
	}

	/**
	 * Setter method for csdtFsToolIncidentNumber.
	 *
	 * @param aCsdtFsToolIncidentNumber the new value for csdtFsToolIncidentNumber
	 */
	public void setCsdtFsToolIncidentNumber(String aCsdtFsToolIncidentNumber) {
		csdtFsToolIncidentNumber = aCsdtFsToolIncidentNumber;
	}

	/**
	 * Access method for csdtAssignTo.
	 *
	 * @return the current value of csdtAssignTo
	 */
	public String getCsdtAssignTo() {
		return csdtAssignTo;
	}

	/**
	 * Setter method for csdtAssignTo.
	 *
	 * @param aCsdtAssignTo the new value for csdtAssignTo
	 */
	public void setCsdtAssignTo(String aCsdtAssignTo) {
		csdtAssignTo = aCsdtAssignTo;
	}

	/**
	 * Access method for csdtCcComments.
	 *
	 * @return the current value of csdtCcComments
	 */
	public String getCsdtCcComments() {
		return csdtCcComments;
	}

	/**
	 * Setter method for csdtCcComments.
	 *
	 * @param aCsdtCcComments the new value for csdtCcComments
	 */
	public void setCsdtCcComments(String aCsdtCcComments) {
		csdtCcComments = aCsdtCcComments;
	}

	/**
	 * Access method for csdtNotificationStatus.
	 *
	 * @return the current value of csdtNotificationStatus
	 */
	public String getCsdtNotificationStatus() {
		return csdtNotificationStatus;
	}

	/**
	 * Setter method for csdtNotificationStatus.
	 *
	 * @param aCsdtNotificationStatus the new value for csdtNotificationStatus
	 */
	public void setCsdtNotificationStatus(String aCsdtNotificationStatus) {
		csdtNotificationStatus = aCsdtNotificationStatus;
	}

	/**
	 * Access method for csdtNeedApproval.
	 *
	 * @return the current value of csdtNeedApproval
	 */
	public String getCsdtNeedApproval() {
		return csdtNeedApproval;
	}

	/**
	 * Setter method for csdtNeedApproval.
	 *
	 * @param aCsdtNeedApproval the new value for csdtNeedApproval
	 */
	public void setCsdtNeedApproval(String aCsdtNeedApproval) {
		csdtNeedApproval = aCsdtNeedApproval;
	}

	/**
	 * Access method for csdtReminder.
	 *
	 * @return the current value of csdtReminder
	 */
	public int getCsdtReminder() {
		return csdtReminder;
	}

	/**
	 * Setter method for csdtReminder.
	 *
	 * @param aCsdtReminder the new value for csdtReminder
	 */
	public void setCsdtReminder(int aCsdtReminder) {
		csdtReminder = aCsdtReminder;
	}

	/**
	 * Access method for csdtDoaType.
	 *
	 * @return the current value of csdtDoaType
	 */
	public String getCsdtDoaType() {
		return csdtDoaType;
	}

	/**
	 * Setter method for csdtDoaType.
	 *
	 * @param aCsdtDoaType the new value for csdtDoaType
	 */
	public void setCsdtDoaType(String aCsdtDoaType) {
		csdtDoaType = aCsdtDoaType;
	}

	/**
	 * Access method for csdtAddIssue.
	 *
	 * @return the current value of csdtAddIssue
	 */
	public String getCsdtAddIssue() {
		return csdtAddIssue;
	}

	/**
	 * Setter method for csdtAddIssue.
	 *
	 * @param aCsdtAddIssue the new value for csdtAddIssue
	 */
	public void setCsdtAddIssue(String aCsdtAddIssue) {
		csdtAddIssue = aCsdtAddIssue;
	}

	/**
	 * Access method for csdtCustomerName.
	 *
	 * @return the current value of csdtCustomerName
	 */
	public String getCsdtCustomerName() {
		return csdtCustomerName;
	}

	/**
	 * Setter method for csdtCustomerName.
	 *
	 * @param aCsdtCustomerName the new value for csdtCustomerName
	 */
	public void setCsdtCustomerName(String aCsdtCustomerName) {
		csdtCustomerName = aCsdtCustomerName;
	}

	/**
	 * Access method for csdtCustomerContact.
	 *
	 * @return the current value of csdtCustomerContact
	 */
	public String getCsdtCustomerContact() {
		return csdtCustomerContact;
	}

	/**
	 * Setter method for csdtCustomerContact.
	 *
	 * @param aCsdtCustomerContact the new value for csdtCustomerContact
	 */
	public void setCsdtCustomerContact(String aCsdtCustomerContact) {
		csdtCustomerContact = aCsdtCustomerContact;
	}

	/**
	 * Access method for csdtCustomerEmail.
	 *
	 * @return the current value of csdtCustomerEmail
	 */
	public String getCsdtCustomerEmail() {
		return csdtCustomerEmail;
	}

	/**
	 * Setter method for csdtCustomerEmail.
	 *
	 * @param aCsdtCustomerEmail the new value for csdtCustomerEmail
	 */
	public void setCsdtCustomerEmail(String aCsdtCustomerEmail) {
		csdtCustomerEmail = aCsdtCustomerEmail;
	}

	/**
	 * Access method for csdtIws.
	 *
	 * @return the current value of csdtIws
	 */
	public String getCsdtIws() {
		return csdtIws;
	}

	/**
	 * Setter method for csdtIws.
	 *
	 * @param aCsdtIws the new value for csdtIws
	 */
	public void setCsdtIws(String aCsdtIws) {
		csdtIws = aCsdtIws;
	}

	/**
	 * Compares the key for this instance with another TblRsvlCasedetails.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class TblRsvlCasedetails and the
	 *         key objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RaiseRequestEntity)) {
			return false;
		}
		RaiseRequestEntity that = (RaiseRequestEntity) other;
		Object myCsdtTicketNumber = this.getCsdtTicketNumber();
		Object yourCsdtTicketNumber = that.getCsdtTicketNumber();
		if (myCsdtTicketNumber == null ? yourCsdtTicketNumber != null
				: !myCsdtTicketNumber.equals(yourCsdtTicketNumber)) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another TblRsvlCasedetails.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof RaiseRequestEntity))
			return false;
		return this.equalKeys(other) && ((RaiseRequestEntity) other).equalKeys(this);
	}

	/**
	 * Returns a hash code for this instance.
	 *
	 * @return Hash code
	 */
	@Override
	public int hashCode() {
		int i;
		int result = 17;
		if (getCsdtTicketNumber() == null) {
			i = 0;
		} else {
			i = getCsdtTicketNumber().hashCode();
		}
		result = 37 * result + i;
		return result;
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[TblRsvlCasedetails |");
		sb.append(" csdtTicketNumber=").append(getCsdtTicketNumber());
		sb.append("]");
		return sb.toString();
	}

	/**
	 * Return all elements of the primary key.
	 *
	 * @return Map of key names to values
	 */
	public Map<String, Object> getPrimaryKey() {
		Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
		ret.put("csdtTicketNumber", getCsdtTicketNumber());
		return ret;
	}

}
