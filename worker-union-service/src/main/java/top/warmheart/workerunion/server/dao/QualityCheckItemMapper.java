package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.QualityCheckItemDto;
import top.warmheart.workerunion.server.model.QualityCheckItem;

public interface QualityCheckItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_check_item
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_check_item
     *
     * @mbg.generated
     */
    int insert(QualityCheckItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_check_item
     *
     * @mbg.generated
     */
    QualityCheckItem selectByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_check_item
     *
     * @mbg.generated
     */
    List<QualityCheckItem> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_check_item
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QualityCheckItem record);

	Integer countByProjectId(BigInteger projectId);

	List<QualityCheckItem> pageByProjectId(@Param("projectId")BigInteger projectId,@Param("page") Page<?> page);

	int deleteById(BigInteger id);

	List<QualityCheckItemDto> selectListByCompanyAndStatus(@Param("companyId")BigInteger companyId,@Param("rectifyStatus") String rectifyStatus);
}