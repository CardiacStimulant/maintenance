# maintenance
一个简单的spring boot项目。
这是一个运维管理的项目，其中主要包含了用户，角色，资源权限的管理。
可以扩展其他的需要运维管理的功能，比如说：号码管理，企业管理等等

# 资源目录
包含了创建数据库的脚本，settings.xml文件

# com.maintenance.context.WebAppConfig
CORSInterceptor：跨域拦截器
ResponseResultInterceptor：controller返回包装拦截器
XssFilter：防止XSS攻击的filter

# com.maintenance.context.response.ResponseResultHandler
controller增强器，统一包装返回体和异常