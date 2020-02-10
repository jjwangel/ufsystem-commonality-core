package com.jstudio.uf.core.domain.entity.userinfo;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sys_user")
public class SysUser {
    /**
     * 自增
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 登录账号
     */
    @Column(name = "login_id")
    private String loginId;

    /**
     * 密码
     */
    private String password;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}