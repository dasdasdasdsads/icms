package cn.xhl.icms.dao.sys.sysUser;

import cn.xhl.icms.domain.sys.IcmsSysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by xian on 2018/1/4.
 * <p>
 * This project is  icms-parent
 */
public interface IcmsSysUserDao  {

    public List<Map<String ,Object>> getSysUserListPage(Map<String ,Object> dataMap);

}
