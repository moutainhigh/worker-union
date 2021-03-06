package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;
import top.warmheart.workerunion.server.model.InternalSettlement;

public interface InternalSettlementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_settlement
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigInteger projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_settlement
     *
     * @mbg.generated
     */
    int insert(InternalSettlement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_settlement
     *
     * @mbg.generated
     */
    InternalSettlement selectByPrimaryKey(BigInteger projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_settlement
     *
     * @mbg.generated
     */
    List<InternalSettlement> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_settlement
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(InternalSettlement record);

	int replace(InternalSettlement internalSettlement);
}