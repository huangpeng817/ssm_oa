package cn.ssm.oa.mapper;

import cn.ssm.oa.po.Forum;
import cn.ssm.oa.po.ForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumMapper {
    int countByExample(ForumExample example);

    int deleteByExample(ForumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Forum record);

    int insertSelective(Forum record);

    List<Forum> selectByExample(ForumExample example);

    Forum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKey(Forum record);
}