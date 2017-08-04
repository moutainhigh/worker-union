package top.warmheart.workerunion.server.dao;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.warmheart.workerunion.server.dto.Staff2Dto;
import top.warmheart.workerunion.server.model.ProjectApplication;

public interface ProjectApplicationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_application
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("projectId") BigInteger projectId, @Param("staffId") BigInteger staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_application
     *
     * @mbg.generated
     */
    int insert(ProjectApplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_application
     *
     * @mbg.generated
     */
    ProjectApplication selectByPrimaryKey(@Param("projectId") BigInteger projectId, @Param("staffId") BigInteger staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_application
     *
     * @mbg.generated
     */
    List<ProjectApplication> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_application
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProjectApplication record);

	List<Staff2Dto> selectListStaffByProjectId(BigInteger projectId);

	int insertUnique(@Param("projectId")BigInteger projectId,@Param("staffId") BigInteger staffId,@Param("type") String type,@Param("goingCollapseStatus") String goingCollapseStatus);

	ProjectApplication selectByProjectRole(@Param("projectId")BigInteger projectId,@Param("type") String type);

	List<ProjectApplication> selectValidByStaff(@Param("staffId")BigInteger staffId,@Param("goingCollapseStatus") String goingCollapseStatus);
}