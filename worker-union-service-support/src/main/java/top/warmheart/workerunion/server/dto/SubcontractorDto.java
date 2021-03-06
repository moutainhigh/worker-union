package top.warmheart.workerunion.server.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 增加资质字段subcontractorQualificationName subcontractorQualificationId
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table subcontractor
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SubcontractorDto implements Serializable {
	private String subcontractorQualificationName;
	private BigInteger subcontractorQualificationId;
	
    public BigInteger getSubcontractorQualificationId() {
		return subcontractorQualificationId;
	}

	public void setSubcontractorQualificationId(BigInteger subcontractorQualificationId) {
		this.subcontractorQualificationId = subcontractorQualificationId;
	}

	public String getSubcontractorQualificationName() {
		return subcontractorQualificationName;
	}

	public void setSubcontractorQualificationName(String subcontractorQualificationName) {
		this.subcontractorQualificationName = subcontractorQualificationName;
	}

	/**
     * Database Column Remarks:
     *   分包商ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.id
     *
     * @mbg.generated
     */
    private BigInteger id;

    /**
     * Database Column Remarks:
     *   企业ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.company_id
     *
     * @mbg.generated
     */
    private BigInteger companyId;

    /**
     * Database Column Remarks:
     *   供应商名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   供应商编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.num
     *
     * @mbg.generated
     */
    private String num;

    /**
     * Database Column Remarks:
     *   分包商级别ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.subcontractor_grade_id
     *
     * @mbg.generated
     */
    private BigInteger subcontractorGradeId;

    /**
     * Database Column Remarks:
     *   分包商级别名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.subcontractor_grade_name
     *
     * @mbg.generated
     */
    private String subcontractorGradeName;

    /**
     * Database Column Remarks:
     *   合作年限
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.valid_date
     *
     * @mbg.generated
     */
    private Date validDate;

    /**
     * Database Column Remarks:
     *   联系人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.contact_person
     *
     * @mbg.generated
     */
    private String contactPerson;

    /**
     * Database Column Remarks:
     *   联系方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.contact_phone
     *
     * @mbg.generated
     */
    private String contactPhone;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.cst_create
     *
     * @mbg.generated
     */
    private Date cstCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.cst_modified
     *
     * @mbg.generated
     */
    private Date cstModified;

    /**
     * Database Column Remarks:
     *   删除标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcontractor.is_del
     *
     * @mbg.generated
     */
    private Boolean del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subcontractor
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.id
     *
     * @return the value of subcontractor.id
     *
     * @mbg.generated
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.id
     *
     * @param id the value for subcontractor.id
     *
     * @mbg.generated
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.company_id
     *
     * @return the value of subcontractor.company_id
     *
     * @mbg.generated
     */
    public BigInteger getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.company_id
     *
     * @param companyId the value for subcontractor.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.name
     *
     * @return the value of subcontractor.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.name
     *
     * @param name the value for subcontractor.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.num
     *
     * @return the value of subcontractor.num
     *
     * @mbg.generated
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.num
     *
     * @param num the value for subcontractor.num
     *
     * @mbg.generated
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.subcontractor_grade_id
     *
     * @return the value of subcontractor.subcontractor_grade_id
     *
     * @mbg.generated
     */
    public BigInteger getSubcontractorGradeId() {
        return subcontractorGradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.subcontractor_grade_id
     *
     * @param subcontractorGradeId the value for subcontractor.subcontractor_grade_id
     *
     * @mbg.generated
     */
    public void setSubcontractorGradeId(BigInteger subcontractorGradeId) {
        this.subcontractorGradeId = subcontractorGradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.subcontractor_grade_name
     *
     * @return the value of subcontractor.subcontractor_grade_name
     *
     * @mbg.generated
     */
    public String getSubcontractorGradeName() {
        return subcontractorGradeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.subcontractor_grade_name
     *
     * @param subcontractorGradeName the value for subcontractor.subcontractor_grade_name
     *
     * @mbg.generated
     */
    public void setSubcontractorGradeName(String subcontractorGradeName) {
        this.subcontractorGradeName = subcontractorGradeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.valid_date
     *
     * @return the value of subcontractor.valid_date
     *
     * @mbg.generated
     */
    public Date getValidDate() {
        return validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.valid_date
     *
     * @param validDate the value for subcontractor.valid_date
     *
     * @mbg.generated
     */
    public void setValidDate(String validDate) throws ParseException {
        this.validDate = new SimpleDateFormat("yyyy-MM-dd").parse(validDate);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.contact_person
     *
     * @return the value of subcontractor.contact_person
     *
     * @mbg.generated
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.contact_person
     *
     * @param contactPerson the value for subcontractor.contact_person
     *
     * @mbg.generated
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.contact_phone
     *
     * @return the value of subcontractor.contact_phone
     *
     * @mbg.generated
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.contact_phone
     *
     * @param contactPhone the value for subcontractor.contact_phone
     *
     * @mbg.generated
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.cst_create
     *
     * @return the value of subcontractor.cst_create
     *
     * @mbg.generated
     */
    public Date getCstCreate() {
        return cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.cst_create
     *
     * @param cstCreate the value for subcontractor.cst_create
     *
     * @mbg.generated
     */
    public void setCstCreate(Date cstCreate) {
        this.cstCreate = cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.cst_modified
     *
     * @return the value of subcontractor.cst_modified
     *
     * @mbg.generated
     */
    public Date getCstModified() {
        return cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.cst_modified
     *
     * @param cstModified the value for subcontractor.cst_modified
     *
     * @mbg.generated
     */
    public void setCstModified(Date cstModified) {
        this.cstModified = cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcontractor.is_del
     *
     * @return the value of subcontractor.is_del
     *
     * @mbg.generated
     */
    public Boolean getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcontractor.is_del
     *
     * @param del the value for subcontractor.is_del
     *
     * @mbg.generated
     */
    public void setDel(Boolean del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subcontractor
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", name=").append(name);
        sb.append(", num=").append(num);
        sb.append(", subcontractorGradeId=").append(subcontractorGradeId);
        sb.append(", subcontractorGradeName=").append(subcontractorGradeName);
        sb.append(", validDate=").append(validDate);
        sb.append(", contactPerson=").append(contactPerson);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", subcontractorQualificationId=").append(subcontractorQualificationId);
        sb.append(", subcontractorQualificationName=").append(subcontractorQualificationName);
        sb.append(", cstCreate=").append(cstCreate);
        sb.append(", cstModified=").append(cstModified);
        sb.append(", del=").append(del);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}