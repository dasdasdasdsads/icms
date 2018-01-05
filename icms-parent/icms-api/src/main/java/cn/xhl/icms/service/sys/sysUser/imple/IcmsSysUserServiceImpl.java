package cn.xhl.icms.service.sys.sysUser.imple;

import cn.xhl.icms.dao.sys.sysUser.IcmsSysUserDao;
import cn.xhl.icms.service.sys.sysUser.IcmsSysUserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by xian on 2018/1/4.
 * <p>
 * This project is  icms-parent
 */
@Component("icmsSysUserService")
@Service
public class IcmsSysUserServiceImpl implements IcmsSysUserService {

    @Resource
    private IcmsSysUserDao icmsSysUserDao;


    public Map<String, Object> getIcmsSysUserListPage(Map<String, Object> dataMap) {
        Map<String ,Object> resultMap = new HashMap<String ,Object>();
        resultMap.put("rows",icmsSysUserDao.getSysUserListPage(dataMap));
        return resultMap;

    }




}
