package cn.fye.lecteste.module.member.convert.user;

import cn.fye.lecteste.module.member.api.user.dto.MemberUserRespDTO;
import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author FYE
 */
@Mapper
public interface MemberUserConvert {
    MemberUserConvert INSTANCE = Mappers.getMapper(MemberUserConvert.class);
    MemberUserRespDTO convert2(MemberUserDO bean);
}
