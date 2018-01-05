package cn.xhl.icms.service.sys.sysUser;

import cn.xhl.icms.dao.sys.sysUser.IcmsSysUserDao;
import cn.xhl.icms.domain.sys.IcmsSysUser;

import java.util.Map;

/**
 * Created by xian on 2018/1/4.
 * <p>
 * This project is  icms-parent
 */
public interface IcmsSysUserService { ;

    public Map<String ,Object>  getIcmsSysUserListPage(Map<String ,Object> dataMap) ;


}
