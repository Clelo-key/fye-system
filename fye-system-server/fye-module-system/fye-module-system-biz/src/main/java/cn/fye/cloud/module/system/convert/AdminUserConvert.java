package cn.fye.cloud.module.system.convert;

import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserRespVO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserSaveReqVO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE) // 忽略未映射的属性
public interface AdminUserConvert {
    AdminUserConvert INSTANCE = Mappers.getMapper(AdminUserConvert.class);

    AdminUserDO convert(UserSaveReqVO user);

    UserRespVO ToUserRespVO(AdminUserDO user);
}
