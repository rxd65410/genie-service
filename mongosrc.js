use geniedb
db.createUser(
    {
        user: "duggirala",
        pwd: "duggirala",
        roles: [
            {role: "readWrite", db: "geniedb"}
        ]
    })
db.dummmyCollection.insert({x: 1});

