package cn.xhl.icms.domain.sys;

import java.io.Serializable;

/**
 * Created by xian on 2018/1/4.
 * <p>
 * This project is  icms-parent
 */
public class IcmsSysUser implements Serializable {

    private Long sysUserId;
    private String sysUserAccount;
    private String sysUserPassWord;
    private String sysUserName;
    private String status;
    private String isDete;


    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysUserAccount() {
        return sysUserAccount;
    }

    public void setSysUserAccount(String sysUserAccount) {
        this.sysUserAccount = sysUserAccount;
    }

    public String getSysUserPassWord() {
        return sysUserPassWord;
    }

    public void setSysUserPassWord(String sysUserPassWord) {
        this.sysUserPassWord = sysUserPassWord;
    }

    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDete() {
        return isDete;
    }

    public void setIsDete(String isDete) {
        this.isDete = isDete;
    }

    @Override
    public String toString() {
        return "IcmsSysUser{" +
                "sysUserId=" + sysUserId +
                ", sysUserAccount='" + sysUserAccount + '\'' +
                ", sysUserPassWord='" + sysUserPassWord + '\'' +
                ", sysUserName='" + sysUserName + '\'' +
                ", status='" + status + '\'' +
                ", isDete='" + isDete + '\'' +
                '}';
    }
}
