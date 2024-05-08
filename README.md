# Todo API

> Simple Todo API using Java, Open Liberty, and Microprofile.
> Demonstrates back-to-front features including database persistence and REST API endpoints.

## Getting started

Execute the following to bring up the Open Liberty dev server:

```shell
./mvnw liberty:dev
```

### Start a database

```shell
docker run -d --name todo-mariadb -e MARIADB_USER=todouser -e MARIADB_PASSWORD=Pa55w0rd -e MARIADB_ROOT_PASSWORD=Pa55w0rd -v todo-data:/var/lib/mysql -p 3306:3306 mariadb:11
```

Execute the [`todos-schema.sql`](./todos-schema.sql) script to create the database schema and assign permissions to the `todouser` account.

## Release and deployment

Execute the following to package the API application into a WAR:

```shell
./mvnw package
```

## Technologies

* Java 17
* Jakarta 10
* Open Liberty 23
* Microprofile 6
