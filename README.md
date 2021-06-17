# Quarkus static resources

- Build the native container running ./buildDocker.sh
- Run the container with the script ./runDocker.sh
- Open a NEW terminal and execute ./test.sh

The output will be 
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
```

Switching the dependencies `quarkus-resteasy-reactive` and `quarkus-resteasy-reactive-jackson` to `quarkus-resteasy` and `quarkus-resteasy-jackson` it will work as expected.
To Verify check this branch: https://github.com/fabry00/quarkus-static-resources-test/tree/working

