# Todo-api-springboot

Application execution with gradle

```shell
# Application execution
./gradlew bootRun

# Build & jar execution
./gradlew build
java -jar build/libs/todoapi-0.0.1-SNAPSHOT.jar
```

Todo API operation check

```shell
## add
curl http://localhost:8080/api/todoitems -XPOST \
-H 'Content-Type: application/json' \
-d '{"name": "my first item"}' | jq .

## list
curl http://localhost:8080/api/todoitems

## item detail
curl http://localhost:8080/api/todoitems/1

## delete item
curl http://localhost:8080/api/todoitems/1 -XDELETE -v

```