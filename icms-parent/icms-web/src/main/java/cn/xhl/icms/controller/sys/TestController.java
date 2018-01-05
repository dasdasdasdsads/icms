package cn.xhl.icms.controller.sys;

import cn.xhl.icms.service.sys.sysUser.IcmsSysUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by xian on 2018/1/4.
 * <p>
 * This project is  icms-parent
 */
@Controller
@RequestMapping("test")
public class TestController  {

    @Reference
    private IcmsSysUserService icmsSysUserService;

    private Map<String ,Object> dataMap;

    @RequestMapping("getSysUserListPage")
    @ResponseBody
    public Map<String ,Object> getSysUserListPage(Integer startPage,Integer pageSize){
        dataMap = new HashMap<String ,Object>();
        dataMap.put("startIndex",(startPage-1)*pageSize);
        dataMap.put("pageSize",pageSize);
        dataMap =  icmsSysUserService.getIcmsSysUserListPage(dataMap);
        return  dataMap;
    }
}
