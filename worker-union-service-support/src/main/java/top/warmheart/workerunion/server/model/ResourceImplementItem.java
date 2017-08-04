package top.warmheart.workerunion.server.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table resource_implement_item
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ResourceImplementItem implements Serializable {
    /**
     * Database Column Remarks:
     *   资源落实项ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.id
     *
     * @mbg.generated
     */
    private BigInteger id;

    /**
     * Database Column Remarks:
     *   企业ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.company_id
     *
     * @mbg.generated
     */
    private BigInteger companyId;

    /**
     * Database Column Remarks:
     *   项目ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.project_id
     *
     * @mbg.generated
     */
    private BigInteger projectId;

    /**
     * Database Column Remarks:
     *   资金计划项ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.fund_plan_item_id
     *
     * @mbg.generated
     */
    private BigInteger fundPlanItemId;

    /**
     * Database Column Remarks:
     *   分包商ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.subcontractor_id
     *
     * @mbg.generated
     */
    private BigInteger subcontractorId;

    /**
     * Database Column Remarks:
     *   分包商名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.subcontractor_name
     *
     * @mbg.generated
     */
    private String subcontractorName;

    /**
     * Database Column Remarks:
     *   采购条目ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.purchase_item_id
     *
     * @mbg.generated
     */
    private BigInteger purchaseItemId;

    /**
     * Database Column Remarks:
     *   采购条目名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.purchase_item_name
     *
     * @mbg.generated
     */
    private String purchaseItemName;

    /**
     * Database Column Remarks:
     *   关联合同ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.contract_id
     *
     * @mbg.generated
     */
    private BigInteger contractId;

    /**
     * Database Column Remarks:
     *   合同名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.contract_name
     *
     * @mbg.generated
     */
    private String contractName;

    /**
     * Database Column Remarks:
     *   合同编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.contract_num
     *
     * @mbg.generated
     */
    private String contractNum;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   单位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     * Database Column Remarks:
     *   单价（单位：元）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   实际金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.cst_create
     *
     * @mbg.generated
     */
    private Date cstCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_implement_item.cst_modified
     *
     * @mbg.generated
     */
    private Date cstModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resource_implement_item
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.id
     *
     * @return the value of resource_implement_item.id
     *
     * @mbg.generated
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.id
     *
     * @param id the value for resource_implement_item.id
     *
     * @mbg.generated
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.company_id
     *
     * @return the value of resource_implement_item.company_id
     *
     * @mbg.generated
     */
    public BigInteger getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.company_id
     *
     * @param companyId the value for resource_implement_item.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.project_id
     *
     * @return the value of resource_implement_item.project_id
     *
     * @mbg.generated
     */
    public BigInteger getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.project_id
     *
     * @param projectId the value for resource_implement_item.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(BigInteger projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.fund_plan_item_id
     *
     * @return the value of resource_implement_item.fund_plan_item_id
     *
     * @mbg.generated
     */
    public BigInteger getFundPlanItemId() {
        return fundPlanItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.fund_plan_item_id
     *
     * @param fundPlanItemId the value for resource_implement_item.fund_plan_item_id
     *
     * @mbg.generated
     */
    public void setFundPlanItemId(BigInteger fundPlanItemId) {
        this.fundPlanItemId = fundPlanItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.subcontractor_id
     *
     * @return the value of resource_implement_item.subcontractor_id
     *
     * @mbg.generated
     */
    public BigInteger getSubcontractorId() {
        return subcontractorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.subcontractor_id
     *
     * @param subcontractorId the value for resource_implement_item.subcontractor_id
     *
     * @mbg.generated
     */
    public void setSubcontractorId(BigInteger subcontractorId) {
        this.subcontractorId = subcontractorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.subcontractor_name
     *
     * @return the value of resource_implement_item.subcontractor_name
     *
     * @mbg.generated
     */
    public String getSubcontractorName() {
        return subcontractorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.subcontractor_name
     *
     * @param subcontractorName the value for resource_implement_item.subcontractor_name
     *
     * @mbg.generated
     */
    public void setSubcontractorName(String subcontractorName) {
        this.subcontractorName = subcontractorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.purchase_item_id
     *
     * @return the value of resource_implement_item.purchase_item_id
     *
     * @mbg.generated
     */
    public BigInteger getPurchaseItemId() {
        return purchaseItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.purchase_item_id
     *
     * @param purchaseItemId the value for resource_implement_item.purchase_item_id
     *
     * @mbg.generated
     */
    public void setPurchaseItemId(BigInteger purchaseItemId) {
        this.purchaseItemId = purchaseItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.purchase_item_name
     *
     * @return the value of resource_implement_item.purchase_item_name
     *
     * @mbg.generated
     */
    public String getPurchaseItemName() {
        return purchaseItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.purchase_item_name
     *
     * @param purchaseItemName the value for resource_implement_item.purchase_item_name
     *
     * @mbg.generated
     */
    public void setPurchaseItemName(String purchaseItemName) {
        this.purchaseItemName = purchaseItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.contract_id
     *
     * @return the value of resource_implement_item.contract_id
     *
     * @mbg.generated
     */
    public BigInteger getContractId() {
        return contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.contract_id
     *
     * @param contractId the value for resource_implement_item.contract_id
     *
     * @mbg.generated
     */
    public void setContractId(BigInteger contractId) {
        this.contractId = contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.contract_name
     *
     * @return the value of resource_implement_item.contract_name
     *
     * @mbg.generated
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.contract_name
     *
     * @param contractName the value for resource_implement_item.contract_name
     *
     * @mbg.generated
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.contract_num
     *
     * @return the value of resource_implement_item.contract_num
     *
     * @mbg.generated
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.contract_num
     *
     * @param contractNum the value for resource_implement_item.contract_num
     *
     * @mbg.generated
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.name
     *
     * @return the value of resource_implement_item.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.name
     *
     * @param name the value for resource_implement_item.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.unit
     *
     * @return the value of resource_implement_item.unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.unit
     *
     * @param unit the value for resource_implement_item.unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.price
     *
     * @return the value of resource_implement_item.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.price
     *
     * @param price the value for resource_implement_item.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.amount
     *
     * @return the value of resource_implement_item.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.amount
     *
     * @param amount the value for resource_implement_item.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.money
     *
     * @return the value of resource_implement_item.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.money
     *
     * @param money the value for resource_implement_item.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.cst_create
     *
     * @return the value of resource_implement_item.cst_create
     *
     * @mbg.generated
     */
    public Date getCstCreate() {
        return cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.cst_create
     *
     * @param cstCreate the value for resource_implement_item.cst_create
     *
     * @mbg.generated
     */
    public void setCstCreate(Date cstCreate) {
        this.cstCreate = cstCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_implement_item.cst_modified
     *
     * @return the value of resource_implement_item.cst_modified
     *
     * @mbg.generated
     */
    public Date getCstModified() {
        return cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_implement_item.cst_modified
     *
     * @param cstModified the value for resource_implement_item.cst_modified
     *
     * @mbg.generated
     */
    public void setCstModified(Date cstModified) {
        this.cstModified = cstModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_implement_item
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
        sb.append(", projectId=").append(projectId);
        sb.append(", fundPlanItemId=").append(fundPlanItemId);
        sb.append(", subcontractorId=").append(subcontractorId);
        sb.append(", subcontractorName=").append(subcontractorName);
        sb.append(", purchaseItemId=").append(purchaseItemId);
        sb.append(", purchaseItemName=").append(purchaseItemName);
        sb.append(", contractId=").append(contractId);
        sb.append(", contractName=").append(contractName);
        sb.append(", contractNum=").append(contractNum);
        sb.append(", name=").append(name);
        sb.append(", unit=").append(unit);
        sb.append(", price=").append(price);
        sb.append(", amount=").append(amount);
        sb.append(", money=").append(money);
        sb.append(", cstCreate=").append(cstCreate);
        sb.append(", cstModified=").append(cstModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}