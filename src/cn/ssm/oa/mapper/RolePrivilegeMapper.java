package cn.ssm.oa.mapper;

import cn.ssm.oa.po.RolePrivilegeExample;
import cn.ssm.oa.po.RolePrivilegeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePrivilegeMapper {
    int countByExample(RolePrivilegeExample example);

    int deleteByExample(RolePrivilegeExample example);

    int deleteByPrimaryKey(RolePrivilegeKey key);

    int insert(RolePrivilegeKey record);

    int insertSelective(RolePrivilegeKey record);

    List<RolePrivilegeKey> selectByExample(RolePrivilegeExample example);

    int updateByExampleSelective(@Param("record") RolePrivilegeKey record, @Param("example") RolePrivilegeExample example);

    int updateByExample(@Param("record") RolePrivilegeKey record, @Param("example") RolePrivilegeExample example);
}