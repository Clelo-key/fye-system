package cn.fye.lecteste.module.system.dal.mysql.oauth2;

import cn.fye.lecteste.module.system.dal.dataobject.oauth2.OAuth2AccessTokenDO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author FYE
 */
@Mapper
public interface OAuth2AccessTokenMapper extends BaseMapper<OAuth2AccessTokenDO> {
//    default OAuth2AccessTokenDO selectByAccessToken(String accessToken) {
//        return selectOne(new QueryWrapper<>().eq(), accessToken);
//    }

}
