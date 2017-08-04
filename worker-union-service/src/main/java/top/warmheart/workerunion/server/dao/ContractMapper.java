package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.warmheart.server.util.dto.Page;
import top.warmheart.workerunion.server.dto.ContractDto;
import top.warmheart.workerunion.server.model.Contract;

public interface ContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    int insert(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    Contract selectByPrimaryKey(BigInteger id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    List<Contract> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Contract record);

	List<Contract> selectListSimpleItemByProjectId(BigInteger projectId);

	Integer countByFuzzy(@Param("contractDto")ContractDto contractDto);

	List<ContractDto> pageByFuzzy(@Param("contractDto")ContractDto contractDto,@Param("page") Page<ContractDto> page);

	Contract selectByCompanyAndNum(@Param("companyId")BigInteger companyId,@Param("num") String num);

	int deleteById(BigInteger id);

	ContractDto selectDetailById(BigInteger id);
}