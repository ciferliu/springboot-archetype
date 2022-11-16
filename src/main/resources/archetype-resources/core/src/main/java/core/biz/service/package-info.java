#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * package: service
 * <p>
 * 存放模块service实现类<br>
 * 1. 异常交由{@link ${groupId}.common.service.ServiceAdvice}进行AOP统一处理<br>
 * 2. 如要需要使用数据库事务，<strong>遵循小事务原则</strong>，即：一些耗时逻辑、参数组装等操作在外部完成，然后再交由TxManager处理
 */

package ${package}.core.biz.service;