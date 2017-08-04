package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.BusinessCapacityItemDto;
import top.warmheart.workerunion.server.model.BusinessCapacityItem;

public interface BusinessCapacityItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_capacity_item
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_capacity_item
     *
     * @mbg.generated
     */
    int insert(BusinessCapacityItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_capacity_item
     *
     * @mbg.generated
     */
    BusinessCapacityItem selectByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_capacity_item
     *
     * @mbg.generated
     */
    List<BusinessCapacityItem> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_capacity_item
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BusinessCapacityItem record);

	BusinessCapacityItem selectByProjectYearMonth(@Param("projectId")BigInteger projectId,@Param("year") Integer year,@Param("month") Integer month);

	Integer countByProjectId(BigInteger projectId);

	List<BusinessCapacityItemDto> pageByProjectId(@Param("projectId")BigInteger projectId,@Param("page") Page<BusinessCapacityItemDto> page);
}