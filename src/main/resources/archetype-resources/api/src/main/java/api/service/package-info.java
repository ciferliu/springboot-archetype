#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * package: service
 * <p>
 * 存放需要对外暴露的接口定义，方便调用方使用
 * <p>
 * <blockquote>
 * 
 * <pre>
 * 
 * &${symbol_pound}64;FeignClient(name = "${parentArtifactId}")
 * public interface DemoService {
 *     &${symbol_pound}64;GetMapping("/hello")
 *     Result<String> hello(@RequestParam(required = false) String loginName);
 * }
 * 
 * </pre>
 * 
 * </blockquote>
 */
package ${package}.api.service;