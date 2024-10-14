package cn.fye.lecteste.module.member.dal.mysql.user;

import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author FYE
 */
@Mapper
public interface MemberUserMapper extends BaseMapper<MemberUserDO> {
    default MemberUserDO selectByMobile(String mobile){
        return selectOne(new QueryWrapper<MemberUserDO>().eq("mobile", mobile));
    }
}
