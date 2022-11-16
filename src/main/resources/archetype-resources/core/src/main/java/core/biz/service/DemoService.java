#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.biz.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String testAOP() {
        throw new RuntimeException("unexcepted exception form service");
    }
}
