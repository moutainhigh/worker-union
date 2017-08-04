package top.warmheart.workerunion.server.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator. This class corresponds to the
 * database table attachment
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Attachment implements Serializable {
	/** 类型-中标通知书 */
	public static final String TYPE_LETTER_OF_ACCEPTANCE = "LETTER_OF_ACCEPTANCE";
	/** 类型-成本分析表 */
	public static final String TYPE_COST_ANALYSIS = "COST_ANALYSIS";
	/** 类型-目标协议书 */
	public static final String TYPE_AGREEMENT_OF_TARGET = "AGREEMENT_OF_TARGET";
	/** 类型-合同备案表 */
	public static final String TYPE_CONTRACT_RECORD = "CONTRACT_RECORD";
	/** 类型-质检通知书 */
	public static final String TYPE_QUALITY_INSPECT_NOTICE = "QUALITY_INSPECT_NOTICE";
	/** 类型-安监登记表 */
	public static final String TYPE_SAFETY_SUPERVISION_FORM = "SAFETY_SUPERVISION_FORM";
	/** 类型-施工许可证 */
	public static final String TYPE_CONSTRUCTION_PERMIT = "CONSTRUCTION_PERMIT";
	/** 类型-方案深化表 */
	public static final String TYPE_SCHEME_DEEPEN = "SCHEME_DEEPEN";
	/** 类型-成本深化表 */
	public static final String TYPE_COST_ANALYSIS_DEEPEN = "COST_ANALYSIS_DEEPEN";
	/** 类型-经营管理产值文件 */
	public static final String TYPE_BUSINESS_CAPACITY_FILE = "BUSINESS_CAPACITY_FILE";
	/** 类型-生产管理产值文件 */
	public static final String TYPE_PRODUCT_CAPACITY_FILE = "PRODUCT_CAPACITY_FILE";
	/** 类型-技术方案 */
	public static final String TYPE_TECHNICAL_PROPOSAL = "TECHNICAL_PROPOSAL";
	/** 类型-结算文件 */
	public static final String TYPE_SETTLEMENT_FILE = "SETTLEMENT_FILE";
	/** 类型-内部结算文件 */
	public static final String TYPE_INTERNAL_SETTLEMENT_FILE = "INTERNAL_SETTLEMENT_FILE";
	/** 类型-竣工资料 */
	public static final String TYPE_COMPLETION_DATA = "COMPLETION_DATA";
	/** 类型-总结报告 */
	public static final String TYPE_FINAL_REPORT = "FINAL_REPORT";
	/** 类型-团队搭建 */
	public static final String TYPE_PROJECT_TEAM = "PROJECT_TEAM";
	/**
	 * Database Column Remarks: 附件ID
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.id
	 *
	 * @mbg.generated
	 */
	private BigInteger id;

	/**
	 * Database Column Remarks: 创建人
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.staff_id
	 *
	 * @mbg.generated
	 */
	private BigInteger staffId;

	/**
	 * Database Column Remarks: 企业ID
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.company_id
	 *
	 * @mbg.generated
	 */
	private BigInteger companyId;

	/**
	 * Database Column Remarks: 项目ID
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.project_id
	 *
	 * @mbg.generated
	 */
	private BigInteger projectId;

	/**
	 * Database Column Remarks: 附件文件名
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.name
	 *
	 * @mbg.generated
	 */
	private String name;

	/**
	 * Database Column Remarks: 文件contentType属性
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.content_type
	 *
	 * @mbg.generated
	 */
	private String contentType;

	/**
	 * Database Column Remarks: 文件尺寸（字节）
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.size
	 *
	 * @mbg.generated
	 */
	private BigInteger size;

	/**
	 * Database Column Remarks: 文件路径
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.path
	 *
	 * @mbg.generated
	 */
	private String path;

	/**
	 * Database Column Remarks:
	 * 附件类型（中标通知书：LETTER_OF_ACCEPTANCE，成本分析表：COST_ANALYSIS
	 * ，目标协议书：AGREEMENT_OF_TARGET
	 * ，合同备案表：CONTRACT_RECORD，质检通知书：QUALITY_INSPECT_NOTICE
	 * ，安监登记表：SAFETY_SUPERVISION_FORM，施工许可证：CONSTRUCTION_PERMIT）
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.type
	 *
	 * @mbg.generated
	 */
	private String type;

	/**
	 * Database Column Remarks: 创建人姓名
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.staff_name
	 *
	 * @mbg.generated
	 */
	private String staffName;

	/**
	 * Database Column Remarks: 创建时间
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.cst_create
	 *
	 * @mbg.generated
	 */
	private Date cstCreate;

	/**
	 * Database Column Remarks: 修改时间
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.cst_modified
	 *
	 * @mbg.generated
	 */
	private Date cstModified;

	/**
	 * Database Column Remarks: 删除标识
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column attachment.is_del
	 *
	 * @mbg.generated
	 */
	private Boolean del;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table attachment
	 *
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.id
	 *
	 * @return the value of attachment.id
	 *
	 * @mbg.generated
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.id
	 *
	 * @param id
	 *            the value for attachment.id
	 *
	 * @mbg.generated
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.staff_id
	 *
	 * @return the value of attachment.staff_id
	 *
	 * @mbg.generated
	 */
	public BigInteger getStaffId() {
		return staffId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.staff_id
	 *
	 * @param staffId
	 *            the value for attachment.staff_id
	 *
	 * @mbg.generated
	 */
	public void setStaffId(BigInteger staffId) {
		this.staffId = staffId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.company_id
	 *
	 * @return the value of attachment.company_id
	 *
	 * @mbg.generated
	 */
	public BigInteger getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.company_id
	 *
	 * @param companyId
	 *            the value for attachment.company_id
	 *
	 * @mbg.generated
	 */
	public void setCompanyId(BigInteger companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.project_id
	 *
	 * @return the value of attachment.project_id
	 *
	 * @mbg.generated
	 */
	public BigInteger getProjectId() {
		return projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.project_id
	 *
	 * @param projectId
	 *            the value for attachment.project_id
	 *
	 * @mbg.generated
	 */
	public void setProjectId(BigInteger projectId) {
		this.projectId = projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.name
	 *
	 * @return the value of attachment.name
	 *
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.name
	 *
	 * @param name
	 *            the value for attachment.name
	 *
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.content_type
	 *
	 * @return the value of attachment.content_type
	 *
	 * @mbg.generated
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.content_type
	 *
	 * @param contentType
	 *            the value for attachment.content_type
	 *
	 * @mbg.generated
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.size
	 *
	 * @return the value of attachment.size
	 *
	 * @mbg.generated
	 */
	public BigInteger getSize() {
		return size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.size
	 *
	 * @param size
	 *            the value for attachment.size
	 *
	 * @mbg.generated
	 */
	public void setSize(BigInteger size) {
		this.size = size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.path
	 *
	 * @return the value of attachment.path
	 *
	 * @mbg.generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.path
	 *
	 * @param path
	 *            the value for attachment.path
	 *
	 * @mbg.generated
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.type
	 *
	 * @return the value of attachment.type
	 *
	 * @mbg.generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.type
	 *
	 * @param type
	 *            the value for attachment.type
	 *
	 * @mbg.generated
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.staff_name
	 *
	 * @return the value of attachment.staff_name
	 *
	 * @mbg.generated
	 */
	public String getStaffName() {
		return staffName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.staff_name
	 *
	 * @param staffName
	 *            the value for attachment.staff_name
	 *
	 * @mbg.generated
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.cst_create
	 *
	 * @return the value of attachment.cst_create
	 *
	 * @mbg.generated
	 */
	public Date getCstCreate() {
		return cstCreate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.cst_create
	 *
	 * @param cstCreate
	 *            the value for attachment.cst_create
	 *
	 * @mbg.generated
	 */
	public void setCstCreate(Date cstCreate) {
		this.cstCreate = cstCreate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.cst_modified
	 *
	 * @return the value of attachment.cst_modified
	 *
	 * @mbg.generated
	 */
	public Date getCstModified() {
		return cstModified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.cst_modified
	 *
	 * @param cstModified
	 *            the value for attachment.cst_modified
	 *
	 * @mbg.generated
	 */
	public void setCstModified(Date cstModified) {
		this.cstModified = cstModified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column attachment.is_del
	 *
	 * @return the value of attachment.is_del
	 *
	 * @mbg.generated
	 */
	public Boolean getDel() {
		return del;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column attachment.is_del
	 *
	 * @param del
	 *            the value for attachment.is_del
	 *
	 * @mbg.generated
	 */
	public void setDel(Boolean del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "Attachment [id=" + id + ", staffId=" + staffId + ", companyId=" + companyId + ", projectId="
				+ projectId + ", name=" + name + ", contentType=" + contentType + ", size=" + size + ", path=" + path
				+ ", type=" + type + ", staffName=" + staffName + ", cstCreate=" + cstCreate + ", cstModified="
				+ cstModified + ", del=" + del + ", hashCode()=" + hashCode() + "]";
	}

}