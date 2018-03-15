# taller-soa-eai

## Integrantes
- Edwin Moreno Cristancho
- Juan Felipe Castellanos Arias
- Frank Jaider Rodriguez Barreto

## ¿Como ejecutar el proyecto java?
- Se realiza la clonación del repositorio 
- La carpeta wsdl contenida en la ruta src/main/resources/wsdl se debe copiar en la siguiente ruta: /opt/soa/esb/jboss-fuse-6.3.0.redhat-187/deploy/ 
- Desde una terminal, ingresamos a la carpeta principal del proyecto donde se visualiza el pom.xml y se ejecuta el siguiente comando:
''
mvn clean install && rm -rf /opt/soa/esb/jboss-fuse-6.3.0.redhat-187/deploy/taller-soa-eai-0.0.1-SNAPSHOT.jar && cp target/taller-soa-eai-0.0.1-SNAPSHOT.jar /opt/soa/esb/jboss-fuse-6.3.0.redhat-187/deploy/
''
- Y así queda configurado el fuse con el jar dado para solucionar el taller de integración.


### Nota
- El proceso de FUSE, RabbitMQ y el Sandobox deben estar en ejecución
