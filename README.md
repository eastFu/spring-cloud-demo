# spring cloud 学习笔记


# 采坑

- 1. 全链路追踪： servic-hi 接口命名不能为 info
- 2. 全链路追踪： zippa dependencies 图片不显示？
- 3. 练习过程中请使用JDK1.8+
- 4. hystrix dashboard 的无法监控？
- 5. actuator 监控模块，提供了监控rest api接口，如 /info ,/env,/metrics,/helth 等，开发接口的时候避免与这些接口冲突。
- 6. spring.profiles.active 可以指向不同的配置文件进行启动。
- 7. 权限框架的选择？
- 8. rpc调用的实现原理 
- 9. 浅谈zookeeper和eureka
- 10. 全链路追踪的原理
- 11. spring cloud 和Alibaba dubbo 的区别
- 12. spring cloud 的未来
从个人使用这么久的经验来看，微服务大势所趋，但是不代表所有项目都适合进行微服务的开发和微服务的重构~

# 技巧

多服务的健康监控
负载均衡
