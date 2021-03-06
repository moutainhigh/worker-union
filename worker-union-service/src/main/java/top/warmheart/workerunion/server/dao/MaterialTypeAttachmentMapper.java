package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;
import top.warmheart.workerunion.server.model.MaterialTypeAttachment;

public interface MaterialTypeAttachmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_type_attachment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_type_attachment
     *
     * @mbg.generated
     */
    int insert(MaterialTypeAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_type_attachment
     *
     * @mbg.generated
     */
    MaterialTypeAttachment selectByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_type_attachment
     *
     * @mbg.generated
     */
    List<MaterialTypeAttachment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_type_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MaterialTypeAttachment record);

	int deleteById(BigInteger id);

	List<MaterialTypeAttachment> selectListByTypeId(BigInteger materialTypeId);
}