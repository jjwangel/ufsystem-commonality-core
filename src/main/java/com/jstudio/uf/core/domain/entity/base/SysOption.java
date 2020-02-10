package com.jstudio.uf.core.domain.entity.base;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sys_option")
public class SysOption {
    /**
     * 自增
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 参数标识
     */
    @Column(name = "opt_key")
    private String optKey;

    /**
     * 参数一
     */
    private String opt1;

    /**
     * 参数二
     */
    private String opt2;

    /**
     * 参数三
     */
    private String opt3;

    /**
     * 参数四
     */
    private String opt4;

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