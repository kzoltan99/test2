[employees Sample Database](https://dev.mysql.com/doc/employee/en/employees-preface.html)

Script downloads the required SQL dump files from GitHub into the sql_dump directory if it does not exist. 
The size of the dump files and the sample database is about 160MB. 
The script always downloads the dump files if it is necessary.
On the other hand the dump files will be always imported which takes some time. 

Connection

    - Host: localhost 127.0.0.1
    - Port: 3306
    - User: root
    - Pass: secret  see $MYSQL_ROOT_PASSWORD
    - DB: employees



    if [ $1 == "bash" ]
then
    docker exec -it sakila bash
    exit 0
fi

if [ $1 == "cli" ]
then
    docker exec -it sakila mysql -u root -p secret
    exit 0
fi


if [ $1 == "stop" ]
then
    docker stop sakila
    docker container rm sakila
    exit 0
fi

if [ $1 == "start" ]
then

    docker run \
     --detach \
     --name sakila \
     --publish 3306:3306 \
     --volume $(pwd): /home/mysql \
     --env MYSQL_ROOT_PASSWORD= secret \
     mysql:8

    try=0
    until docker exec sakila mysql -u root -p secret -e ";" 1>/dev/null 2>/dev/null;
    do
        printf "Connection Refused #%d time\n" $try
        try=$(expr $try + 1)
        sleep 5s
        if [ $try -ge 10 ]
        then
            printf "Too many unsuccessful connection attempts!\n"
            exit 1
        fi
    done
    printf "Successfull Connection\n"
    printf "Importing Data...\n"

    docker exec sakila sh -c "mysql -u root -p secret < home/mysql/sakila-schema.sql 2>/dev/null"
    docker exec sakila sh -c "mysql -u root -p secret < home/mysql/sakila-data.sql 2>/dev/null"

    printf "Data was imported!\n"

    exit 0
fi
