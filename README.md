# traceLog
* 将整个调用链的参数进行追踪,日志信息如下
```log
[INFO][2020-04-22T12:49:24.609+0800][0c1fa6cefd9d486182316a50fe060a49][nio-8081-exec-3][hello.aop.LogAspect:40] 传入参数:["12222222"]
[INFO][2020-04-22T12:49:24.610+0800][0c1fa6cefd9d486182316a50fe060a49][nio-8081-exec-3][hello.aop.LogAspect:40] 传入参数:["12222222------->Controller"]
[INFO][2020-04-22T12:49:24.611+0800][0c1fa6cefd9d486182316a50fe060a49][nio-8081-exec-3][hello.aop.LogAspect:40] 传入参数:["12222222------->Controller-------->Service"]
[INFO][2020-04-22T12:49:24.612+0800][0c1fa6cefd9d486182316a50fe060a49][nio-8081-exec-3][hello.dao.TestDao:17] TestDao
[INFO][2020-04-22T12:49:24.612+0800][0c1fa6cefd9d486182316a50fe060a49][nio-8081-exec-3][hello.service.TestService:27] TestService
[INFO][2020-04-22T12:49:24.612+0800][0c1fa6cefd9d486182316a50fe060a49][nio-8081-exec-3][hello.controller.TestController:26] TestController
```
