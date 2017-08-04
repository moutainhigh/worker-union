package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;
import top.warmheart.workerunion.server.model.CertificateAttachment;

public interface CertificateAttachmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table certificate_attachment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table certificate_attachment
     *
     * @mbg.generated
     */
    int insert(CertificateAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table certificate_attachment
     *
     * @mbg.generated
     */
    CertificateAttachment selectByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table certificate_attachment
     *
     * @mbg.generated
     */
    List<CertificateAttachment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table certificate_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CertificateAttachment record);

	int deleteById(BigInteger id);

	List<CertificateAttachment> selectListByCertificateId(BigInteger certificateId);
}