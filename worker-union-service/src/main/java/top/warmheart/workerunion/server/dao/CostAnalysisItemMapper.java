package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;

import top.warmheart.workerunion.server.model.CostAnalysisItem;

public interface CostAnalysisItemMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table cost_analysis_item
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(BigInteger id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table cost_analysis_item
	 *
	 * @mbg.generated
	 */
	int insert(CostAnalysisItem record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table cost_analysis_item
	 *
	 * @mbg.generated
	 */
	CostAnalysisItem selectByPrimaryKey(BigInteger id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table cost_analysis_item
	 *
	 * @mbg.generated
	 */
	List<CostAnalysisItem> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table cost_analysis_item
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(CostAnalysisItem record);

	/**
	 * 获取项目下的所有成本分析项
	 * 
	 * @param projectId
	 * @return
	 */
	List<CostAnalysisItem> selectListByProjectId(BigInteger projectId);
}