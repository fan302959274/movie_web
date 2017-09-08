package com.node.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author sh00859
 * @description 实例代码
 * @date 2017/8/21
 */
@Controller
@RequestMapping("/node")
public class NodeController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static Integer count = 0;

    /**
     * 实例接口
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"/name"})
    public String getName() throws Exception {
        logger.info("处理进来了--" + count++);
        return "login";
    }


}
