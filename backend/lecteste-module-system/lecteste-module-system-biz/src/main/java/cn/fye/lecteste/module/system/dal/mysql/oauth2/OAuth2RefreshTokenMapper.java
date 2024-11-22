package cn.fye.lecteste.module.system.dal.mysql.oauth2;

import cn.fye.lecteste.module.system.dal.dataobject.oauth2.OAuth2RefreshTokenDO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OAuth2RefreshTokenMapper extends BaseMapper<OAuth2RefreshTokenDO> {
    default int deleteByRefreshToken(String refreshToken) {
        return delete(new LambdaQueryWrapper<OAuth2RefreshTokenDO>()
                .eq(OAuth2RefreshTokenDO::getRefreshToken, refreshToken));
    }

    default OAuth2RefreshTokenDO selectByRefreshToken(String refreshToken) {
        return selectOne(new LambdaQueryWrapper<OAuth2RefreshTokenDO>().eq(OAuth2RefreshTokenDO::getRefreshToken,refreshToken));
    }
}
