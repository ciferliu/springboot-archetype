#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${groupId}.common.exception.BizException;
import ${package}.core.biz.service.DemoService;

@RestController
@RequestMapping("/")
@RefreshScope
public class DemoController {

    //@Value("${symbol_dollar}{test}")
    //private String nacosConfig;

    @Autowired
    private DemoService service;

    //@GetMapping("nacos")
    //public String testNacos() {
    //    return nacosConfig;
    //}

    @GetMapping("serviceaop")
    public String testServiceAOP() {
        return service.testAOP();
    }

    @GetMapping("controlleraop")
    public String testControllerAOP() {
        throw new BizException(400, "biz exception from controller");
    }
}
