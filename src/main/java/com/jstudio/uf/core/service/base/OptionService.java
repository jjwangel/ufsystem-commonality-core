package com.jstudio.uf.core.service.base;

import com.jstudio.uf.core.dao.base.SysOptionMapper;
import com.jstudio.uf.core.domain.entity.base.SysOption;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jianjiawen
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OptionService {
    private final SysOptionMapper sysOptionMapper;

    /**
     * @param id
     * @return SysOption
     */
    public SysOption findById(Integer id) {
        return this.sysOptionMapper.selectByPrimaryKey(id);
    }
}
