# Quarkus rest client example

- run ./buildDocker.sh
- run ./runDocker.sh
- open a NEW terminal and run ./test.sh


Output
```
* Connected to localhost (::1) port 8080 (#0)
> GET /mytest/docs/index.html HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.75.0
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 404 Not Found
< content-length: 0
<
* Connection #0 to host localhost left intact
```
