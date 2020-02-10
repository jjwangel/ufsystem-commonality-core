package com.jstudio.uf.core.controller.base;

import com.jstudio.uf.core.domain.entity.base.SysOption;
import com.jstudio.uf.core.service.base.OptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jianjiawen
 */
@RestController
@RequestMapping("/base")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class OptionController {
    private final OptionService optionService;

    /**
     * @param id
     * @return SysOption
     */
    @GetMapping("/option/{id}")
    public SysOption findById(@PathVariable Integer id) {
        return this.optionService.findById(id);
    }
}
