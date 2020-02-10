package com.jstudio.uf.core.domain.entity.userinfo;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sys_authority")
public class SysAuthority {
    /**
     * 自增
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 当前节点层数
     */
    @Column(name = "curr_level")
    private Byte currLevel;

    /**
     * 是否为权限
     */
    @Column(name = "is_auth")
    private Byte auth;

    /**
     * 父节点权限id
     */
    @Column(name = "parent_id")
    private Long parentId;

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