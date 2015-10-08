The schema manin, can be created using the ddl in 'updated DB_SCRIPT-1.sql'

Also the DB_Schema_updated.mwb is the MySqlWorkbench file, to update the schema.


We also need to do these steps to use hibernate 4 on jboss 6

copy hibernate-jpa-2.1-api-1.0.0.final.jar to the following directory : jboss-as-7.1.1.Final/modules/javax/persistence/api/main

open module.xml and change the resource-root as follows :

resource-root path="hibernate-jpa-2.1-api-1.0.0.final.jar" (pointing it to jpa 2.1)

re-compile and re-deploy your app, then you are good to go